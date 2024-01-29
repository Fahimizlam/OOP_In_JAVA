import java.util.Scanner;

public class jian {
    public static void  main(String[] args) {

        int n,m;
        System.out.print("Enter one numbers");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        m=r.nextInt();
        int aum = calculateSum(n);
        System.out.println("Sum: " + aum);
        int sum = addNumbers(n, m);
        System.out.println("Sum: " + sum);
        int mum = minusNumbers(n, m);
        System.out.println("mum: " + mum);
        int gum = gunNumbers(n, m);
        System.out.println("gum: " + gum);
        int vum = vagNumbers(n, m);
        System.out.println("vum: " + vum);
        int bum = calculateSum(m);
        System.out.println("Sum: " + bum);
    }


    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 1) {
            sum = sum + i;
        }

        return sum;
    }


    public static int addNumbers(int a, int b) {
            return a + b;
    }

    public static int minusNumbers(int n, int m) {
        return n - m;
    }
    public static int gunNumbers(int a, int b) {
        return a * b;
    }
    public static int vagNumbers(int n, int m) {
        return n / m;
    }
}