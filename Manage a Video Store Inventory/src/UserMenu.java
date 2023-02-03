import java.util.Scanner;

public class UserMenu {
    private int user_choice;
    Mo

    public void menu_output()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Add a movie to the inventory");
        System.out.print("2. Remove a movie from the inventory");
        System.out.print("3. Display the information for a movie ");
        System.out.print("4. Display the inventory in a table ");
        System.out.println("5. Quit");
        user_choice = in.nextInt();


    }


    // needs to now interact with main or the other classes in
    // order to perform functions
}
