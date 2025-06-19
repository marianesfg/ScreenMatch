public class Filme  extends Titulo {

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


}
