package biblioteca;
public class Usuariom extends Persona {
    int usuario;
    public Usuario(){}
    public int getUsuario() {
        return usuario;
    }
    public Usuariom(int usuario) {
        this.usuario = usuario;
    }
    public Usuariom(int id_Persona, String nombre, String telefono, int usuario) {
        super(id_Persona, nombre, telefono);
        this.usuario = usuario;
    }
    
}