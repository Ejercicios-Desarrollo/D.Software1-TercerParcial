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
    public void chequearEdad(Persona persona){

    }

    @Override
    public void votarListaEntera(Lista lista, Persona persona){

    }

    @Override
    public void votarCortandoBoleta(List<Postulante> postulantes, Eleccion eleccion, Persona persona){

    }
}
