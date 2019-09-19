package domain;

public class Vigente extends Estado {

    public Vigente() {

    }

    @Override
    public void presentarListaAEleccion(Eleccion eleccion, Lista lista, EntidadPolitica entidadPolitica){
        eleccion.presentarLista(lista);
        entidadPolitica.setEstado(new ListaPresentada());
    }
}