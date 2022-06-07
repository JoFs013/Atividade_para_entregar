import javax.swing.JOptionPane;
public class exercicio06 {
    public static void main(String [] args){

        double nota1, nota2, nota3;
        double resultado;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota "));

        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota "));

        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        resultado = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A média aritmética é igual a: " + String.format("%.1f" , resultado));
    }
}
