package JavaKonusalSorular.Pratik05_MantiksalveiliskiselOpetaorler;

public class Pr03 {

    public static void main(String[] args) {

        /* Olusturacginiz int degiskeni icerisindeki sayinin degerinin
           araliklarini gosteren bir program yaziniz...

           int sayi=57;

           0-50 : false
           50-100 : true

           0-50 ve cıft : false
           50-100 ve cift : true

           0-50 ve tek : false
           50-100 ve tek : true

        */

        int sayi=57;

        boolean deneme= sayi>0 && sayi<50;
        System.out.println("0-50 : " + deneme);

        boolean deneme1= sayi>50 && sayi<100;
        System.out.println("50-100 : " + deneme1);

        boolean deneme2= sayi>0 && sayi<50;
        System.out.println("0-50 ve cift : " + deneme2);

        boolean deneme3= sayi>50 && sayi<100;
        System.out.println("50-100 ve cift : " + deneme3);

        boolean deneme4= sayi>0 && sayi<50;
        System.out.println("0-50 ve tek: " + deneme4);

        boolean deneme5= sayi>50 && sayi<100;
        System.out.println("50-100 ve tek : " + deneme5);






    }
}
