
package calculator;

import java.util.Scanner;  // Import should come after the package declaration

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Use double for all monetary values
        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;

        double milkChocolate = 1680;
        double doughnut = 1075;
        double pancake = 80;

        // Sum up all income
        double income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        // Print earned amounts
        System.out.println("Earned amount: ");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
        System.out.println("Income: $" + income);

        // Input for expenses
        System.out.println("Staff expenses: ");
        double staffExpenses = scanner.nextDouble();  // Use double for expenses

        System.out.println("Other expenses: ");
        double otherExpenses = scanner.nextDouble();  // Use double for expenses

        // Calculate net income
        double netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%.2f", netIncome);  // Use %.2f for proper money formatting

    }
}
