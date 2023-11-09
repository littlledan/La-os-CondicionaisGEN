import java.util.Scanner;
public class Switch1 {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\tDOG DE OSASCO");
        System.out.println("1-\tCachorro Quente \t\t\tR$ 10,00");
        System.out.println("2-\tX-salada \t\t\t\tR$ 15,00");
        System.out.println("3-\tX-bacon \t\t\t\tR$ 18,00");
        System.out.println("4-\tBauru \t\t\t\t\tR$ 12,00");
        System.out.println("5-\tRefrigerante \t\t\t\tR$  8,00");
        System.out.println("6-\tSuco de Laranja \t\t\tR$ 13,00");

        System.out.println("\nDigite o codigo do produto: ");
        int produto = scanner.nextInt();
        System.out.println("\nQuantidade do produto: ");
        int quantidade = scanner.nextInt();


    switch(produto) {
        case 1: 
        System.out.println("Voce pediu " + quantidade + " Cachorro Quente.");
        System.out.println("O valor deu: " + (quantidade * 10) + " Reais");
        break;

        case 2:
        System.out.println("Voce pediu " + quantidade + " X-salada.");
        System.out.println("O valor deu: " + (quantidade * 15) + " Reais");
        break;

        case 3:
        System.out.println("Voce pediu " + quantidade + " X-bacon.");
        System.out.println("O valor deu: " + (quantidade * 18) + " Reais");
        break;

        case 4:
        System.out.println("Voce pediu " + quantidade + " Bauru.");
        System.out.println("O valor deu: " + (quantidade * 12) + " Reais");
        break;

        case 5:
        System.out.println("Voce pediu " + quantidade + " Refrigerante.");
        System.out.println("O valor deu: " + (quantidade * 8) + " Reais");
        break;

        case 6:
        System.out.println("Voce pediu " + quantidade + " Suco de Laranja.");
        System.out.println("O valor deu: " + (quantidade * 13) + " Reais");
        break;
        default:
            System.out.println("Opcao Invalida!");
        }
        scanner.close();
    }
}