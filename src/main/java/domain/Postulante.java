package domain;

public class Postulante {
    private Cargo cargo;
    private int votos;
    private int numeroLista;

    public Postulante(){
        this.votos = 0;
    }

    public void postularseA(Cargo cargo, Lista lista){
        lista.agregarPostulante(this);
        this.cargo = cargo;
        this.numeroLista = lista.getNumero();
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public int getVotos() {
        return votos;
    }

    public void sumarVoto() {
        this.votos++;
    }
}
