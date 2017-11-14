import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Es wird gerechnet! Und zwar Addiert");
        System.out.println("Programm kann mit x beendet werden!");
        System.out.println("Addition");

        String eingabe = input("1. Operand oder x eingeben:");

        if(eingabe.equals("x")) {
            //Programm beenden
            System.out.println("Programm beendet!");
        }
        else
        {
            Integer numOne = Integer.parseInt(eingabe);
            eingabe = input("2. Operand");
            Integer numTwo = Integer.parseInt(eingabe);
            System.out.println("Das Ergebnis von " + numOne + " + " + numTwo + " = " + (numOne + numTwo));
        }
    }

    private static String input(String output) {
        System.out.print(output + " ");

        Scanner myScanner = new Scanner(System.in);
        return myScanner.next();
    }

}