package calculadora;

/**
 * Representa uma calculadora capaz de realizar operações matemáticas básicas.
 *
 * @author André Machado
 * @version 1.0
 */
public class Calculadora {

    /**
     * Executa uma operação matemática entre dois números inteiros.
     *
     * @param a primeiro número da operação
     * @param b segundo número da operação
     * @param op operador matemático: +, -, * ou /
     * @return resultado inteiro da operação
     * @throws ArithmeticException quando ocorre uma tentativa de divisão por zero
     * @throws IllegalArgumentException quando o operador informado é inválido
     */
    public int calc(int a, int b, String op) {
        validarOperador(op);

        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                // Este ponto não deve ser alcançado devido à validação anterior.
                throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }

    /**
     * Realiza a soma de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da subtração
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado inteiro da divisão
     * @throws ArithmeticException quando o divisor é zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    /**
     * Valida o operador recebido.
     *
     * @param op operador que será validado
     * @throws IllegalArgumentException quando o operador não é suportado
     */
    private void validarOperador(String op) {
        if (op == null || !(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }
}
