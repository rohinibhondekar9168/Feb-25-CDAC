//5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals (constants)in Java.

class Q5{
    public static void main(String[] args) {
        // Integer literals in different number systems
        int binaryNum = 0b1010;   // Binary (prefix 0b or 0B) → Decimal 10
        int octalNum = 0123;      // Octal (prefix 0) → Decimal 83
        int hexNum = 0x1A3;       // Hexadecimal (prefix 0x or 0X) → Decimal 419

        // Floating-point literals
        float floatNum = 10.5f;   // 'f' or 'F' is required for float
        double doubleNum = 99.99; // Default is double
        double scientificNum = 1.23e4; // Scientific notation (1.23 × 10^4) → 12300.0

        // Displaying values
        System.out.println("Binary literal (0b1010) = " + binaryNum);
        System.out.println("Octal literal (0123) = " + octalNum);
        System.out.println("Hexadecimal literal (0x1A3) = " + hexNum);
        System.out.println("Float literal (10.5f) = " + floatNum);
        System.out.println("Double literal (99.99) = " + doubleNum);
        System.out.println("Scientific notation (1.23e4) = " + scientificNum);
    }
}
