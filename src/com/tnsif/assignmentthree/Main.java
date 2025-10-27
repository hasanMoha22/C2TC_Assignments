package com.tnsif.assignmentthree;
public class Main {
	public static void main(String[] args) {
        // Create accounts
        SavingsAccount Savings = new SavingsAccount("Sathish", 5000);
        CheckingAccount checking = new CheckingAccount("Kumar", 3000);

        // Create a Transaction object
        Transaction t = new Transaction();

        // Perform transactions
        t.performTransaction(Savings, "deposit", 1000);
        t.performTransaction(checking, "withdraw", 500);

        // Display total accounts
        System.out.println("Total Bank Accounts: " + bank.getTotalAccounts());
    }
}
