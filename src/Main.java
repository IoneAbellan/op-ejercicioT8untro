public class Main {

    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setNombre("Ione");
        persona.setTelefono(99887766);

        System.out.println("Edad: " + persona.getEdad() + ", nombre: " + persona.getNombre() + ", telefono: " + persona.getTelefono());

    }

}
