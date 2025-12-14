package academy.treino.maratonajava.introducao;

public class Switch {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte day = 5;
        //char int byte short enum string
        switch (day) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
