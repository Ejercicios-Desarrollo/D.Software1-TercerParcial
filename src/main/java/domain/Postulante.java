package domain;

public class Postulante {
    private Cargo cargo;
    public Postulante(){

    }

    public void postularseA(Cargo cargo, Lista lista){
        this.cargo = cargo;
        lista.agregarPostulante(this);
    }
}
