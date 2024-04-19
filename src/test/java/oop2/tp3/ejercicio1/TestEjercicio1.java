package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class TestEjercicio1 {

    @Test
    public void TestCalculoDePago(){
        Libro elTunel = new LibroRegular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);

        Cliente victor = new Cliente("Victor");
        victor.alquilar(alquilerElTunel);
        // el monto a pagar seria de; 2 dias =2
            //                        3 dia= 4.5
                //                    total= 6.5
        var resultado = victor.calcularDeudaYPuntosObtenidos();
        Assertions.assertEquals(resultado[0],6.5);
    }
}
