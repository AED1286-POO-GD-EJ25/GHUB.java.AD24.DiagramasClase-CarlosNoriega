package biblioteca;
public class Invitado extends Persona {

    private String institucion;

    public Invitado(){}

    public Invitado(int id_Persona, String nombre, String telefono, String institucion){
        super( id_Persona , nombre ,  telefono);
        this.institucion = institucion;
    }

    public void consultarPrestamos(){}
    public void 
}