package JavaKonusalSorular.Pratik08_IfStatements;

import java.util.Scanner;

public class Pr03 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		 * ve dikdortgenin kare olup olmadigini yazdirin
		 */
		
		 Scanner scan=new Scanner(System.in);
			
		System.out.print("Lutfen ilk kenar uzunlugunu giriniz \nEnter a basiniz : ");
		
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("Bu bir karedir");
		}else
			System.out.println("Bu bir kare degildir");
		scan.close();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}


