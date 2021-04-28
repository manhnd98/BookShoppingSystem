package com.bookshop;


import com.entity.Book;
import com.entity.Cart;
import com.entity.Customer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initializing ....");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Cart> carts = new ArrayList<Cart>();

        System.out.println("Connecting to database ...");

    }

    public static void menu() {
        System.out.println("\n 1.	Add the braches list");
        System.out.println(" 2.	Edit the braches list");
        System.out.println(" 3.	Remote the braches list");
        System.out.println(" 4.	Add the customers list");
        System.out.println(" 5.	Edit the customers list");
        System.out.println(" 6.	Remote the customers list");
        System.out.println(" 7.	Open an account for a customer");
        System.out.println(" 8.	Display balance, Deposit/withdraw money for a customer account");
        System.out.println(" 9.	Exit and save current data to file");
        System.out.print(" Enter your choice: ");
    }
}
