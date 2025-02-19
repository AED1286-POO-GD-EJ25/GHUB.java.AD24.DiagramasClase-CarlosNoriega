package miPrincipal;

public class Principal extends Operaciones {
    public String getGreeting() {
        return residuo();
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());
    }
}