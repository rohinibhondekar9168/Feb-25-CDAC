//Array of object
class Student{
    int id;
	String name; // iska access within constructor hai block 


    //set value for name instance variable
   //CONSTRUCTOR : Parameterized constructor
   
    Student(int id,String n){ //instance variable = parameter
         this.id=id;
        this.name = n; // current instance ko label krne ke liye this instance keyword use krte hai..this keyword access current instance variable
	
    }
}

class ArrayDemo9{
    public static void main(String[]args){
		
      //Student s1 = new Student("Rohini"); // Instance variable reference
	  
	  Student[] s1 = new Student[3]; // created new array
	    s1[0]=new Student(111,"Rohini");
	    s1[1]=new Student(112,"Ashwini");
	    s1[2]=new Student(113,"Usha");
				
			for(Student s : s1) // access the values using for each loop
				{
					System.out.println(s.id+" "+s.name);
				}
	  

    }
}

/*  Output: 
PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> javac  ArrayDemo9.java
PS D:\CDAC\Core_Java_Kiran_Maam\Day_05\Code_Practice> java ArrayDemo9
111 Rohini
112 Ashwini
113 Usha */
