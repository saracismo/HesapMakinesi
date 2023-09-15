import java.util.Scanner;

public class HesapMakinesiOdevi {
    public static void main(String[] args) {
        int sayi1, sayi2, select ;

        Scanner input = new Scanner(System.in);
        System.out.print(" İlk Sayıyı Giriniz  : " );
        sayi1 = input.nextInt();
        System.out.print(" İkinci Sayıyı Giriniz  : " );
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();



        switch (select) {
            case 1 :
                System.out.println("Toplam : " + (sayi1 + sayi2) );
                break;
            case 2 :
                System.out.println("Toplam : " + (sayi1 - sayi2) );
                break;
            case 3 :
                System.out.println("Toplam : " + (sayi1 * sayi2) );
                break;
            case 4 :
                System.out.println("Toplam : " + (sayi1 / sayi2) );
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.");
        }






    }
}

