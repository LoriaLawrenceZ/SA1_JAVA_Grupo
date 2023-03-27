package SA1_JAVA_Grupo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exercicios exercicios = new Exercicios();

        String escolha = "";

        do {
            System.out.println("\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício\n[S] - SAIR\n[Apenas Números]");

            escolha = sc.next();

            switch (escolha) {
                case "1":
                    exercicios.exercicio();
                    break;

                case "S":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
                
                case "s":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
    
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "N";
                    break;
            }

        } while (escolha != "N");

        sc.close();
    }
    
}
