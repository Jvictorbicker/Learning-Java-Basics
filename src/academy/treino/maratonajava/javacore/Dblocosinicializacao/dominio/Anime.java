package academy.treino.maratonajava.javacore.Dblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("bloco de inicilizacao, sempre executado antes do construtor");
    }

    public Anime() {
        episodios = new int [1000];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int ep : this.episodios) {
            System.out.print(ep + " ");
        }
    }
}
