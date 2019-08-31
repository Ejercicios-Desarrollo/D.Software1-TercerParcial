package domain;

import java.util.List;

public abstract class EntidadPolitica {
    private String nombre;
    private Estado estado;

    public EntidadPolitica(String nombre){
        this.nombre = nombre;
        this.estado = new NoVigente();
    }

    public String getNombre() {
        return nombre;
    }

    public void presentarListaAEleccion(Eleccion eleccion, Lista lista){
        lista.setEntidadPolitica(this);
        this.estado.presentarListaAEleccion(eleccion, lista, this);
    }

    public void recuperarVigencia(){
        this.estado = new Vigente();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public int getCantidadVotos(Eleccion eleccion){
        return eleccion.getVotosPorEntidadPolitica(this);
    }
}
