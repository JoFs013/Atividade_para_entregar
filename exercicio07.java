import javax.swing.JOptionPane;
public class exercicio07 {
    public static void main(String [] args){

        double base;
        double altura;
        double resultado;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo "));

        resultado = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é " + String.format("%.2f", resultado));
        
    }
}
