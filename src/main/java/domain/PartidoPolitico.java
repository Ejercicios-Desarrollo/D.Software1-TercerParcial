package domain;

import java.time.LocalDate;

public class PartidoPolitico {
    private String nombre;
    private LocalDate fechaDeConformacion;
    private Estado estado;

    public PartidoPolitico(String nombre){
        this.nombre = nombre;
        this.fechaDeConformacion = LocalDate.now();
        this.estado = new NoVigente();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeConformacion() {
        return fechaDeConformacion;
    }

    public void presentarListaAEleccion(Eleccion eleccion, Lista lista){
        lista.setPartidoPolitico(this);
        this.estado.presentarListaAEleccion(eleccion, lista);
    }

    public void recuperarVigencia(){
        this.estado = new Vigente();
    }

    public Estado getEstado(){
        return this.estado;
    }



}
