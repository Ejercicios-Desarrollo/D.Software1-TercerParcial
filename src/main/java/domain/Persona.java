package domain;

import java.util.List;

public class Persona {
    private int edad;
    private EstadoVoto estadoVoto;

    public Persona(int edad){
        this.edad = edad;
        this.estadoVoto = new VotoPendiente();
    }

    public int getEdad() {
        return edad;
    }

    public boolean votaste(){
        return this.estadoVoto.yaVoto();
    }

    public void setEstadoVoto(EstadoVoto estadoVoto) {
        this.estadoVoto = estadoVoto;
    }

    public void emitirVoto(Lista lista, Eleccion eleccion){
        this.estadoVoto.votarListaCompleta(lista, this);
    }

    public void emitirVoto(List<Postulante> postulantes, Eleccion eleccion){
        this.estadoVoto.votarCortandoBoletas(postulantes, eleccion, this);
    }
}
