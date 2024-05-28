package es3;

import java.util.HashMap;
import java.util.Map;

public class ElencoTelefonico {
    Map<String, Integer> elencoTelefonico = new HashMap<>();

    public void aggiungiInRubrica(String nome, int numeroDiTelefono) {
        elencoTelefonico.put(nome, numeroDiTelefono);
        System.out.println("Hai appena aggiunto un numero. Ecco l'elenco aggiornato" + elencoTelefonico);
    }

    public void cancellaNumero(String nome) {
        elencoTelefonico.remove(nome);
        System.out.println("Hai appena cancellato il numero di " + nome);
        System.out.println("Ecco l'elenco aggiornato " + elencoTelefonico);
    }

    public void ricercaPerNumero(int numeroDitelefono) {
        String result = "";
        for (String contact : elencoTelefonico.keySet()) {
            if (elencoTelefonico.get(contact) == numeroDitelefono) {
                result = contact;
            }
        }
        System.out.println("Il nome della persona con il numero corrispondente è" + result);


    }

    public void ricercaPerNome(String nome) {
        System.out.println("Questo è il numero di" + nome + elencoTelefonico.get(nome));

    }
}
