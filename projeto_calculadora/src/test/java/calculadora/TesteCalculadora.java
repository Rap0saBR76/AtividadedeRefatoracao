package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testes unitários da classe Calculadora.
 *
 * 
 */
public class TesteCalculadora {

    private Calculadora calculadora;

    /**
     * Cria uma calculadora antes de cada teste.
     */
    @BeforeEach
    void prepararTeste() {
        calculadora = new Calculadora();
    }

    /**
     * Testa a operação de soma.
     */
    @Test
    void deveSomarDoisNumeros() {
        int resultado = calculadora.calc(10, 5, "+");
        assertEquals(15, resultado);
    }

    /**
     * Testa a operação de subtração.
     */
    @Test
    void deveSubtrairDoisNumeros() {
        int resultado = calculadora.calc(10, 5, "-");
        assertEquals(5, resultado);
    }

    /**
     * Testa a operação de multiplicação.
     */
    @Test
    void deveMultiplicarDoisNumeros() {
        int resultado = calculadora.calc(10, 5, "*");
        assertEquals(50, resultado);
    }

    /**
     * Testa a operação de divisão.
     */
    @Test
    void deveDividirDoisNumeros() {
        int resultado = calculadora.calc(10, 5, "/");
        assertEquals(2, resultado);
    }

    /**
     * Testa a tentativa de divisão por zero.
     */
    @Test
    void deveImpedirDivisaoPorZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculadora.calc(10, 0, "/")
        );
    }

    /**
     * Testa a utilização de um operador inválido.
     */
    @Test
    void deveImpedirOperacaoInvalida() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.calc(10, 5, "%")
        );
    }
}
