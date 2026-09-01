import java.util.Scanner;

public class PrincipalHogwarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[100];
        int quantidade = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("\nNome do aluno: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Coragem (0 a 10): ");
            double coragem = sc.nextDouble();

            System.out.print("Inteligência (0 a 10): ");
            double inteligencia = sc.nextDouble();

            System.out.print("Ambição (0 a 10): ");
            double ambicao = sc.nextDouble();

            System.out.print("Lealdade (0 a 10): ");
            double lealdade = sc.nextDouble();

            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade);
            aluno.calcularCasa();

            alunos[quantidade] = aluno;
            quantidade++;

            System.out.println("\n" + nome + " foi selecionado para " + aluno.getCasa() + "!");

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            continuar = sc.next();
        }

        System.out.println("\n=== Resumo de todos os alunos cadastrados ===");
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirInformacoes();
            System.out.println("------------------------");
        }

        sc.close();
    }
}
