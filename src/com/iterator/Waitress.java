package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList menus;

    public void printMenu() {
        Iterator menusIterator = menus.iterator();
        while (menusIterator.hasNext()) {
            IMenu menu = (IMenu) menusIterator.next();
            Iterator menuIterator = menu.createIterator();
            printMenu(menuIterator);
        }
//        Iterator dinerMenuIterator = dinerMenu.createIterator();
//        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
//        Iterator cafeMenuIterator = cafeMenu.createIterator();
//        System.out.println("MENU \n------\n BREAKFAST");
//        printMenu(dinerMenuIterator);
//        System.out.println("\n------\nLUNCH");
//        printMenu(pancakeHouseMenuIterator);
//        System.out.println("\n------\nDiner");
//        printMenu(cafeMenuIterator);
    }

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.print(menuItem.getDescription());
        }
    }
}
