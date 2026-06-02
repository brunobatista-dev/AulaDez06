// Bruno Batista de Souza
// RA: 1261948820

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.diretor = "Christopher Nolan";
        filme.anoLancamento = 2014;
        filme.duracao = 169;
        filme.nota = 9.2;

        
        filme.exibirDetalhes();
    }
}
