package JavaKonusalSorular.Pratik07_ScannerClass;

import java.util.Scanner;

public class Pr09 {

    public static void main(String[] args) {
    	/*
    	 * Kullanicidan alacaginiz vize1 ve vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize1: ");
        int vize1 = scanner.nextInt();

        System.out.print("Vize2: ");
        int vize2 = scanner.nextInt();

        System.out.print("Final: ");
        int finalnot = scanner.nextInt();

        double sonuc = ((vize1 + vize2) / 2) * 0.3 + (finalnot * 0.7);
        System.out.print("ders notunuz: " + sonuc);
        
        scanner.close();
    }
}
