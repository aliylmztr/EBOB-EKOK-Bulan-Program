import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1;
        System.out.print("Küçük olan sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("Büyük olan sayıyı giriniz : ");
        n2 = input.nextInt();

        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("ebob("+ n1 +","+ n2 +") = " + ebob);

        int j = 1;
        while (j <= (n1 * n2)) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("ekok("+ n1 +","+ n2 +") = " + ekok);

    }
}
