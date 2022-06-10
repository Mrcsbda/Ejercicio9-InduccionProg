package App;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNombre("Mariana");
        cliente.setEdad(21);
        cliente.setTelefono(2594492);
        cliente.setCredito(210.528);
        System.out.println("El nombre del cliente es " + cliente.getNombre() + ", tiene " + cliente.getEdad()
                + " años, su numero de telefono es " + cliente.getTelefono() + " y en este momento su credito es de "
                + cliente.getCredito() + " pesos colombianos");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Mariana");
        trabajador.setEdad(21);
        trabajador.setTelefono(2594492);
        trabajador.setSalario(1000000);
        System.out.println("El nombre del trabajador es " + trabajador.getNombre() + ", tiene " + trabajador.getEdad()
                + " años, su numero de telefono es " + trabajador.getTelefono() + " y en este momento su salario es de "
                + trabajador.getSalario() + " de pesos");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}
class Trabajador extends Persona {
    private int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}
