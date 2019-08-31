package domain;

import java.util.List;

public interface EstadoVoto {
    public void votarListaEntera(Lista lista, Persona persona);
    public void votarCortandoBoleta(List<Postulante> postulantes, Eleccion eleccion, Persona persona);
    public void chequearEdad(Persona persona);
}
