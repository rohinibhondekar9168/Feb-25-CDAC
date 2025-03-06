class StaticDemo {
    
    static int x = 10; // Static variable
    static int y = 20; // Static variable
    int z = 30; // Instance variable

    void show() { // Instance method
        System.out.println(x); // 10
        System.out.println(z); // 30
    }

    static void show1() { // Static method
        int m = 5; // Local variable
        x = 20; // Modifying static variable
        System.out.println(m); // 5
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        s1.show(); // 10 30 Calls instance method

        show1(); // 5 // Calls static method (can be called directly in static context)
       // StaticDemo.show1();// 5 // Recommended way to call a static method
    }
}

//Output:
10
30
5