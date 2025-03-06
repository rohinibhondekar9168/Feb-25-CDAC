class BankAccount {
    int balance; 
    int deposit;
    int withdraw;

    // Constructor to initialize values
    BankAccount(int b, int d, int w) {
        balance = b;
        deposit = d;
        withdraw = w;
    }

    // Method to display values
    void show() {
        System.out.println("Balance: " + balance);
        System.out.println("Deposit: " + deposit);
        System.out.println("Withdraw: " + withdraw);
    }

    public static void main(String[] args) {
        // Creating an object with parameters
      BankAccount b1 = new BankAccount(234667, 67776, 25465);
	  BankAccount b2 = new BankAccount(24565, 67546, 234465);
        b1.show(); // Calling the method to display values
	    b2.show();
    }
	
}
/*
Output:

Balance: 234667
Deposit: 67776
Withdraw: 25465
..............
*/