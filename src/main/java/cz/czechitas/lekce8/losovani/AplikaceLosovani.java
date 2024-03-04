package cz.czechitas.lekce8.losovani;

import java.util.stream.IntStream;

public class AplikaceLosovani {

    private IntStream prvniTah;
    private IntStream druhyTah;

    public static void main(String[] args) {
        new AplikaceLosovani().run();
    }

    public void run() {
        LosovaciZarizeni losovaciZarizeni = new LosovaciZarizeni();
        System.out.println("Losování prvního tahu Sportky…");
        this.prvniTah = losovaciZarizeni.losovatSazkuHlavniTah();
        this.vypsatTazenaCisla("prvním", prvniTah);

        System.out.println("Losování druhého tahu Sportky…");
        this.druhyTah = losovaciZarizeni.losovatSazkuHlavniTah();
        this.vypsatTazenaCisla("druhém", druhyTah);

        System.out.println("Výhercům gratulujeme.");
    }

    /**
     * Vypíše všechna vylosovaná čícsla.
     */
    public void vypsatTazenaCisla(String poradi, IntStream vylosovanaCisla) {
        System.out.printf("V %s tahu Sportky byla tažena čísla:", poradi).println();
        vylosovanaCisla.forEachOrdered(this::vypsatVylosovaneCislo);
    }

    /**
     * Vypíše vylosované číslo na nový řádek s odrážkou.
     *
     * @param cislo Vylosované číslo k vypsání.
     */
    private void vypsatVylosovaneCislo(int cislo) {
        System.out.printf("• %d", cislo)
                .println();
    }

}
