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

    public boolean esAptoParaVotar(Persona persona){
        return persona.getEdad() >= 16;
    }

    @Override
    public void votarListaCompleta(Lista lista, Persona persona){
        if(esAptoParaVotar(persona)){
            lista.sumarVotosListaCompleta();
            persona.setEstadoVoto(new VotoRealizado());
        }
        else persona.setEstadoVoto(new VotoNoApto());
    }

    @Override
    public void votarCortandoBoletas(List<Postulante> postulantes, Eleccion eleccion, Persona persona){
        if(esAptoParaVotar(persona)){
            postulantes.stream().forEach(postulante -> eleccion.sumarVotoPorCandidato(postulante));
            persona.setEstadoVoto(new VotoRealizado());
        }
        else persona.setEstadoVoto(new VotoNoApto());
    }
}
