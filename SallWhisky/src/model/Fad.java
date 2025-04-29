package model;

public class Fad {

    private String træType;
    private int antalGangeBrugt;
    private double liter;
    private int fadNr;
    private String leverandør;
    private String tidligereIndhold;

    public Fad(String træType, int antalGangeBrugt, double liter, int fadNr, String leverandør, String tidligereIndhold) {
        this.træType = træType;
        this.antalGangeBrugt = antalGangeBrugt;
        this.liter = liter;
        this.fadNr = fadNr;
        this.leverandør = leverandør;
        this.tidligereIndhold = tidligereIndhold;
    }

    public String getTræType() {
        return træType;
    }

    public int getAntalGangeBrugt() {
        return antalGangeBrugt;
    }

    public double getLiter() {
        return liter;
    }

    public int getFadNr() {
        return fadNr;
    }

    public String getLeverandør() {
        return leverandør;
    }

    public String getTidligereIndhold() {
        return tidligereIndhold;
    }
}
