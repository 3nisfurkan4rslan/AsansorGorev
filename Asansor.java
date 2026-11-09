import java.util.Scanner;

public class Asansor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Katsayi = 10;

        System.out.println("Merhaba, hangi kata cikmak istersin?");
        int hedefkat = sc.nextInt();

        if (hedefkat > Katsayi || hedefkat <= 0) {
            System.out.println("Gecersiz bir kat sectiniz, lutfen gercek anlamda sizi goturebilecegimiz bir kat seciniz.");
        } 
        else {
            System.out.println("Su an hangi kattasiniz?");
            int mkat = sc.nextInt();

            if (mkat > Katsayi || mkat <= 0) {
                System.out.println("Geçersiz mevcut kat seçtiniz!");
            } 
            else {
                int mesafe = 0;

                if (hedefkat < mkat) {
                    mesafe = mkat - hedefkat;
                    System.out.println(mesafe + " kat asagi inmeniz gerekmektedir.");
                } else if (hedefkat > mkat) {
                    mesafe = hedefkat - mkat;
                    System.out.println(mesafe + " kat yukari gecmeniz gerekmektedir.");
                } else {
                    System.out.println("Zaten belirttiğiniz kattasınız.");
                }
            }
        }
    }
}
