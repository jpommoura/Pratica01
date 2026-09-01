public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private String casa;

    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getCoragem() { return coragem; }
    public void setCoragem(double coragem) { this.coragem = coragem; }

    public double getInteligencia() { return inteligencia; }
    public void setInteligencia(double inteligencia) { this.inteligencia = inteligencia; }

    public double getAmbicao() { return ambicao; }
    public void setAmbicao(double ambicao) { this.ambicao = ambicao; }

    public double getLealdade() { return lealdade; }
    public void setLealdade(double lealdade) { this.lealdade = lealdade; }

    public String getCasa() { return casa; }
    public void setCasa(String casa) { this.casa = casa; }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Ambição: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Casa: " + casa);
    }

    public void calcularCasa() {
        double pontosGrifinoria = (2 * coragem) + lealdade;
        double pontosSonserina = (2 * ambicao) + inteligencia;
        double pontosCorvinal = (2 * inteligencia) + ambicao;
        double pontosLufaLufa = ((2 * lealdade) + coragem) / 3;

        double maiorPontuacao = pontosGrifinoria;
        casa = "Grifinória";

        if (pontosSonserina > maiorPontuacao) {
            maiorPontuacao = pontosSonserina;
            casa = "Sonserina";
        }
        if (pontosCorvinal > maiorPontuacao) {
            maiorPontuacao = pontosCorvinal;
            casa = "Corvinal";
        }
        if (pontosLufaLufa > maiorPontuacao) {
            maiorPontuacao = pontosLufaLufa;
            casa = "Lufa-Lufa";
        }
    }
}
