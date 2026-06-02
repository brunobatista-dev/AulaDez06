public class Filme {
    
    String titulo;
    String diretor;
    int anoLancamento;
    int duracao; 
    double nota; 

  

    
    public String duracaoFormatada() {
        int horas = duracao / 60;   
        int minutos = duracao % 60; 
        return horas + "h " + minutos + "m";
    }

    
    public boolean recomendado() {
        return nota >= 7.0;
    }

    
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + " (" + anoLancamento + ")");
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoFormatada());
        System.out.println("Nota: " + nota + "/10");
        
       
        if (recomendado()) {
            System.out.println("Status: 🔥 Altamente Recomendado!");
        }
    }
}