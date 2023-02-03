import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserMenu menu = new UserMenu();
        menu.menu_output();
        for(int i = 0; i < 5; i++)
        {
            menu.menu_output();

        }

    }
}