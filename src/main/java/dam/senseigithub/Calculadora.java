package dam.senseigithub;

/**
 * Clase que representa una calculadora capaz de realizar operaciones matemáticas básicas.
 */
public class Calculadora {
    /**
     * Realiza la suma de dos números.
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return La suma de los dos números.
     */
    double suma(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta entre dos números.
     * @param minuendo El número del cual se resta.
     * @param sustraendo El número que se resta.
     * @return La resta del minuendo menos el sustraendo.
     */
    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    /**
     * Realiza la multiplicación de dos números.
     * @param a El primer factor.
     * @param b El segundo factor.
     * @return El resultado de la multiplicación.
     */
    double multiplica(double a, double b) {
        return (a * b);
    }

    /**
     * Realiza la división entre dos números.
     * @param dividendo El número que se divide.
     * @param divisor El número por el cual se divide.
     * @return El cociente de la división.
     * @throws OperacionInvalidaException Si el divisor es 0.
     */
    double divide(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new OperacionInvalidaException("El divisor no puede ser 0");
        }
        return dividendo / divisor;
    }

    /**
     * Calcula la potencia de un número elevado a otro.
     * @param base La base de la potencia.
     * @param exponente El exponente de la potencia.
     * @return El resultado de elevar la base al exponente.
     */
    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param radicando El número del cual se calcula la raíz cuadrada.
     * @return La raíz cuadrada del radicando.
     * @throws OperacionInvalidaException Si el radicando es negativo.
     */
    double raizCuadrada(double radicando) {
        if (radicando < 0) {
            throw new OperacionInvalidaException("El radicando no puede ser negativo");
        }

        return Math.sqrt(radicando);
    }


    public static class OperacionInvalidaException extends RuntimeException {
        /**
         * Crea una excepción para operaciones inválidas.
         * @param message Mensaje descriptivo de la excepción.
         */
        public OperacionInvalidaException(String message) {
            super(message);
        }
    }
}
