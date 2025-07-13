package bill;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------Welcome to Pizzamania------------------------------------------------");
        System.out.println("which pizza: (1.Veg Pizza  2.Non-Veg Pizza  3.Delux Veg Pizza  4.Delux Non-veg Pizza ) ===> ");
        int choice = sc.nextInt();
        Pizza pizza;

        switch (choice) {
            case 1:
                pizza = new Pizza(true);
                break;
            case 2:
                pizza = new Pizza(false);
                break;
            case 3:
                pizza = new DeluxPizza(true);
                break;
            case 4:
                pizza = new DeluxPizza(false);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (!(pizza instanceof DeluxPizza)) {
            System.out.println("Want Extra Topping (y/n)? => ");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') pizza.addExtraToppings();

            System.out.println("Extra cheese (y/n)? => ");
            ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') pizza.addExtraCheese();
        }

        System.out.println("Want TakeAway (y/n)? => ");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') pizza.addTakeaway();

        pizza.getBill();
        sc.close();
    }
}
