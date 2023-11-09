import javax.swing.JOptionPane;;
public class Lacos1 {
    
    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de A: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de B: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de C: "));
        float soma = n1 + n2;
        
        if(soma > n3){
            System.out.println("\nA soma de A e B e maior que C");
        }else if(soma < n3){
            System.out.println("\nA soma de A e B e menor que C");
        }else{
            System.out.println("\nA soma de A e B e igual a C");
        }
    }
}
