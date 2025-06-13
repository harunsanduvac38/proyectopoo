import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
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

        System.out.println("Fin de Programa \n");
    }
}
