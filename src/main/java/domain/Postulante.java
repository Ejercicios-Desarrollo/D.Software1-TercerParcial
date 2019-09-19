package domain;

import java.util.ArrayList;
import java.util.List;

public class Postulante {
    private Cargo cargo;
    private int votos;
    private List<Lista> listas;

    public Postulante(){
        this.votos = 0;
        this.listas = new ArrayList<>();
    }

    public void postularseA(Cargo cargo, Lista lista){
        lista.agregarPostulante(this);
        this.cargo = cargo;
        this.listas.add(lista);
    }

    public int getNumeroLista() {
        return getListaActual().getNumero();
    }

    public Lista getListaActual(){
        return listas.get(listas.size()-1);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public int getVotos() {
        return votos;
    }

    public void sumarVoto() {
        this.votos++;
    }
}
