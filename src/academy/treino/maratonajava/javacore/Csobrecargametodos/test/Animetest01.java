package academy.treino.maratonajava.javacore.Csobrecargametodos.test;

import academy.treino.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Romance", 73, "Darling in the franxx");
        anime.init("Romance", 73, "Darling in the franxx", "livro");
        anime.imprimir();
    }
}
