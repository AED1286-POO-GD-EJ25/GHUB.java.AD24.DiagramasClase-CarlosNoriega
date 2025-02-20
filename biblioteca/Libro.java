package biblioteca;
 public class Libro {
   private int id_Libro;
   private String libro;
   private  String autor;
   private String isbn;
   private boolean disponible;
   
   public Libro(){}

    
    public Libro(int id_Libro, String libro, String autor, String isbn, boolean disponible) {
    this.id_Libro = id_Libro;
    this.libro = libro;
    this.autor = autor;
    this.isbn = isbn;
    this.disponible = disponible;
}
    public String obtenerInformacionLibro(){
        return null;
    }
    
    public void agregarEjemplar(Ejemplar ejemplar){

    }
    public void quitarEjemplar(Ejemplar ejemplar){

    }
    public boolean solicitarPrestamo(Libro libro){
    return true;
}
    public boolean devolverLibro(Libro libro){
    return true;
}


    public int getId_Libro() {
        return id_Libro;
    }


    public String getLibro() {
        return libro;
    }


    public String getAutor() {
        return autor;
    }


    public String getIsbn() {
        return isbn;
    }


    public boolean isDisponible() {
        return disponible;
    }


    
 }
