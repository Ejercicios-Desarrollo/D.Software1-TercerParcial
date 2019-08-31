package domain;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alianza extends EntidadPolitica{

    private List<EntidadPolitica> entidadesPoliticas;

    public Alianza(String nombre){
        super(nombre);
        this.entidadesPoliticas = new ArrayList<>();
    }

    public void agregarEntidadPolitica(EntidadPolitica entidadPolitica){
        this.entidadesPoliticas.add(entidadPolitica);
    }



}
