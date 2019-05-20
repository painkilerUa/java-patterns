import com.iterator.DinerMenu;
import com.iterator.Waitress;

public class Test {
    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
