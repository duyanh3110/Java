package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Danske Bank");

	    if(bank.addBranch("Helsinki")) {
            System.out.println("Helsinki branch created.");
        }

	    bank.addBranch("Helsinki");
	    bank.addCustomer("Helsinki","Tim", 50.5);
	    bank.addCustomer("Helsinki","Mike", 175.34);
	    bank.addCustomer("Helsinki","Percy", 220.12);

	    bank.addBranch("Oulu");
        bank.addCustomer("Oulu","Bob", 150.54);

        bank.addCustomerTransaction("Helsinki", "Tim", 44.22);
        bank.addCustomerTransaction("Helsinki", "Tim", 12.44);
        bank.addCustomerTransaction("Helsinki", "Mike", 1.65);

        bank.listCustomers("Helsinki", true);
        bank.listCustomers("Oulu", true);

        bank.addBranch("Vaasa");

        if (!bank.addCustomer("Vaasa", "Brian", 5.53)) {
            System.out.println("Error Vaasa does not exist");
        }

        if(!bank.addBranch("Helsinki")) {
            System.out.println("Branch Helsinki already exist");
        }
    }
}
