// H.
class Employee1 {

    // Instance variables
    int id;
    String emp_name;
    double emp_sal;
    String emp_address;
    long phone_no;

    // Default constructor
    Employee1() {
        this.id = 101;
        this.emp_name = "Rohini";
        this.emp_sal = 60000.0;
        this.emp_address = "Ambarnath";
        this.phone_no = 9168173456L; // Append 'L' for long value
    }

    // Parameterized constructor
    Employee1(int id, String emp_name, double emp_sal, String emp_address, long phone_no) {
        this.id = id; 
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
        this.emp_address = emp_address;
        this.phone_no = phone_no;

        System.out.println("Parameterized Constructor: " + id + ", " + emp_name + ", " + emp_sal + ", " + emp_address + ", " + phone_no);
    }

    // Display method
    void display() {
        System.out.println("Employee Details: " + id + ", " + emp_name + ", " + emp_sal + ", " + emp_address + ", " + phone_no);
    }

    // Static method
    static void show() {
        System.out.println("This is a static method.");
    }

    // Main method to test
	
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(); // Calls default constructor
        emp1.display();

        Employee1 emp2 = new Employee1(102, "John", 75000.0, "Mumbai", 9876543210L); // Calls parameterized constructor
        //emp2.display();

        Employee1.show(); // Calling static method
    }
}

/*Output:

PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> javac Employee1.java
PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> java Employee1
Employee Details: 101, Rohini, 60000.0, Ambarnath, 9168173456
Parameterized Constructor: 102, John, 75000.0, Mumbai, 9876543210
This is a static method.*/
