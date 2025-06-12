import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando la clase Persona");

        // Cuando hablamos de clases, necesitamos objetos para trabajar con dichas clases
        // Instanciamos el objeto persona

        Persona person = new Persona();
        // Ya podemos utilizar la persona y sus propiedades :
        person.nombre = "Lucas";
        person.apellidos = "Lopez";
        person.edad = 29;
        System.out.println(person.nombre + " " + person.apellidos + " " + "Edad: " + person.edad);

        System.out.println("Fin de Programa");
    }
}
