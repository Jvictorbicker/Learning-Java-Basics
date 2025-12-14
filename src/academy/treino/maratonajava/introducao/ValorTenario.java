package academy.treino.maratonajava.introducao;

public class ValorTenario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "eu vou doar R$500 mensais";
        String mensagemNaoDoar = "eu nao vou doar R$500 mensais";

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
