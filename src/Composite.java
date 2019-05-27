import com.composite.*;

public class Composite {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
            new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
            new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
            new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESERT MENU", "esert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple pie",
                "Apple pie description",
                false,
                10.52
        ));

        allMenus.add(dinerMenu);


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
