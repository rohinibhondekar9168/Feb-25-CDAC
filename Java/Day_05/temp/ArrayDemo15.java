// H.W Employee Management System using array

class Employee2 {
    // Instance variables
    int id;
    String emp_name;
    double emp_sal;
    String emp_address;
    long phone_no;
	
	    // Parameterized constructor
    Employee2(int id, String emp_name, double emp_sal, String emp_address, long phone_no) {
        this.id = id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
        this.emp_address = emp_address;
        this.phone_no = phone_no;
    }
}

class ArrayDemo15{

    public static void main(String[] args){
	
	Employee2[] e2= new Employee2[15];
	
e2[0]  = new Employee2(101, "Rohini", 60000.0, "Ambarnath", 9168173456L);
e2[1]  = new Employee2(102, "John", 75000.0, "Mumbai", 9876543210L);
e2[2]  = new Employee2(103, "Priya", 55000.0, "Pune", 9123456789L);
e2[3]  = new Employee2(104, "Amit", 80000.0, "Delhi", 9786543210L);
e2[4]  = new Employee2(105, "Neha", 65000.0, "Bangalore", 9345678901L);
e2[5]  = new Employee2(106, "Raj", 72000.0, "Hyderabad", 9456789012L);
e2[6]  = new Employee2(107, "Simran", 58000.0, "Chennai", 9567890123L);
e2[7]  = new Employee2(108, "Arun", 90000.0, "Kolkata", 9678901234L);
e2[8]  = new Employee2(109, "Meera", 62000.0, "Nagpur", 9789012345L);
e2[9]  = new Employee2(110, "Vikas", 87000.0, "Jaipur", 9890123456L);
e2[10] = new Employee2(111, "Anjali", 53000.0, "Indore", 9901234567L);
e2[11] = new Employee2(112, "Suresh", 76000.0, "Lucknow", 9012345678L);
e2[12] = new Employee2(113, "Pooja", 61000.0, "Patna", 9123456780L);
e2[13] = new Employee2(114, "Rahul", 79000.0, "Bhopal", 9234567890L);
e2[14] = new Employee2(115, "Kiran", 84000.0, "Chandigarh", 9345678902L);


for(Employee2 e : e2)
{
	System.out.println(e.id+ "," +e.emp_name+ "," +e.emp_sal+ ","+e.emp_address+ ","+e.phone_no);
}
}
}

/*Output:

PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> javac  ArrayDemo15.java
PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> java ArrayDemo15
101,Rohini,60000.0,Ambarnath,9168173456
102,John,75000.0,Mumbai,9876543210
103,Priya,55000.0,Pune,9123456789
104,Amit,80000.0,Delhi,9786543210
105,Neha,65000.0,Bangalore,9345678901
106,Raj,72000.0,Hyderabad,9456789012
107,Simran,58000.0,Chennai,9567890123
108,Arun,90000.0,Kolkata,9678901234
109,Meera,62000.0,Nagpur,9789012345
110,Vikas,87000.0,Jaipur,9890123456
111,Anjali,53000.0,Indore,9901234567
112,Suresh,76000.0,Lucknow,9012345678
113,Pooja,61000.0,Patna,9123456780
114,Rahul,79000.0,Bhopal,9234567890
115,Kiran,84000.0,Chandigarh,9345678902
*/
