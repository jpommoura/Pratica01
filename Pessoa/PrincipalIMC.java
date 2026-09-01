import java.util.Scanner;

public class PrincipalIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.next();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura (em metros, ex: 1.75): ");
        double altura = sc.nextDouble();

        System.out.print("Peso (em kg): ");
        double peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
        pessoa.calculaIMC();

        System.out.println("\nIMC de " + pessoa.getNome() + ": " + pessoa.getImc());
        System.out.println("Classificação: " + pessoa.informaObesidade());

        sc.close();
    }
}
