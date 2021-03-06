package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements IMenu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("First dish",
                "Fist description",
                false,
                10.52);

        addItem("Second dish",
                "Second description",
                true,
                5.52);

        addItem("Third dish",
                "Third description",
                false,
                1.52);
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator () {
        return menuItems.iterator();
    }
}
