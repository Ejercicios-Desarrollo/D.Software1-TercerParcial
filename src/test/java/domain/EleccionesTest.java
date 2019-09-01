package domain;

import javafx.geometry.Pos;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EleccionesTest {
    private Eleccion eleccion2019;
    private PartidoPolitico pro;
    private PartidoPolitico ucr;
    private PartidoPolitico unidadCiudadana;
    private PartidoPolitico frenteRenovador;
    private Alianza juntosPorElCambio;
    private Alianza frenteDeTodos;
    private PartidoPolitico frenteDeIzquierda;
    private PartidoPolitico frenteDespertar;
    private Lista cien;
    private Lista veinte;
    private Lista quince;
    private Lista sesenta;
    private Postulante mMacri;
    private Postulante mVidal;
    private Postulante aFernandez;
    private Postulante aKicillof;


    @Before
    public void init(){
        this.eleccion2019 = new Eleccion();
        this.pro = new PartidoPolitico("Pro");
        this.ucr = new PartidoPolitico("UCR");
        this.unidadCiudadana = new PartidoPolitico("Unidad Ciudadana");
        this.frenteRenovador = new PartidoPolitico("Frente Renovador");
        this.juntosPorElCambio = new Alianza("Juntos por el Cambio");
        this.frenteDeTodos = new Alianza("Frente de Todos");
        this.frenteDeIzquierda = new PartidoPolitico("Frente de Izquierda");
        this.frenteDespertar = new PartidoPolitico("Frente Despertar");
        this.cien = new Lista(100, "Cambio");
        this.veinte = new Lista(20, "Todos");
        this.quince = new Lista(15, "Izquierda");
        this.sesenta = new Lista(60, "Despertar");
        this.mMacri = new Postulante();
        this.mVidal = new Postulante();
        this.aFernandez = new Postulante();
        this.aKicillof = new Postulante();
    }

    //Test primera iteracion
    @Test
    public void postularseAListaTest(){
        this.mMacri.postularseA(Cargo.PRESIDENTE, cien);
        this.mVidal.postularseA(Cargo.GOBERNADOR, cien);
        this.aFernandez.postularseA(Cargo.PRESIDENTE, veinte);
        this.aKicillof.postularseA(Cargo.GOBERNADOR, veinte);

        Assert.assertEquals(2, cien.getCantidadPostulantes());
        Assert.assertEquals(2, veinte.getCantidadPostulantes());
    }

    //Test primera iteracion
    @Test
    public void partidosPresentanListasTest(){
        this.juntosPorElCambio.agregarEntidadPolitica(pro);
        this.juntosPorElCambio.agregarEntidadPolitica(ucr);
        this.juntosPorElCambio.recuperarVigencia();
        this.juntosPorElCambio.presentarListaAEleccion(eleccion2019, cien);

        this.frenteDeTodos.agregarEntidadPolitica(unidadCiudadana);
        this.frenteDeTodos.agregarEntidadPolitica(frenteRenovador);
        this.frenteDeTodos.recuperarVigencia();
        this.frenteDeTodos.presentarListaAEleccion(eleccion2019, veinte);

        this.frenteDeIzquierda.recuperarVigencia();
        this.frenteDeIzquierda.presentarListaAEleccion(eleccion2019, quince);

        this.frenteDespertar.presentarListaAEleccion(eleccion2019, sesenta);

        List<Lista> listasTest = new ArrayList<>();
        listasTest.add(cien);
        listasTest.add(veinte);
        listasTest.add(quince);

        Assert.assertArrayEquals(listasTest.toArray(), eleccion2019.getListas().toArray());
        Assert.assertEquals(3, eleccion2019.getCantidadListas());

        this.frenteDespertar.recuperarVigencia();
        this.frenteDespertar.presentarListaAEleccion(eleccion2019, sesenta);

        listasTest.add(sesenta);
        Assert.assertArrayEquals(listasTest.toArray(), eleccion2019.getListas().toArray());
        Assert.assertEquals(4, eleccion2019.getCantidadListas());
    }

    //Test segunda y tercera iteracion
    @Test
    public void personasVotanTest(){
        this.mMacri.postularseA(Cargo.PRESIDENTE, cien);
        this.mVidal.postularseA(Cargo.GOBERNADOR, cien);
        this.aFernandez.postularseA(Cargo.PRESIDENTE, veinte);
        this.aKicillof.postularseA(Cargo.GOBERNADOR, veinte);
        this.juntosPorElCambio.recuperarVigencia();
        this.juntosPorElCambio.presentarListaAEleccion(eleccion2019, cien);
        this.frenteDeTodos.recuperarVigencia();
        this.frenteDeTodos.presentarListaAEleccion(eleccion2019, veinte);
        this.frenteDeIzquierda.recuperarVigencia();

        Persona persona1 = new Persona(16);
        Assert.assertEquals(false, persona1.votaste());
        persona1.emitirVoto(veinte, eleccion2019);
        Assert.assertEquals(true, persona1.votaste());

        Persona persona2 = new Persona(15);
        persona2.emitirVoto(veinte, eleccion2019);
        Assert.assertEquals(false, persona2.votaste());

        Persona persona3 = new Persona(20);
        persona3.emitirVoto(cien, eleccion2019);
        persona3.emitirVoto(cien, eleccion2019);

        Persona persona4 = new Persona(21);
        List<Postulante> listaTest = new ArrayList<>();
        listaTest.add(mMacri);
        listaTest.add(aKicillof);
        persona4.emitirVoto(listaTest, eleccion2019);

        Assert.assertEquals(3, veinte.getVotosLista());
        Assert.assertEquals(3, cien.getVotosLista());
        Assert.assertEquals(6, eleccion2019.getVotosTotales());

        Assert.assertEquals(3, juntosPorElCambio.getCantidadVotos(eleccion2019));
        Assert.assertEquals(3, frenteDeTodos.getCantidadVotos(eleccion2019));
        Assert.assertEquals(0, frenteDeIzquierda.getCantidadVotos(eleccion2019));
    }
}
