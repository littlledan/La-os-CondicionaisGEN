import javax.swing.JOptionPane;
public class Lacos2 {

    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));

        if(n1 % 2 == 0 && n1 >= 2) {
            System.out.println("\nO numero " + n1 + " e par e positivo!");
        }else if(n1 % 2 == 0 && n1 < 0) {
            System.out.println("\nO numero " + n1 + " e par e negativo!");
        }else if(n1 % 2 == 1 && n1 >= 1) {
            System.out.println("\nO numero " + n1 + " e impar e positivo!");
        }else{
            System.out.println("\nO numero " + n1 + " e impar e negativo!");
        }
    
    }
}
