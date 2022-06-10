package App;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.nombre = "Mariana";
        cliente.edad = 21 ;
        cliente.telefono =2594492;
        cliente.credito = 210.528;
        System.out.println("El nombre del cliente es " + cliente.nombre + ", tiene " + cliente.edad
                + " años, su numero de telefono es " + cliente.telefono + " y en este momento su credito es de "
                + cliente.credito + " pesos colombianos");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Juan David";
        trabajador.edad = 25;
        trabajador.telefono = 2646843;
        trabajador.salario = 2500000;
        System.out.println("El nombre del trabajador es " + trabajador.nombre + ", tiene " + trabajador.edad
                + " años, su numero de telefono es " + trabajador.telefono + " y en este momento su salario es de "
                + trabajador.salario + " de pesos");
    }
}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;
}

class Cliente extends Persona {
   public double credito;
}
class Trabajador extends Persona {
    public int salario;
}
