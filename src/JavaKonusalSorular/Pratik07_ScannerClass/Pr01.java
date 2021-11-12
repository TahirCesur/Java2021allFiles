package JavaKonusalSorular.Pratik07_ScannerClass;


import java.util.Scanner;

public class Pr01 {

	public static void main(String[] args) {

		/* Kullanicidan iki tamsayi alip bu sayilarin toplam,
		   fark ve carpimlarini yazdirin
		*/

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki tamsayi giriniz");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		System.out.println("Girdiginiz sayilarin toplami : " + (sayi1+sayi2));
		System.out.println("Girdiginiz sayilarin farki : " + (sayi1-sayi2));
		System.out.println("Girdiginiz sayilarin carpimi : " + (sayi1*sayi2));

		scan.close();
	}

}
