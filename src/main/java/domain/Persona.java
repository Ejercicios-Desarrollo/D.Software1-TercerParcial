package domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Persona {
    private String fechaDeNacimiento;
    private EstadoVoto estadoVoto;

    public Persona(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoVoto = new VotoPendiente();
    }

    public int getEdad() {
        return calcularEdad(fechaDeNacimiento);
    }

    public int calcularEdad(String fechaDeNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaDeNacimiento, formatter);
        LocalDate fechaDeHoy = LocalDate.now();
        return Period.between(fecha, fechaDeHoy).getYears();
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
