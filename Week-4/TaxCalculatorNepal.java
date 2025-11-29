import java.util.Scanner;
/**
 *  * Write a description of class Operator here.
 *  
 * @author (your name)
 * @version (a version number or a date)
 */
 
public class TaxCalculatorNepal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nepal Income Tax Calculator (for Single Taxpayers)");
        System.out.print("Enter your annual income in NPR: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income > 500000) {
            tax += 500000 * 0.01;
        } else {
            tax += income * 0.01;
        }

        if (income > 500000 && income <= 700000) {
            tax += (income - 500000) * 0.10;
        } else if (income > 700000) {
            tax += 200000 * 0.10;
        }

        if (income > 700000 && income <= 1000000) {
            tax += (income - 700000) * 0.20;
        } else if (income > 1000000) {
            tax += 300000 * 0.20;
        }

        if (income > 1000000 && income <= 2000000) {
            tax += (income - 1000000) * 0.30;
        } else if (income > 2000000) {
            tax += 1000000 * 0.30;
        }

        if (income > 2000000 && income <= 5000000) {
            tax += (income - 2000000) * 0.36;
        } else if (income > 5000000) {
            tax += 3000000 * 0.36;
        }

        if (income > 5000000) {
            tax += (income - 5000000) * 0.39;
        }

        System.out.println("Total income tax: NPR " + tax);
        System.out.println("Income after tax: NPR " + (income - tax));
    }
}
