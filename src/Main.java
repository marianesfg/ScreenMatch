//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme filme;

        System.out.println("");

        filme = new Filme("A passagem", 2005, 120, true);

        filme.exibeFichaTecnica();
        filme.avalia(6.5);
        System.out.println(filme.pegaMedia().toString());

    }
}