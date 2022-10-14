import java.util.Scanner;

public class hesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam : " + result);
        return result;
    }

    static int minos(int a, int b) {
        int result = a - b;
        System.out.println("cikarma sonucu: " + result);
        return result;
    }

    static int cross(int a, int b) {
        int result = a * b;
        System.out.println("carpma sonucu : " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0 && b < a) {
            System.out.println("ikinci sayi 0'dan farkli olmalidir.");
            return 0;
        }
        int result = a / b;
        System.out.println("bolme sonucu : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static void calculate(int a, int b) {
        int cevre = 2 * (a + b);
        System.out.println("cevre hesabi : " + cevre);

        int alan = a * b;
        System.out.println("dikdortgenin alanı : " + alan);
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama islem\n" +
                "2- cikarma islemi\n" +
                "3- carpma islemi\n" +
                "4- bolme islemi\n" +
                "5- uslu sayi hesaplama\n" +
                "6- mod alma\n" +
                "7- dikdortgen alan ve cevre hesabi\n" +
                "0- cikis\n ";

        System.out.println(menu);

        while (true) {

            System.out.println("bir islem seciniz : ");
            select = Scan.nextByte();

            if (select == 0) {
                break;
            }
            System.out.println("lutfen bir sayi seciniz : ");
            int a = Scan.nextInt();

            System.out.println("lutfen bir sayi daha seciniz : ");
            int b = Scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minos(a, b);
                    break;
                case 3:
                    cross(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    System.out.println("us islem sonuc : " + power(a, b));
                    break;
                case 6:
                    System.out.println("mod alma sonucu : " + mod(a, b));
                    break;
                case 7:
                    calculate(a, b);
                    break;
                default:
                    System.out.println("gecersiz bir işlem yaptiniz :");

            }
        }
        while (select != 0) {

        }
        System.out.println("gule gule !!!");
    }
}