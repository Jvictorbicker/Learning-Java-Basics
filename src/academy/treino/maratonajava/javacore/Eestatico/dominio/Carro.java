package academy.treino.maratonajava.javacore.Eestatico.dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    static private int velocidadeLimite = 250;

    // static faz a velocidadeLimite ser padrao em todas as instancias e ao alterar, ira alterar todos os carros

    public void imprimir() {
        System.out.println("-----------");
        System.out.println(this.marca);
        System.out.println(this.velocidadeLimite);
        System.out.println(this.velocidadeMaxima);
    }


}
