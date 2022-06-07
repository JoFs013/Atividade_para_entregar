import javax.swing.JOptionPane;
public class exercicio04 {
        public static void main(String [] args){
            double altura;
            int escolha;
            double calchomem;
            double calcmulher;
            char cadastrar;

            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
            String [] opcoes = {"Masculino", "Feminino"};
            escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha o seu sexo",
            "Sexo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[1]);

            if (escolha == JOptionPane.CLOSED_OPTION) {
                // Usuário clicou no X do canto da tela.
            } else if (escolha == 0){
                cadastrar = opcoes[escolha].charAt(0); //masculino
                calchomem = (72.7 * altura) - 58;
                JOptionPane.showMessageDialog(null, "O seu peso ideal é : " + String.format("%.2f", calchomem));
               
            }else{
                cadastrar = opcoes[escolha].charAt(1); //feminino
                calcmulher = (62.1 * altura) - 44.7;
                JOptionPane.showMessageDialog(null,"O seu peso ideal é: "+ String.format("%.2f" , calcmulher));
            }



    }
}
