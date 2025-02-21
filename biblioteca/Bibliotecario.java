package biblioteca;

public class Bibliotecario extends Persona {
   private int numEmpleado;
   
    protected Bibliotecario(){}

    public Bibliotecario(int id_Persona, String nombre, String telefono, int numEmpleado) {
        super(id_Persona, nombre, telefono);
        this.numEmpleado = numEmpleado;
    }

    public String registrarPrestamo(Usuario usuario, Ejemplar ejemplar){
        return null;
    }
    public void registrarDevolucion(Prestamo prestamo){

    }
    public Libro busLibro(String libro){
        return null;
    }

    
}