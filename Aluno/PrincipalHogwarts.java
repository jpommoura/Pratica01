import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PrincipalHogwarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        int quantidade = 0;
        int opcao;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Exibir alunos de uma casa (com total)");
            System.out.println("4. Exibir alunos por casa (agrupado)");
            System.out.println("5. Exibir alunos maiores de idade");
            System.out.println("6. Exibir alunos menores de idade");
            System.out.println("7. Buscar alunos por sobrenome");
            System.out.println("8. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (quantidade >= 10) {
                    System.out.println("Limite máximo de 10 alunos atingido!");
                } else {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Sobrenome: ");
                    String sobrenome = sc.nextLine();

                    LocalDate dataNascimento = null;
                    boolean dataValida = false;
                    while (!dataValida) {
                        System.out.print("Data de nascimento (dd/MM/yyyy): ");
                        String dataTexto = sc.nextLine();
                        try {
                            dataNascimento = LocalDate.parse(dataTexto, formato);
                            if (dataNascimento.isAfter(LocalDate.now())) {
                                System.out.println("Data inválida: não pode ser no futuro.");
                            } else {
                                dataValida = true;
                            }
                        } catch (DateTimeParseException e) {
                            System.out.println("Data inválida! Use o formato dd/MM/yyyy.");
                        }
                    }

                    System.out.print("Coragem (0 a 10): ");
                    double coragem = sc.nextDouble();

                    System.out.print("Inteligência (0 a 10): ");
                    double inteligencia = sc.nextDouble();

                    System.out.print("Ambição (0 a 10): ");
                    double ambicao = sc.nextDouble();

                    System.out.print("Lealdade (0 a 10): ");
                    double lealdade = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, sobrenome, dataNascimento, coragem, inteligencia, ambicao, lealdade);
                    aluno.calcularCasa();
                    aluno.gerarCodigoMatricula(quantidade + 1);

                    alunos[quantidade] = aluno;
                    quantidade++;

                    System.out.println("\n" + nome + " foi selecionado para " + aluno.getCasa() + "!");
                    System.out.println("Matrícula: " + aluno.getCodigoMatricula());
                }

            } else if (opcao == 2) {
                if (quantidade == 0) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    for (int i = 0; i < quantidade; i++) {
                        alunos[i].exibirInformacoes();
                        System.out.println("------------------------");
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite a casa (Grifinória, Sonserina, Corvinal, Lufa-Lufa): ");
                String casaBusca = sc.nextLine();
                int total = 0;

                for (int i = 0; i < quantidade; i++) {
                    if (alunos[i].verificarCasa(casaBusca)) {
                        alunos[i].exibirInformacoes();
