package biblioteca;
public class Persona extends Libro {
    int id_Persona;
    String nombre;
    String telefono;

    public Persona(){

    }
    public Persona(int id_Persona, String nombre, String telefono ){
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.telefono = telefono;
    }
public boolean solicitarPrestamo(Libro libro){
    return true;
}
    public boolean devolverLibro(Libro libro){
        return true;
    }
    public int getid_Persona(){
        return id_Persona;
    }
    public int setid_Persona(int id_Persona){
        return this.id_Persona = id_Persona;
    }
    public int getnombre(){
        return nombre;
    }
    public int setnombre(String nombre){
        return this.nombre = nombre;
    }
}