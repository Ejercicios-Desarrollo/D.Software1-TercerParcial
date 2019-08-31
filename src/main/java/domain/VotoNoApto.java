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
    public void chequearEdad(Persona persona) {

    }

    @Override
    public void votarListaEntera(Lista lista, Persona persona){

    }

    @Override
    public void votarCortandoBoleta(List<Postulante> postulantes, Eleccion eleccion, Persona persona){

    }
}
