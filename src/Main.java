//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ShipCalculator {
    public static void main(String[] args) {
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of the item: ");
        itemPrice = input.nextDouble();

        if (itemPrice >= 100.00) {
            shippingCost = 0.00;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        totalCost = itemPrice + shippingCost;
    }
}
