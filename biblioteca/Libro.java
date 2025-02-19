package biblioteca;
 public class Libro {
    int id_Libro;
    String libro;
    String autor;
    String isbn;
    boolean disponible;
    public Libro(){}

    public Libro(int id_Libro, String libro, String autor, String isbn, boolean disponible){
        this.id_Libro = id_Libro;
        this.libro = libro;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;

    }
    
 }
