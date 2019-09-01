package domain;

import java.util.List;

public class VotoNoApto implements EstadoVoto {

    public VotoNoApto(){

    }

    @Override
    public boolean yaVoto(){
        return false;
    }

    @Override
    public void votarListaCompleta(Lista lista, Persona persona){

    }

    @Override
    public void votarCortandoBoletas(List<Postulante> postulantes, Eleccion eleccion, Persona persona){

    }
}
