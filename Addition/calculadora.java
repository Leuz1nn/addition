package Addition;

import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String operacaoEscolhida = (String) JOptionPane.showInputDialog(
                null,
                "Escolha a operação desejada:",
                "Calculadora",
                JOptionPane.PLAIN_MESSAGE,
                null,
                operacoes,
                operacoes[0]);
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        double resultado = 0;
        switch (operacaoEscolhida) {
            case "Soma":
                resultado = numero1 + numero2;
                break;
            case "Subtração":
                resultado = numero1 - numero2;
                break;
            case "Multiplicação":
                resultado = numero1 * numero2;
                break;
            case "Divisão":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return;
        }
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
