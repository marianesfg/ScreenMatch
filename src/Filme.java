public class Filme {

    public String nome;
    public int anoDeLancamento;
    public int duracaoEmMinutos;
    public Boolean incluidoNoPlano;
    public Double somaDasAvaliacoes;
    public int totalDeAvaliacoes;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos,
                 Boolean incluidoNoPlano)
    {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = 0.0;
        this.totalDeAvaliacoes = 0;
    }

    public void exibeFichaTecnica()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println(this.nome);
        System.out.println("Lançamento: " + this.anoDeLancamento);
        System.out.println("Duração: " + this.duracaoEmMinutos);
        if (this.incluidoNoPlano)
            System.out.println("Incluso no Plano");
        else
            System.out.println("Não está incluso no Plano");
        System.out.println("-------------------------------------------------------");
    }

    public void avalia(Double nota)
    {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public Double pegaMedia()
    {
        return this.somaDasAvaliacoes/this.totalDeAvaliacoes;
    }
}
