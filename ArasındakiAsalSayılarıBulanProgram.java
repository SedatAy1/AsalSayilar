import java.util.Scanner;

public class ArasındakiAsalSayılarıBulanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1 - 100 arasındaki asal sayılar: ");

        for (int i = 2; i > 1 && i < 100; i++) {
            Boolean sonuc = true;

            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    sonuc = false;
                    break;
                }
            }
            if (sonuc) {
                System.out.print(i + " ");

            }
        }

    }
}
