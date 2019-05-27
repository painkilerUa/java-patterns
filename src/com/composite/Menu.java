package com.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void print() {
        System.out.println("/n " + getName());
        System.out.println("/n " + getDescription());
        System.out.println("---------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
}
