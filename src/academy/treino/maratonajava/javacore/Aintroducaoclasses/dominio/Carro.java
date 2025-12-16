package academy.treino.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public void imprime() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
        System.out.println("------------------------");
    }
}
