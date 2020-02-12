
package javaApplication6 ;
 import javax.swing.JOptionPane;

  public class JavaAplication6 {

    
    public static void main(String[] args) {
    String firstNumber = JOptionPane.showInputDialog("Digite o primeiro numeiro inteiro");
    String secondNumber = JOptionPane.showInputDialog("Digite o segundo numero inteiro");
    int number1 =Integer.parseInt(firstNumber) ;
    int number2 = Integer.parseInt(secondNumber);
    int sum = number1 + number2;
    JOptionPane.showMessageDialog( null, "A soma é " + sum, "Soma de dois numeros inteiros", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}

