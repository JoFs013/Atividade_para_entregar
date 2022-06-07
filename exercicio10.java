import javax.swing.JOptionPane;
public class exercicio10{
    public static void main(String [] args){

        double valorproduto;
        double desconto = 0.10;
        double resultado;
        double resultadocomdesconto;

        valorproduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto "));

        resultado = valorproduto * desconto;

        resultadocomdesconto = valorproduto - resultado;

        JOptionPane.showMessageDialog(null, "O desconto foi de " + String.format("%.2f", resultado) + "\n" + "E o valor do produto com desconto ficou igual a " + String.format("%.2f", resultadocomdesconto));
    }
}
