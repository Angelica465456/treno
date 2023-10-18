//import java.io.BufferedReader;
//import java.io.FileReader;
import java.util.Scanner;
//import java.io.BufferedWriter; 
//import java.io.FileWriter; 
//import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        LocalDate oggi = LocalDate.now();


        System.out.println("Il treno parte dalla stazione 1 e arriva alla stazione 10.");


        System.out.println("Inserisci i dato del biglietto: ");

        System.out.println("Data di scadenza: ");


        int anno = 2100;

        System.out.println("Mese scadenza: ");
        int mese = sca.nextInt();

        System.out.println("Giorno scadenza: ");
        int giorno = sca.nextInt();

        LocalDate scad = LocalDate.of(anno, mese, giorno);

        if(scad.compareTo(oggi) < 0){
            System.out.println("\nIl biglietto è scaduto.");
        }else{
            do{
                System.out.println("Stazione di partenza: ");
                int par = sca.nextInt();
            }while(par < 0 || par > 11);
        }
    }
}
