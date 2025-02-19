package miPrincipal;
public class Operaciones{
    int suma;
    int resta;
    int multiplicar;
    int dividir;
    public Operaciones() {

    }
    public Operaciones (int suma, int resta, int multiplicar, int dividir){
        this.suma = suma;
        this.resta = resta;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }
    public void Sumar() {
        System.out.println("Sumatoria: ");
    }
    public void Restar(){
        System.out.println("Restar: ");
    }
    public void Multiplicar(){
        System.out.println("Multiplicar: ");
    }
    public void Dividir(){
        System.out.println("Dividir: ");
    }
    public String residuo() {
        return "Residuo";
    }
}