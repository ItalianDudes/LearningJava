package it.italiandudes.learningjava;

import java.util.Scanner;

// Questa è una classe di nome "PrimoProgettoJavaFX"
public class LearningJava {

    // Questo è un metodo, di nome "main" che accetta come parametri 1 solo parametro di tipo String[] di nome args
    // E' un metodo speciale perché è il punto di avvio del programma
    public static void main(String[] args /* args è un parametro */) { // Nome del metodo (formalmente si dice "firma" del metodo)
        int integer; // -2M a +2M, solo interi, niente virgole 4 byte
        float floatingPoint; // -2M a +2M, con virgole, relativamente preciso 4 byte
        double doublePrecision; // -3 * 10^308 a +3 * 10^308 con virgole... 8 byte
        char character = 'a'; // A single character 1 byte
        String string = "Porco dio."; // A composition of characters N byte
        boolean trueOrFalse = true; // Vero o falso

        // Stampa a schermo (Output)
        System.out.println("Dio" + " " + (2 + 2) + "Cane"); // printf() in C

        // Lettura da Tastiera (Input)
        Scanner reader = new Scanner(System.in); // Rendiamo più amichevole l'input che Java di base fornisce
        String input = reader.nextLine(); // Legge una riga dall'input utente
        int userInput = Integer.parseInt(input); // String --> int
        double dUserInput = Double.parseDouble(input); // String --> double
        float fUserInput = Float.parseFloat(input); // String --> float
        boolean bUserInput = Boolean.parseBoolean(input); // String --> boolean
        char cUserInput = input.charAt(0); // String --> char
        String shittyResult = "" + 4; // "4" --> Ewwww
        String result = "Hai inserito " + userInput; // Va bene in questo caso
        String betterResult = String.valueOf(userInput); // Va meglio
    }
}
