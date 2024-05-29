package dam.senseigithub;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass() {
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma dos números")
    void testSuma() {
        assertEquals(7, miCalculadora.suma(6, 1));
        assertEquals(6, miCalculadora.suma(3, 3));
        assertEquals(5, miCalculadora.suma(8, -3));
        assertEquals(-11, miCalculadora.suma(-3, -8));
    }

    @Test
    @DisplayName("Resta dos números")
    void testResta() {
        assertEquals(-1, miCalculadora.resta(2, 3));
        assertEquals(5, miCalculadora.resta(2, -3));
        assertEquals(1, miCalculadora.resta(-2, -3));
        assertEquals(-6, miCalculadora.resta(-3, 3));
    }

    @Test
    @DisplayName("Exponente de dos números")
    void testExponente() {
        assertEquals(8, miCalculadora.potencia(2, 3));
        assertEquals(1, miCalculadora.potencia(2, 0));
        assertEquals(55.90169943749474, miCalculadora.potencia(5, 2.5));
        assertEquals(0.25, miCalculadora.potencia(2, -2));
    }

    @Test
    @DisplayName("Multiplica dos números")
    void testMultiplicar() {
        assertEquals(6, miCalculadora.multiplica(2, 3));
        assertEquals(0, miCalculadora.multiplica(5, 0));
        assertEquals(16, miCalculadora.multiplica(4, 4));
        assertEquals(-5, miCalculadora.multiplica(-5, 1));
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, miCalculadora.divide(4, 2));
        assertEquals(2.5, miCalculadora.divide(10, 4));
        assertEquals(4, miCalculadora.divide(10, 2.5));
        assertEquals(3.2, miCalculadora.divide(8, 2.5));
        assertEquals(0.5, miCalculadora.divide(2, 4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.divide(4, 2) > 0);
        assertTrue(miCalculadora.divide(4, -2) < 0);
        assertTrue(miCalculadora.divide(-4, 2) < 0);
        assertTrue(miCalculadora.divide(-4, -2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void divisionPorCero() {
        assertThrows(Calculadora.OperacionInvalidaException.class, () -> {
            miCalculadora.divide(5, 0);
        });
    }
    @Test
    @DisplayName("RaizDeUnoTDD")
    void raizCuadradaDeUno() {
        assertEquals(1, miCalculadora.raizCuadrada(1));
    }

    @Test
    @DisplayName("RaizDeCeroTDD")
    void raizCuadradaDeCero() {
        assertEquals(0, miCalculadora.raizCuadrada(0));
    }

    @Test
    @DisplayName("RaizDeCuatroTDD")
    void raizCuadradaDeCuatro() {
        assertEquals(2, miCalculadora.raizCuadrada(4));
    }

    @Test
    @DisplayName("RaizDeNegativoTDD")
    void raizCuadradaDeNumeroNegativo() {
        assertThrows(Calculadora.OperacionInvalidaException.class, () -> {
            miCalculadora.raizCuadrada(-1);
        });
    }
}