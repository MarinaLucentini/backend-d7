package es2;

import java.util.List;
import java.util.Random;

public class ArrayList {
    List<Integer> listaordinata = new java.util.ArrayList<>();
    List<Integer> secondalista = new java.util.ArrayList<>();
    private int numeroArray;

    public ArrayList(int numeroArray) {
        this.numeroArray = numeroArray;
    }

    public void listaOrdinataMetodo() {
        for (int i = 0; i < numeroArray; i++) {
            Random rdnm = new Random();
            int number = rdnm.nextInt(0, 100);
            listaordinata.add(number);
        }
        ;
    }

    public void secondaLista() {
        for (int i = 0; i < numeroArray; i++) {
            Random rdnm = new Random();
            int number = rdnm.nextInt(0, 100);
            secondalista.add(number);
        }

    }

    public void unireLeListe() {
        listaordinata.addAll(secondalista.reversed());
    }

    public List<Integer> pariOdispari(List<Integer> lista, boolean pariDispari) {
        List<Integer> listapariODispari = new java.util.ArrayList<>();
        if (pariDispari) {
            for (Integer num : lista) {
                if (num % 2 == 0) {
                    listapariODispari.add(num);
                }
            }
        } else {
            for (Integer num : lista) {
                if (num % 2 != 0) {
                    listapariODispari.add(num);
                }
            }
        }
        return listapariODispari;
    }

    ;


}
