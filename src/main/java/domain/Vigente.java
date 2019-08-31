package domain;

public class Vigente extends Estado {

    public Vigente() {

    }

    @Override
    public void presentarListaAEleccion(Eleccion eleccion, Lista lista){
        eleccion.presentarLista(lista);
    }
}