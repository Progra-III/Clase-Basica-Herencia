
//NOTA
//Java no permite realizar herencia multiple, si se habilita la siguiente linea genera error
//ClaseHija extends ClaseMadre, ClaseMadre2 Implements Interfaz

public class ClaseHija extends ClaseMadre implements Interfaz, Interfaz2{

public ClaseHija(int id, String nombre){ super(id,nombre);}


    @Override
    public void metodo1() {
        System.out.println("Ejecuta metodo 1");
    }

    @Override
    public void metodo2() {
        System.out.println("Ejecuta metodo 2");
    }

    @Override
    public void metodo3() {
        System.out.println("Ejecuta metodo 3");
    }
}
