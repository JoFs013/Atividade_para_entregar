import javax.swing.JOptionPane;
public class exercicio05 {
    public static void main(String [] args){

        int num1, num2, num3;
        int resultado;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor "));

        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));

        resultado = num1 + num2+ num3;

        JOptionPane.showMessageDialog(null, "A soma dos valores digitados é: " + resultado);



    }
}
