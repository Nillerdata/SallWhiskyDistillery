package controller;

import model.Destillat;
import model.Fad;

import java.util.List;

public interface Storage {

public List<Fad>getFade();

public void addFade(Fad fad);

public void removeFade(Fad fad);

//-----------------------------------
public List<Destillat>getDestillater();

public void addDestillat(Destillat destillat);

public void removeDestillat(Destillat destillat);
}
