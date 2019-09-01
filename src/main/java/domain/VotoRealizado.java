package domain;

import java.util.List;

public class VotoRealizado implements EstadoVoto {

    public VotoRealizado(){

    }

    @Override
    public boolean yaVoto(){
        return true;
    }

    @Override
    public void votarListaCompleta(Lista lista, Persona persona){

    }

    @Override
    public void votarCortandoBoletas(List<Postulante> postulantes, Eleccion eleccion, Persona persona){

    }
}
