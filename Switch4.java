import java.util.Scanner;
public class Switch4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float conta = 1000;
        System.out.println("\nCodigo 1 \tSaldo");
        System.out.println("\nCodigo 2 \tSaque");
        System.out.println("\nCodigo 3 \tDeposito");
        System.out.println("\nInforme o codigo da operacao: ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Saldo em conta: " + conta);
                break;
            
            case 2:
                System.out.println("\nInsira o valor de saque: ");
                float valor = scanner.nextFloat();
                float resultado = conta - valor;
                if(resultado >= 0 ){
                    System.out.println("Saldo atual: " + resultado);;
                }else{
                    System.out.println("Saldo insuficiente");
                }
                break;

            case 3:
                System.out.println("\nInsira o valor do deposito: ");
                float valor2 = scanner.nextFloat();
                float resultado2 = conta + valor2;
                System.out.println("\nSaldo atual de: " + resultado2);
                break;
            default:
                System.out.println("Operacao invalida!");
        }
        scanner.close();
    }
    
}
