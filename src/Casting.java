package src;

public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESIMACIÓN: elimina la parte decimal
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud: da valor exacto con todo y decimales
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
    }
}
