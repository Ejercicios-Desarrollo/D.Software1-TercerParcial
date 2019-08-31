package domain;

import java.util.ArrayList;
import java.util.List;

public class Eleccion {
    private List<Lista> listas;

    public Eleccion(){
        this.listas = new ArrayList<>();
    }

    public void presentarLista(Lista lista){
        this.listas.add(lista);
    }

    public int getCantidadListas(){
        return this.listas.size();
    }

    public List<Lista> getListas(){
        return listas;
    }
}