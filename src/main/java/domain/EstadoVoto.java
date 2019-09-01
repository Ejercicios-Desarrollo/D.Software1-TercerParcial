package domain;

import java.util.List;

public interface EstadoVoto {
    public void votarListaCompleta(Lista lista, Persona persona);
    public void votarCortandoBoletas(List<Postulante> postulantes, Eleccion eleccion, Persona persona);
    public boolean yaVoto();
}
