import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz:");
        sayi = inp.nextInt();

        for (int i=1; i<=sayi;i++){
            if(i%3 == 0 || i%4 == 0){
                System.out.println(i);
                int toplam=(i+=i);
                System.out.println("Ortalama:"+(toplam/i));
            }
        }

    }
}