package SA1_JAVA_Grupo;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in, "latin1");

    public void exercicio() {
        double peso, altura, pesoIdeal, imc;
        int  sexo, idade;
        String  nome;

        System.out.println(
                "----------------------------------------Academia de Ginástica Cavaleiros Jedis----------------------------------------");

        System.out.println("\nInforme o seu Nome");
        nome = sc.next();

        System.out.println("\nInforme a sua Idade\n[Apenas números]");
        idade = sc.nextInt();

        System.out.println("Informe sua Altura\n[Em metros]\n[Apenas números]");
        altura = sc.nextDouble();

        System.out.println("Informe seu Sexo\n[1] - Maculino\n[2] - Feminino");
        sexo = sc.nextInt();

        while (sexo != 1 && sexo != 2) { 
            System.out.println("Número inválido\nInforme um número entre 1 e 2");
            sexo = sc.nextInt();
        }

        if (sexo == 1) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo == 2) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4));
        }
        
        System.out.println("Informe seu Peso \n[Em quilogramas]\n[Apenas números]");
        peso = sc.nextDouble();


        imc = peso / (altura * altura);

        if ( (imc >= 27) && (idade >= 25 && idade <= 45) ) {
            System.out.println( "As atividades recomendadas são: Musculação Intensa e Luta" );
        }
        else if ( (imc >= 27) && (idade >= 16 && idade < 25) ) {
            System.out.println( "A atividade recomendada é: luta" );
        }
        else if ( (imc >= 27) && (idade >= 46 && idade <= 55) ){
            System.out.println( "As atividades recomendadas são: Luta e Pilates" );
        }
        else if ((imc > 27) && (idade >= 56)) {
            System.out.println( "A atividade recomendada é: Pilates" );
        }


        else if (  (imc > 20 && imc < 27) && (idade >= 16 && idade < 25)  ){
            System.out.println("As atividades recomendadas são: Musculação Moderada e Dança");
        }
        else if ( (imc > 20 && imc < 27) && (idade >= 25 && idade <= 55) ) {
            System.out.println("As atividades recomendadas são: Corrida, Musculação Moderada e Dança");
        }
        else if ( (imc > 20 && imc < 27) && (idade >= 56 && idade <= 65)){
            System.out.println("As atividades recomendadas são: Corrida e Dança");
        }
        else if ((imc > 20 && imc < 27) && (idade >= 66)){
            System.out.println("A atividade recomendada é: Dança");
        }


        else if ( (imc >= 27) && (idade >= 16 && idade < 25) ) {
            System.out.println("As atividades recomendadas são: Musculação Leve e Yoga");
        }
        else if ( (imc >= 27) && (idade >= 25 && idade <= 45) ) {
            System.out.println("A atividade recomendada é: Yoga");
        }
        else {
            System.out.println("As atividades recomendadas são: Musculação Leve e Yoga");
        }
        
        

        /*
         * IMC <= 20 - Atividade Difícil
         * IMC > 20 <27 - Atividade Moderada
         * IMC >= 27 - Atividade Leve
         * 
         * Atividade Leve - Perder Peso
         * Atividade Moderada - Peso Normal
         * Atividade Difícil - Precisa Ganhar Massa Muscular
         * 
         * Faixa Etária
         * Idade I - 16 a 25 anos
         * Idade II - 25 a 35 anos
         * Idade III – 36 a 45 anos
         * Idade IV – 46 a 55 anos
         * Idade V – 56 a 65 anos
         * Idade VI – 66+
         * 
         * Atividade                Nível       Faixa Etária
         * Musculação Intensa       Difícil     II, III
         * Luta                     Difícil     I, II, III, IV
         * Pilates                  Difícil     IV, V, VI
         * Musculação Moderada      Moderada    I, II, III, IV
         * Dança                    Moderada    Todas
         * Corrida                  Moderada    II, III, IV, V
         * Musculação Leve          Leve        I, IV, V, VI
         * Ioga                     Leve        Todas
         * 
         * Sugerir Todos os exercícios em que encaixar
         */
    }
}
