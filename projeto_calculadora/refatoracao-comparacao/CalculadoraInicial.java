package calculadora;

/**
 * Calculadora básica.
 *
 * @author André Machado
 * @version 1.0
 */
public class Calculadora {

    /**
     * Executa uma operação matemática.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operador
     * @return resultado
     * @throws ArithmeticException divisão por zero
     * @throws IllegalArgumentException operador inválido
     */
    public int calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida: null");
        }

        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
            return a / b;
        }

        throw new IllegalArgumentException("Operação inválida: " + op);
    }
}
