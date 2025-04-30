package controller;

import model.Destillat;
import model.Fad;
import model.KornSort;
import storage.ListStorage;
import storage.ListStorage;

import java.time.LocalDate;

public abstract class Controller {


    private static ListStorage storage;

    public static void setStorage(ListStorage storage){Controller.storage = storage;}


    public static Destillat opretDestillat(int maltbatch, LocalDate startDato, LocalDate slutDato, KornSort kornSort, double alkoholProcent, String kommentar, double mængdeVæske){
        Destillat destillat = new Destillat(maltbatch, startDato, slutDato, kornSort, alkoholProcent, kommentar, mængdeVæske);
        storage.addDestillat(destillat);
        return destillat;
    }

    public static Fad opretFad(String træType, int antalGangeBrugt, double liter, int fadNr, String leverandør, String tidligereIndhold){
        Fad fad = new Fad(træType, antalGangeBrugt, liter, fadNr, leverandør, tidligereIndhold);
        storage.addFade(fad);
        return fad;
    }


}
