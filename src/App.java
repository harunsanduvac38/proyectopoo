import com.objetos.Persona;

public class App {
    public static void main(String[] args) {
        
        try{
        System.out.println("\n Probando la clase Persona");

        // Cuando hablamos de clases, necesitamos objetos para trabajar con dichas clases
        // Instanciamos el objeto persona

        Persona person = new Persona();
        // Ya podemos utilizar la persona y sus propiedades :
        person.setNombre("Luis");
        // person.apellidos = "Lopez";
        // person.edad = 29;
        System.out.println(person.getNombre());


        person.setApellidos("Lopez");
        System.out.println(person.getApellidos());
        

        person.setEdad(23);
        System.out.println(person.getEdad());

        person.setGenero(Persona.tipoGenero.MASCULINO);
        System.out.println("Género: " + person.getGenero());

        System.out.println("Nombre Completo: " + person.getNombreCompleto());

        System.out.println("Nombre Completo Mayuscula: " + person.getNombreCompleto(2));

        System.out.println("Apellido y Nombre: " + person.getNombreCompleto(false));

        System.out.println("Nombre Completo Separado: " + person.getNombreCompleto(" - "));


        System.out.println("\n\n");


        person.setDni(9817020);
        System.out.print("La letra de \"" + person.getDni());
        System.out.println("\" es: " + person.calcularLetra());
        
        
        
        
        } catch (Exception e) {
            // Nunca dejaremos un catch vacio
            System.out.println("Error : " + e.getMessage());
        }
        
        





        System.out.println("Fin de Programa \n");
    }
}
