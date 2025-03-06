class Lightbulb {
    static boolean isOn; // Static variable to track bulb status (true = ON, false = OFF)

    // Method to switch on the bulb
    void switchOn() {
        isOn = true;
        System.out.println("Lightbulb is switched ON.");
    }

    // Method to switch off the bulb
    void switchOff() {
        isOn = false;
        System.out.println("Lightbulb is switched OFF.");
    }
    }

    // Method to check if the bulb is ON
    void checkStatus() {
        if (isOn) {
            System.out.println("The lightbulb is ON.");
        } else {
            System.out.println("The lightbulb is OFF.");
        }
    }

    public static void main(String[] args) {
        Lightbulb bulb1 = new Lightbulb(); // Creating an object
        Lightbulb bulb2 = new Lightbulb(); // Another object to show static behavior

        bulb1.checkStatus(); // Initially OFF
        bulb1.switchOn(); // Turn ON the bulb
        bulb2.checkStatus(); // Since isOn is static, it affects all instances
        bulb2.switchOff(); // Turn OFF using another object
        bulb1.checkStatus(); // Checking status again
    }
}
