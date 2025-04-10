import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
    int idade;
          idade = Integer.parseInt(JOptionPane.showInputDialog("coloque sua idade:")); 
          if (idade>=18)
          JOptionPane.showMessageDialog(null,"voce pode votar");
          else 
          JOptionPane.showMessageDialog(null,"voce nao pode votar");                           
    }
}