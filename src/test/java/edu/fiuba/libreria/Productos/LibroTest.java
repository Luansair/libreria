package edu.fiuba.libreria.Productos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibroTest {
    @Test
    public void test01ElPrecioDeUnLibroDe500PesosEs500Pesos(){
        int precioLibro = 500;
        Libro unLibro = new Libro(precioLibro);

        assertEquals(unLibro.calcularPrecio(), precioLibro);
    }
}
