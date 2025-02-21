package biblioteca;
public class Usuario extends Persona {
    private int numSocio;
    
    public Usuario(){}

    public Usuario(int id_Persona, String nombre, String telefono, int numSocio) {
        super(id_Persona, nombre, telefono);
        this.numSocio = numSocio;
    }
    public void cosultarPrestamos(){

    }
    public void reservar(Libro libro){

    }
    public int getNumSocio(){
        return numSocio;
    }
    public void setNumSocio(int numSocio){
        this.numSocio = numSocio;
    }
    
    
}