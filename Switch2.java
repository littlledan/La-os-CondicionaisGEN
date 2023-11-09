import java.util.Scanner;
public class Switch2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float n2 = scanner.nextFloat();
        System.out.print("digite a operacao: ");
        char sinal = scanner.next().charAt(0);

        switch(sinal){
            case '+': System.out.print(n1 + n2);
            break;
            
            case '-': System.out.print((n1 - n2));
            break;

            case '*':
            case 'x':
            case 'X': System.out.print((n1 * n2));
            break;

            case '/': 
                if(n2 != 0){
                    System.out.print((n1 / n2));
                } else{
                    System.out.print("Impossivel dividir por 0");
                } 
            break; 
            default: System.out.print("caracter n existente");
               

        } scanner.close();

    }
    
}
