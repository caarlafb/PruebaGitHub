public class Estatica {
    public static int contador; //es una variable compartida, si uno lo cambia de valor se cambia en todas

    public void incrementar(){
        contador++;
        System.out.println("el valor es: " + contador);
    }

    public void sumar(){
        contador+=6;
        System.out.println("contador ahora vale: " + contador);
    }
}
