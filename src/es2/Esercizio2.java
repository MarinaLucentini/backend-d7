package es2;

public class Esercizio2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.listaOrdinataMetodo();
        System.out.println(arrayList.listaordinata);
        arrayList.secondaLista();
        System.out.println(arrayList.secondalista);
        arrayList.unireLeListe();
        System.out.println(arrayList.listaordinata);
        System.out.println(arrayList.pariOdispari(arrayList.listaordinata, true));
        System.out.println(arrayList.pariOdispari(arrayList.listaordinata, false));

    }
}
