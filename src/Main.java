/**
 * This project aims to create a simple personal expenses management system,
 * where the user enters his data and then can perform actions of expenses
 * or income which the program will make the respective calculations.
 *
 * @author Kemil Beltre
 * @version 1.0
 * @since 2020
 */

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static String name;
    private static int age = 0;
    private static String dni;
    private static int choice;
    private static String desc;
    private static double amount;
    private static User user;
    private static Account account = new Account(user);

    public static void main(String[] args) {
        enterUser();
        while (true) {
            menu();
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    enterExpense();
                    break;
                case 2:
                    enterIncome();
                    break;
                case 3:
                    showExpense();
                    break;
                case 4:
                    showIncome();
                    break;
                case 5:
                    System.out.println("The current account balance is : " + account.getBalance());
                    break;
                case 0:
                    System.out.println("End of the programme.");
                    System.out.println("Thank you for using the application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("YOU MUST ENTER AN OPTION CORRESPONDING TO THE FOLLOWING MENU");
                    break;

            }
        }

    }

    public static void menu() {
        System.out.println("Perform a new action");
        System.out.println("1. Introduces a new expenditure");
        System.out.println("2. Introduces new income");
        System.out.println("3. Show expenses");
        System.out.println("4. Show revenues");
        System.out.println("5. Show balance");
        System.out.println("0. Exit");
    }

    public static void enterUser() {
        System.out.println("Introduces your user name: ");
        name = scanner.nextLine();
        System.out.println("Introduces your age: ");
        age = scanner.nextInt();
        System.out.println("Introduces your ID: ");
        scanner = new Scanner(System.in);
        dni = scanner.nextLine();

        createUser();
        while (user.setDNI(dni) == false) {
            System.out.println("Incorrectly entered ID card");
            System.out.println("Try valid user ID (Example:12345678A): ");
            scanner = new Scanner(System.in);
            dni = scanner.nextLine();
        }
        System.out.println("User created correctly");

    }

    private static void createUser() {
        user = new User();
        user.setName(name);
        user.setAge(age);
        user.setDNI(dni);
    }

    private static void enterExpense() {
        System.out.println("Introduces the description");
        scanner = new Scanner(System.in);
        desc = scanner.nextLine();
        System.out.println("Introduces the amount");
        scanner = new Scanner(System.in);
        amount = scanner.nextDouble();
        Expense exepense = new Expense(amount, desc);
        try {
            account.addExpenses(desc, amount);
        } catch (ExpenseException ex) {
            System.out.println(ex);
        }

    }

    private static void enterIncome() {
        System.out.println("Introduces the description");
        scanner = new Scanner(System.in);
        desc = scanner.nextLine();
        System.out.println("Introduces the amount");
        scanner = new Scanner(System.in);
        amount = scanner.nextDouble();
        Income income = new Income(amount, desc);
        account.addIncomes(desc, amount);

    }

    private static void showExpense() {
        if (account.getExpenses().isEmpty()) {
            System.out.println("There are no expense movements");
        } else {
            Iterator iterator = account.getExpenses().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    private static void showIncome() {
        if (account.getIncomes().isEmpty()) {
            System.out.println("There are no income movements");
        } else {
            Iterator iterator = account.getIncomes().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}
