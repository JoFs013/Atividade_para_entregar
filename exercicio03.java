import javax.swing.JOptionPane;
public class exercicio03 {
    public static void main (String [] args){

        int num;
        int result;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número !!!"));

        result = num % 2;

        if(result == 0){
            JOptionPane.showMessageDialog(null, "O número que você digitou é par");  

        } else{
            JOptionPane.showMessageDialog(null, "O número que você digitou é ímpar");
        }


    }
}