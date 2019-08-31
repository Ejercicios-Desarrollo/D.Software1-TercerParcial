package domain;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private int numero;
    private String nombre;
    private List<Postulante> postulantes;
    private PartidoPolitico partidoPolitico;

    public Lista(int numero, String nombre){
        this.numero = numero;
        this .nombre = nombre;
        this.postulantes = new ArrayList<>();
    }

    public void agregarPostulante(Postulante postulante){
        this.postulantes.add(postulante);
    }

    public int getCantidadPostulantes(){
        return this.postulantes.size();
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }
}
