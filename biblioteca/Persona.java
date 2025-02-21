package biblioteca;
public class Persona {
    private int id_Persona;
    private String nombre;
    private  String telefono;
    public Persona(){}

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
        return this.id_Persona;
    }
    public int setid_Persona(int id_Persona){
        return this.id_Persona = id_Persona;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String setNombre(String nombre){
        return this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){}
    
}