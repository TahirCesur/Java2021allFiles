package HalukHocaGithub._15_Exceptions.Ex3;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        int kullanici = 0;
        Scanner oku = new Scanner(System.in);

        String username = "";
        String password = "";

        do {

            System.out.print((kullanici + 1) + ".User Name= ");
            username = oku.nextLine();

            System.out.print("Password= ");
            password = oku.nextLine();
            try {
                User yeniUser = new User(username, password);
                kullanici++;

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (kullanici <2);
        /*

         boolean usernameIste = true;
            do {
            if (usernameIste) {
                System.out.print((miktar + 1) + ".User Name=");
                username = oku.nextLine();
            }
            System.out.print("Password=");
            password = oku.nextLine();
            try {
                User yeniUser = new User(username, password);
                miktar++;
                usernameIste = true;//hata olmadığında bir sonraki kullanıcı için username istenecek.
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                usernameIste = false;//hata olduğu durumda tekrar username isteme
            }
        } while (miktar < 6);
         */
    }


}