
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

        // Print earned amounts using printf

        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%.2f%n", (double) bubblegum);
        System.out.printf("Toffee: $%.2f%n", toffee);
        System.out.printf("Ice cream: $%.2f%n", (double) iceCream);
        System.out.printf("Milk chocolate: $%.2f%n", (double) milkChocolate);
        System.out.printf("Doughnut: $%.2f%n", doughnut);
        System.out.printf("Pancake: $%.2f%n", pancake);
        
        System.out.printf("Income: $%.2f%n", income);


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
