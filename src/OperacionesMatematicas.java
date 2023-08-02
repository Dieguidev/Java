package src;

public class OperacionesMatematicas {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // Este metodo redondea hacia arriba
        System.out.println(Math.ceil(x)); //3

        //Este metodo redondea hacia abajo
        System.out.println(Math.floor(x));

        //Este metodo devuelve un numero elevado a otro numero
        System.out.println(Math.pow(x,y));

        //Devuelve el mayor
        System.out.println(Math.max(x,y));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
