package domain;

import java.util.ArrayList;
import java.util.List;

public class Eleccion {
    private List<Lista> listas;
    private int anio;
    private List<Cargo> cargosAVotar;

    public Eleccion(int anio, List<Cargo> cargos){
        this.anio = anio;
        this.cargosAVotar = cargos;
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

    public void sumarVotoPorCandidato(Postulante postulante){
        this.listas.stream()
                .filter(lista -> lista.getNumero() == postulante.getNumeroLista())
                .forEach(lista -> lista.sumarVotoPorCargo(postulante));
    }

    public int getVotosTotales(){
        return this.listas.stream()
                .mapToInt(lista -> lista.getVotosLista())
                .sum();
    }

    public int getVotosPorEntidadPolitica(EntidadPolitica entidadPolitica){
        return this.listas.stream()
                .filter(lista -> lista.getEntidadPolitica() == entidadPolitica)
                .mapToInt(lista -> lista.getVotosLista())
                .sum();
    }
}
