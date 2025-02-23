public class Q21 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            num = 1;
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print(num);
                else
                    System.out.print(num + "*");
                num += 2;
            }
            System.out.println();
        }
    }
}

