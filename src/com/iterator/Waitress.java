package com.iterator;

public class Waitress {
    public void printMenu() {
        System.out.println("MENU \n------\n BREAKFAST");
        printMenu();
        System.out.println("LUNCH");
    }
    private void printMenu(Iterator iterator) {

    }
}
