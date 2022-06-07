import javax.swing.JOptionPane;
public class exercicio09 {
    public static void main(String[] args){

        double num;
        double resultadoquadrado;
        double resultadocubo;
        double resultadoraiz;
        

        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número positivo "));

        resultadoquadrado = num * num;

        resultadocubo = num * num * num ;

        resultadoraiz = Math.sqrt(num);

        JOptionPane.showMessageDialog(null, "O número digitado ao quadrado é igual a: " + String.format("%.0f", resultadoquadrado) +"\n"+ "\n" + "O número digitado ao cubo é igual a: " + String.format("%.0f", resultadocubo) + "\n"+ "\n" + "A raiz do número digitado é: " + String.format("%.2f", resultadoraiz));

    }
}
