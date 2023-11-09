import java.util.Scanner;
public class Lacos4 {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String p1, p2, p3;
        System.out.println("\nEscolha:\n\n\t-Vertebrado- \t-Invertebrado-");
        p1 = scanner.nextLine();
        System.out.println("\nEscolha:\n\n\t-Ave- \t-Mamifero- \t-Inseto- \t-Anelideo-");
        p2 = scanner.nextLine();
        System.out.println("\nEscolha:\n\n\t-Carnivoro- \t-Onivoro- \t-Herbivoro- \t-Hematofago-");
        p3 = scanner.nextLine();

        if(p1.equalsIgnoreCase("vertebrado")){
            if(p2.equalsIgnoreCase("ave")){
                if(p3.equalsIgnoreCase("carnivoro")){
                    System.out.println("Segundo os dados informados, seu animal e: Aguia");
                }else if(p3.equalsIgnoreCase("onivoro")){
                    System.out.println("Segundo os dados informados, seu animal e: Pomba");
                }else{
                    
                }
            }else if(p2.equalsIgnoreCase("mamifero")){
                if(p3.equalsIgnoreCase("onivoro")){
                    System.out.println("Segundo os dados informados, seu animal e: Homem");
                }else if(p3.equalsIgnoreCase("herbivoros")){
                    System.out.println("Segundo os dados informados, seu animal e: Vaca");
                }else{
                    System.out.println("Dados nao encontrados!");
                }
            }else{
                
            }
        }else if(p1.equalsIgnoreCase("invertebrado")){
            if(p2.equalsIgnoreCase("inseto")){
                if(p3.equalsIgnoreCase("hematofago")){
                    System.out.println("Segundo os dados informados, seu animal e: Pulga");
                }else if(p3.equalsIgnoreCase("herbivoro")){
                    System.out.println("Segundo os dados informados, seu animal e: lagarta");
                }else{
                
                }
            }else if(p2.equalsIgnoreCase("anelideo")){
                if(p3.equalsIgnoreCase("hematofago")){
                    System.out.println("Segundo os dados informados, seu animal e: Sanguessuga");
                }else if(p3.equalsIgnoreCase("onivoro")){
                    System.out.println("Segundo os dados informados, seu animal e: Minhoca");
                }else{
                    System.out.println("Dados nao encontrados!");
                }
            }else{
                
            }
        }else{
            
        }
        scanner.close();
    }
}
