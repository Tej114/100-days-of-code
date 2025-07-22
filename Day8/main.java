import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int positive = 0, negative = 0, zeros = 0, even = 0, odd = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();

            if (num[i] > 0)
                positive++;
            else if (num[i] < 0)
                negative++;
            else
                zeros++;
            if (num[i] != 0) {
                if (num[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of zeros: " + zeros);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}
