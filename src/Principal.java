
public class Principal {
    public static void main(String[] args) {
        ClaseHija hija1= new ClaseHija(1, "Hija 1");

        hija1.metodo1();
        hija1.metodo2();
        hija1.metodo3();

        System.out.println(hija1);

        System.gc(); //garbage collector
    }
}
