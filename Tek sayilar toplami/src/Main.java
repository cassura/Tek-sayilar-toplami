
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner inp= new Scanner(System.in);

        do {
            System.out.println("Sayıları giriniz:");
            n = inp.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total = total + n;
            }
        } while (n % 2 != 1);
        System.out.println("toplam değer:"+total);
    }
}