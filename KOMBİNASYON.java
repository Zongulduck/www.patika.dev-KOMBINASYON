import java.util.Scanner;
public class KOMBİNASYON {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int say1,say2,say3,sonuc;
        int fak1=1,fak2=1,fak3=1;
        System.out.println("ilk sayıyı giriniz:");
        say1= inp.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        say2= inp.nextInt();
        if(say1<say2){
            System.out.println("ilk sayının ikinci sayılı kombinasyonunu alabilmemiz için ilk sayı ikinci sayıdan büyük olmalı" +
                    " lütfen tekrar deneyiniz");
        }
        else {
            say3 = say1 - say2;
            for (int i = 1; i <= say1; i++) {
                fak1 = (fak1 * i);
            }
            System.out.println(say1 + "'in faktöriyeli " + fak1);
            for (int x = 1; x <= say2; x++) {
                fak2 = (fak2 * x);
            }
            System.out.println(say2 + "'nin faktöriyeli " + fak2);
            for (int c = 1; c <= say3; c++) {
                fak3 = (fak3 * c);
            }
            System.out.println(say3 + "'ün faktöriyeli " + fak3);
            sonuc = fak1 / (fak2 * fak3);
            System.out.println(say1 + "'in " + say2 + "'ile kombinasyonu; " + sonuc);
        }
    }
}
