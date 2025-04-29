package model;

import java.time.LocalDate;

public class Destillat {
    private int maltbatch;
    private LocalDate startDato;
    private LocalDate slutDato;
    private KornSort kornSort;
    private double alkoholProcent;
    private String kommentar;
    private double mængdeVæske;

    public Destillat(int maltbatch, LocalDate startDato, LocalDate slutDato, KornSort kornSort, double alkoholProcent, String kommentar, double mængdeVæske) {
        this.maltbatch = maltbatch;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.kornSort = kornSort;
        this.alkoholProcent = alkoholProcent;
        this.kommentar = kommentar;
        this.mængdeVæske = mængdeVæske;
    }
    //GET METODER
    public int getMaltbatch() {
        return maltbatch;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public KornSort getKornSort() {
        return kornSort;
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }

    public String getKommentar() {
        return kommentar;
    }

    public double getMængdeVæske() {
        return mængdeVæske;
    }
    //--------------------------------------------------
    //SET METODER
    //TODO

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
