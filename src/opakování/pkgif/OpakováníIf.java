package opakování.pkgif;
// vypiš dvě čísla podle vstupu od uživatele podle pořadí
import java.util.Scanner;

public class OpakováníIf {

    
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        int a = vstup.nextInt();
        int b = vstup.nextInt();
        //prohodit proměnné, pokud jsou hodnoty obráceně
        if (a > b) {
            int pomocna = a;
            a = b;
            b = pomocna;
        }
        System.out.println("čísla podle pořadí: " + a + " " + b);
    }
}
