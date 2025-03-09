public class Q21 {
    public static void main(String[] args) {
        int num = 10;
        num = -~num; // Increment using bitwise NOT  -(num + 1).
        System.out.println("Incremented Value: " + num); //11
    }
}

