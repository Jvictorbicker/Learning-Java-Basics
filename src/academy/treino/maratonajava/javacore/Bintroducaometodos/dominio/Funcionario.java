package academy.treino.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            System.out.println("sem salarios");
            return;
        }
        for (int i = 0; i <salario.length; i++) {
            System.out.println("Salario: " + salario[i]);        }
    }
    public void meanSalary() {
        if (salario == null) {
            return;
        }

        double soma = 0;

        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        double media = soma / salario.length;
        System.out.println("Media: " + media);
    }
}
