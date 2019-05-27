package com.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements IMenu {
    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();

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
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
