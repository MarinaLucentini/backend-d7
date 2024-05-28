package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicami con un numero intero quante parole vuoi inserire");
        int numeroSet = Integer.parseInt(scanner.nextLine());
        Set<String> textduplicatiSet = new HashSet<>();
        Set<String> textSet = new HashSet<>();

        for (int i = 0; i < numeroSet; i++) {
            System.out.println("Scrivimi le parole che vuoi inserire");
            String text = scanner.nextLine();
            if (!textSet.add(text)) {
                textduplicatiSet.add(text);
            }

        }
        System.out.println(textSet);
        System.out.println(textSet.size());
        System.out.println(textduplicatiSet);


    }
}
