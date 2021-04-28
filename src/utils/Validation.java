/**
 *
 */
package utils;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Book;
import entity.Cart;
import entity.Customer;

/**
 * @author Đỗ Văn Công
 *
 */
public class Validation {
    private final static Scanner in = new Scanner(System.in);

    // check input number limit
    public static int checkInputIntLimit(int min, int max) {
        // loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    // check input string
    public static String checkInputString() {
        // loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    // check input double
    public static double checkInputDouble() {
        // loop until user input correct
        while (true) {
            try {
                String result = in.nextLine().trim();
                double balance = Double.parseDouble(result);
                return balance;
            } catch (NumberFormatException e) {
                continue;
            }
        }
    }

    // check id and exist of Branch
    public static boolean checkIdExistBranch(ArrayList<Branch> ls, String id) {
        for (Branch branch : ls) {
            if (id.equalsIgnoreCase(branch.getBranchID())) {
                return true;
            }
        }
        return false;
    }

    // check id and exist of Customer
    public static boolean checkIdExistCustomer(ArrayList<Customer> ls, String id) {
        for (Customer customer : ls) {
            if (id.equalsIgnoreCase(customer.getCustomerID())) {
                return true;
            }
        }
        return false;
    }

    // check id and exist of Account
    public static boolean checkIdExistAccount(ArrayList<Account> ls, String id) {
        for (Account account : ls) {
            if (id.equalsIgnoreCase(account.getAccountID())) {
                return true;
            }
        }
        return false;
    }

}