
public class ClaseMadre {

    //ATRIBUTOS-----------------------
    private int id;
    private String nombre;


    //METODOS-----------------------

    public ClaseMadre(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClaseMadre{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
