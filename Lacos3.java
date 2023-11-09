import java.util.Scanner;
public class Lacos3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        System.out.println("Iforme sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Primeira vez doando sangue? (true para sim, false para nao)");
        boolean primeira = scanner.nextBoolean();

        if(idade >= 18 && idade <= 69){
            if(idade >= 60 && idade <= 69 ){
                if(primeira){
                    System.out.println(nome + " , voce nao esta apto a doar sangue.");
                }else{
                    System.out.println(nome + " , voce esta apto a doar sangue.");
                }
            }else{
                System.out.println(nome + " , voce esta apto a doar sangue.");
            }
        }else{
            System.out.println();
        }
    }
    
}
