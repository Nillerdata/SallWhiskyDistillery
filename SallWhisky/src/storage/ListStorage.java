package storage;

import controller.Storage;
import model.Destillat;
import model.Fad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage, Serializable {
    private List<Fad> Fade = new ArrayList<>();
    private List<Destillat>destillater = new ArrayList<>();

    //-----------------------------------
public List<Fad>getFade(){
    return new ArrayList<Fad>(Fade);
}

public void addFade(Fad fad){
    Fade.add(fad);
}
    public void removeFade(Fad fad) {
        Fade.remove(fad);
    }
//-------------------------------------
    public List<Destillat>getDestillater(){
    return new ArrayList<Destillat>(destillater);}


    public void addDestillat(Destillat destillat) {
        destillater.add(destillat);
    }

    public void removeDestillat(Destillat destillat) {
        destillater.remove(destillat);
    }
}
