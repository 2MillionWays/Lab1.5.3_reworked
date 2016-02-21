package ross.goncharuk;

public class Main {
    public static void main(String[] args) {

        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("-----------------------");

        int n = 9;
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = i; j <= n; j += i) {
                System.out.print(j + " ");
            }
            System.out.println();
            n+=9;
        }
    }
}