public class Main{
    public void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre = "Javier";
        cliente.telefono = 34120000;
        cliente.credito = true;

        System.out.println(cliente);

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 1500;
        trabajador.nombre = "Roberto";
        trabajador.edad = 45;
        trabajador.telefono = 34130011;

        System.out.println(trabajador);
    }


public static class Persona {
    int edad;
    String nombre;
    int telefono;

}
public static class Cliente extends Persona {
    boolean credito;
}

public static class Trabajador extends Persona {
    int salario;
}
}