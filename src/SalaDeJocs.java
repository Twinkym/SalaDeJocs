import java.util.Scanner;

public class SalaDeJocs {

    private static final String NEN_PREU = "gratis";
    private static final int JOVE_PREU = 5;
    private static final int ADULT_PREU = 10;

    public static void main(String[] args) {

        int age = askForAge();
        getAgeOption(age);

    }

    private static int askForAge() {
        System.out.println("Quina edat tens?");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static void getAgeOption(int age) {
        if (age <= 4) {
            System.out.println("Tu entrada es: " + NEN_PREU +" Euros");
        }
        else if (age >5 && age < 18){

                System.out.println("La entrada son: " + JOVE_PREU + " Euros");
        }
        else {
                System.out.println("La entrada son: " + ADULT_PREU + " Euros");

        }


        }
    }
