package AtividadeGrupo;

import java.util.Scanner;

/**
 * AtividadeGrupo
 */
public class AtividadeGrupo {
    Scanner sc = new Scanner(System.in);

    public void AtividadeGrupo() {
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("(Permitido a partir dos 16 anos) Informe sua idade:");
        int idade = sc.nextInt();
        System.out.println("Informe seu sexo  1 (masculino); 2 (feminino): ");
        int sexo = sc.nextInt();
        System.out.println("Informe sua altura (metros)");
        double altura = sc.nextDouble();
        System.out.println("Informe seu peso (kg)");
        double peso = sc.nextDouble();
        double pesoIdeal = 0;

        if (sexo == 1) {
            pesoIdeal = (altura * 72.7) - 58;
            System.out.println("O peso ideal é :" + pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (altura * 62.1) - 44.7;
            System.out.println("O peso ideal é :" + pesoIdeal);
        } else {
            System.out.println("DIGITE UM VALOR VALIDO, 1 (MASCULINO) OU 2 (FEMININO)");
        }

        // Quantos quilos precisam ganhar/perder

        if (sexo == 1 && peso > pesoIdeal) {
            System.out.println(nome + ", precisa perder " + (peso - pesoIdeal) + "Kg");
        } else if (sexo == 1 && peso < pesoIdeal) {
            System.out.println(nome + ", precisa ganhar " + (pesoIdeal - peso) + "Kg");
        }
        if (sexo == 2 && peso > pesoIdeal) {
            System.out.println(nome + ", precisa perder " + (peso - pesoIdeal) + "Kg");
        } else if (sexo == 2 && peso < pesoIdeal) {
            System.out.println(nome + ", precisa ganhar " + (pesoIdeal - peso) + "Kg");
        }

        // Cálculo IMC

        double imc = peso / (altura * altura);
        int imcfe = 0;
        System.out.println(nome + ", seu IMC é " + imc);
        if (imc < 20) {
            imcfe = 1; // abaixo do peso
            System.out.println(nome + ", está abaixo do peso. Sugestão é para ganhar massa muscular");
        } else if (imc > 20 && imc < 27) {
            imcfe = 2; // peso normal
            System.out.println(nome + ", está no peso normal. Sugestão é de atividade moderada");
        } else if (imc > 27) {
            imcfe = 3; // acima do peso
            System.out.println(nome + ", está acima do peso. Sugestão é de atividade leve para perder peso");
        } else {
            System.out.println(" Valor inválido");
        }

        // Faixa etária do aluno
        int idadefe = 0;
        if (idade > 16 && idade <= 25) {
            idadefe = 1;

        } else if (idade > 25 && idade <= 35) {
            idadefe = 2;

        } else if (idade > 36 && idade <= 45) {
            idadefe = 3;
        } else if (idade > 46 && idade <= 55) {
            idadefe = 4;
        } else if (idade > 56 && idade <= 65) {
            idadefe = 5;
        } else if (idade > 66) {
            idadefe = 6;
        } else {
            System.out.println("Valor inválido");
        }

        // Relação de atividades com peso e idade
        if (imcfe == 1 && (idadefe == 1 || idadefe == 2 || idadefe == 3 || idadefe == 4)) {
            System.out.println(nome + ", pode fazer luta");
        }
        if (imcfe == 1 && (idadefe == 2 || idadefe == 3)) {
            System.out.println(nome + ", pode fazer musculação intensa");
        }
        if (imcfe == 1 && (idadefe == 4 || idadefe == 5 || idadefe == 6)) {
            System.out.println(nome + ", pode fazer pilates");
        }
        if (imcfe == 2 && (idadefe == 1 || idadefe == 2 || idadefe == 3 || idadefe == 4)) {
            System.out.println(nome + ", pode fazer musculação moderada");
        }
        if (imcfe == 2 && (idadefe == 2 || idadefe == 3 || idadefe == 4 || idadefe == 5)) {
            System.out.println(nome + ", pode fazer corrida");
        }

        if (imcfe == 2) {
            System.out.println(nome + ", pode fazer corrida");
        }

        if (imcfe == 3 && (idadefe == 1 || idadefe == 4 || idadefe == 5 || idadefe == 6)) {
            System.out.println(nome + ", pode fazer musculação leve");
        }
        if (imcfe == 3) {
            System.out.println(nome + ", pode fazer ioga");
        }

    }
}
