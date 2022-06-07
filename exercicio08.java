import javax.swing.JOptionPane;
public class exercicio08 {
    public static void main(String [] args){

        double pi = 3.142;
        double raio;
        double area;

        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo "));

        area = (raio * raio) * pi;

        JOptionPane.showMessageDialog(null, "A área do círculo é igual a " + String.format("%.2f" , area));
    }
}
