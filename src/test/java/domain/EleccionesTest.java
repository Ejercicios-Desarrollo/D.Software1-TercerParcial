package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EleccionesTest {
    private Eleccion eleccion2019;
    private PartidoPolitico juntosPorElCambio;
    private PartidoPolitico frenteDeTodos;
    private PartidoPolitico frenteDeIzquierda;
    private PartidoPolitico frenteDespertar;
    private Lista cien;
    private Lista veinte;
    private Lista quince;
    private Lista sesenta;

    @Before
    public void init(){
        this.eleccion2019 = new Eleccion();
        this.juntosPorElCambio = new PartidoPolitico("Juntos por el Cambio");
        this.frenteDeTodos = new PartidoPolitico("Frente de Todos");
        this.frenteDeIzquierda = new PartidoPolitico("Frente de Izquierda");
        this.frenteDespertar = new PartidoPolitico("Frente Despertar");
        this.cien = new Lista(100, "Cambio");
        this.veinte = new Lista(20, "Todos");
        this.quince = new Lista(15, "Izquierda");
        this.sesenta = new Lista(60, "Despertar");

    }

    @Test
    public void partidosPresentanListasTest(){
        this.juntosPorElCambio.recuperarVigencia();
        this.juntosPorElCambio.presentarListaAEleccion(eleccion2019, cien);
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
    }
}
