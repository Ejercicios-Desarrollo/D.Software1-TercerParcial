package domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VotoPendiente implements EstadoVoto {

    public VotoPendiente(){

    }

    @Override
    public boolean yaVoto(){
        return false;
    }

    @Override
    public void chequearEdad(Persona persona){
        if(persona.getEdad() < 16){
            persona.setEstadoVoto(new VotoNoApto());
        }
    }

    @Override
    public void votarListaEntera(Lista lista, Persona persona){
        lista.sumarVotosListaEntera();
        persona.setEstadoVoto(new VotoRealizado());
    }

    @Override
    public void votarCortandoBoleta(List<Postulante> postulantes, Eleccion eleccion, Persona persona){
        postulantes.stream().forEach(postulante -> eleccion.sumarVotoPorNumeroLista(postulante));
        persona.setEstadoVoto(new VotoRealizado());
    }
}
