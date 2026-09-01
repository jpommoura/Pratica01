import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private String casa;
    private LocalDate dataNascimento;
    private String codigoMatricula;

    public Aluno(String nome, String sobrenome, LocalDate dataNascimento, double coragem, double inteligencia, double ambicao, double lealdade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getCoragem() { return coragem; }
    public void setCoragem(double coragem) { this.coragem = coragem; }

    public double getInteligencia() { return inteligencia; }
    public void setInteligencia(double inteligencia) { this.inteligencia =
