package com.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int nubmerOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("First diner dish",
                "Fist diner description",
                false,
                10.52);

        addItem("Second diner dish",
                "Second diner description",
                true,
                5.52);

        addItem("Third diner dish",
                "Third diner description",
                false,
                1.52);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        if (nubmerOfItems >= MAX_ITEMS) {
            System.err.println("Sorry to much menu items");
        } else {
            menuItems[nubmerOfItems] = menuItem;
            nubmerOfItems = nubmerOfItems + 1;
        }

    }

    public IIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
