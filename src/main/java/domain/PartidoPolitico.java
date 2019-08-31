package domain;

import java.time.LocalDate;

public class PartidoPolitico extends EntidadPolitica{
    private LocalDate fechaDeConformacion;

    public PartidoPolitico(String nombre){
        super(nombre);
        this.fechaDeConformacion = LocalDate.now();
    }

    public LocalDate getFechaDeConformacion() {
        return fechaDeConformacion;
    }
}
