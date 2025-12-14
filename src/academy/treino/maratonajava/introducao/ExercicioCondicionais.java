package academy.treino.maratonajava.introducao;

public class ExercicioCondicionais {
    public static void main(String[] args) {
        double salary = 35000D;
        double tax1 = 9.70;
        double tax2 = 37.35;
        double tax3 = 49.50;

        if (salary >= 0 && salary <= 32712){
            System.out.println("vai pagar " + tax1);
        }
        else if (salary >= 34713 && salary <= 68507) {
            System.out.println("vai pagar " + tax2);
        }
        else if (salary > 68508){
            System.out.println("vai pagar " + tax3);
        }
    }
}
