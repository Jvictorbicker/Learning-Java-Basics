package academy.treino.maratonajava.javacore.Bintroducaometodos.testes;

import academy.treino.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioMetodos {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Victor";
        funcionario.idade = 19;

        funcionario.imprimir();
        funcionario.meanSalary();
    }
}
