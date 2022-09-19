public class Calculadora {
    public static double PI = 3.14f;

    public static double circunferencia(double raio){
        return raio * PI * 2;
    }

    public static double volume(double raio){
        return raio * raio * raio * PI * 4 / 3;
    }

}
