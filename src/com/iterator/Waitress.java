package com.iterator;

public class Waitress {
    DinerMenu dinerMenu;

    public void printMenu() {
        IIterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU \n------\n BREAKFAST");
        printMenu(dinerMenuIterator);
        System.out.println("LUNCH");
    }

    public Waitress(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }

    private void printMenu(IIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.print(menuItem.getDescription());
        }
    }
}
