import java.util.Scanner;
public class Switch2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCodigo 1: \tGerente");
        System.out.println("\nCodigo 2: \tVendedor");
        System.out.println("\nCodigo 3: \tSupervisor");
        System.out.println("\nCodigo 4: \tMotorista");
        System.out.println("\nCodigo 5: \tEstoquista");
        System.out.println("\nCodigo 6: \tTecnico de TI");

        System.out.println("\nDigite o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("\nDigite o codigo do cargo: ");
        int codigo = scanner.nextInt();
        System.out.println("\nDigite seu salario: ");
        float salario = scanner.nextFloat();

        switch (codigo) {
            case 1:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Gerente \nSalario: " + 
                (salario + (0.10 * salario)));
                break;
        
            case 2:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Vendedor \nSalario: " + 
                (salario + (0.07 * salario)));
                break;
        
            case 3:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Supervisor \nSalario: " + 
                (salario + (0.09 * salario)));
                break;

            case 4:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Motorista \nSalario: " + 
                (salario + (0.06 * salario)));
                break;

            case 5:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Estoquista \nSalario: " + 
                (salario + (0.05 * salario)));
                break;

            case 6:
                System.out.println("Nome do colaborador: " + nome + "Cargo: Tecnico de TI \nSalario: " + 
                (salario + (0.08 * salario)));
                break;

            default:
                System.out.println("Codigo invalido!");
        }
        scanner.close();
    }
    
}
