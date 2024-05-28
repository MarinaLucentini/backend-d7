package es3;

public class Esercizio3 {
    public static void main(String[] args) {
        ElencoTelefonico elencoTelefonico = new ElencoTelefonico();
        elencoTelefonico.aggiungiInRubrica("Maria", 329556578);
        elencoTelefonico.aggiungiInRubrica("Giovanni", 329754411);
        elencoTelefonico.aggiungiInRubrica("Salvo", 329447711);
        elencoTelefonico.ricercaPerNumero(329447711);
        elencoTelefonico.cancellaNumero("Maria");
        elencoTelefonico.ricercaPerNome("Giovanni");

    }
}
