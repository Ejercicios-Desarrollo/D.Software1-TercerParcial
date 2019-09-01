package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    private int numero;
    private String nombre;
    private List<Postulante> postulantes;
    private EntidadPolitica entidadPolitica;

    public Lista(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
        this.postulantes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Postulante> getPostulantes() {
        return postulantes;
    }

    public void agregarPostulante(Postulante postulante){
        this.postulantes.add(postulante);
    }

    public int getCantidadPostulantes(){
        return this.postulantes.size();
    }

    public void setEntidadPolitica(EntidadPolitica entidadPolitica) {
        this.entidadPolitica = entidadPolitica;
    }

    public EntidadPolitica getEntidadPolitica() {
        return this.entidadPolitica;
    }

    public void sumarVotosListaCompleta(){
        this.postulantes.stream().forEach(p -> p.sumarVoto());
    }

    public int getVotosLista(){
        return this.postulantes.stream().mapToInt(p -> p.getVotos()).sum();
    }

    public void sumarVotoPorCargo(Postulante postulante){
        this.postulantes.stream()
                .filter(p -> p.getCargo() == postulante.getCargo())
                .forEach(p -> p.sumarVoto());
    }

    public int getVotosPorCargo(Postulante postulante){
        return this.postulantes.stream()
                .filter(p -> p.getCargo() == postulante.getCargo())
                .mapToInt(p -> p.getVotos()).sum();
    }
}
