public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hola de nuevo, mundo.");

        Estatica estatica1 = new Estatica();
        estatica1.incrementar();
        Estatica estatica2 = new Estatica();
        estatica2.incrementar();
        estatica1.sumar();
        Estatica estatica3 = new Estatica();
        estatica3.incrementar();
        Estatica estatica4 = new Estatica();
        estatica4.incrementar();
        Estatica estatica5 = new Estatica();
        estatica5.incrementar();

        estatica1.incrementar();
    }
}