import com.objetos.Persona;
import com.objetos.Persona.tipoGenero;
import com.objetos.Empleado;
import com.objetos.Director;
import java.util.ArrayList;
import com.objetos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        try{
            ArrayList<Persona> empleados = new ArrayList<Persona>();
            Empleado emp1 = new Empleado();
            emp1.setNombre("Empleado1");
            emp1.setApellidos("Apellidos1");
            empleados.add(emp1);

            System.out.println("Emp1: " + emp1.getClass());
            System.out.println("\n");

            System.out.println("Colección 0: " + empleados.get(0).getClass());
            System.out.println("\n");

            Empleado emp2 = new Empleado();
            emp2.setNombre("Empleado2");
            emp2.setApellidos("Apellidos2");
            empleados.add(emp2);

            Director dir1 = new Director();
            dir1.setNombre("Director1");
            dir1.setApellidos("ApellidosDirector1");
            empleados.add(dir1);

            Persona becario = new Persona();
            becario.setNombre("Becario");
            becario.setApellidos("ApellidosBecario");
            empleados.add(becario);

            for(Persona emp: empleados){

               
                System.out.println(emp.getNombreCompleto());
                System.out.println(emp.getClass());
                if(emp instanceof Director){
                    ((Director)emp).mandar();
                }
            }
            System.out.println("\n");
            // Empleado temp = (Empleado) empleados.get(0);
            // Director temp2  = (Director) empleados.get(2);
            // temp2.mandar();
            // System.out.println(temp + "\n" + temp2);
            

        //     Empleado emp = new Empleado();
        //     Director dir = new Director();


        //     emp.setNombre("Harun");
        //     emp.setApellidos("SANDUVAC");

        //     System.out.println("\n\n");
        //     System.out.println(emp.toString());
        //     System.out.println("\n");


        //     emp.setNombre("Santos");
        //     emp.setApellidos("Cerdan");
        //  // emp.setSalarioMinimo(80000); no podemos configurar porque en empleados hemos creado protected
        
        //     System.out.println("Salario mínimo empleado: " + emp.getSalarioMinimo());
        //     System.out.println("\n");
        
        
        
       
        //     System.out.println("Salario mínimo director: " + dir.getSalarioMinimo());

        //     System.out.println("\n\n");

        //     System.out.println("Vacaciones empleado: " + emp.getDiasVacaciones());
        //     System.out.println("Vacacinoes director: " + dir.getDiasVacaciones());
        //     System.out.println("Vacaciones director con extra:  " + dir.getDiasVacaciones(10));

            // emp.setDni("51981752G");
            // System.out.println("Empelado : " + emp.getDni());
            // emp.setSueldo(1800);

            // System.out.println(emp.getNombreCompleto());
            // System.out.println("Sueldo : " + emp.getSueldo());

        

            // System.out.println("\n\n");


            // Empleado emp2 = new Empleado("Alex", "Sanchez");
            // System.out.println("nombre de empleado : " + emp2.getNombre() + "  " + emp2.getApellidos());


            // System.out.println("\n Probando la clase Persona");

            // Cuando hablamos de clases, necesitamos objetos para trabajar con dichas clases
            // Instanciamos el objeto persona

            // Persona person = new Persona();
            // System.out.println("Genero: " + person.getGenero());

            // Persona harun = new Persona("harun", "sanduvac");
            // System.out.println(harun.getNombreCompleto());

            // Persona elena = new Persona("Elena", "Gonzalez", 31, "12345679P", tipoGenero.FEMENINO);
            // System.out.println(elena.getNombre() + elena.getApellidos() + elena.getDni());
            // // Ya podemos utilizar la persona y sus propiedades :
            // person.setNombre("Luis");
            // // person.apellidos = "Lopez";
            // // person.edad = 29;
            // System.out.println(person.getNombre());


            // person.setApellidos("Lopez");
            // System.out.println(person.getApellidos());
            

            // person.setEdad(23);
            // System.out.println(person.getEdad());

            // person.setGenero(Persona.tipoGenero.MASCULINO);
            // System.out.println("Género: " + person.getGenero());

            // System.out.println("Nombre Completo: " + person.getNombreCompleto());

            // System.out.println("Nombre Completo Mayuscula: " + person.getNombreCompleto(2));

            // System.out.println("Apellido y Nombre: " + person.getNombreCompleto(false));

            // System.out.println("Nombre Completo Separado: " + person.getNombreCompleto(" - "));


            System.out.println("\n\n");


            // person.setDni(51981752);
            // System.out.print("La letra de \"" + person.getDni());
            // System.out.println("\" es: " + person.calcularLetra());
            
            // // Igual a este  (Creamos un método static , no necesitamos this, no necesitamos propiedad)

            // char newLetraDni = Persona.getLetraDni(51981752);
            // System.out.println("La letra por el método nuevo: " + newLetraDni);

            // System.out.println("La letra de 12345678 : " + Persona.getLetraDni(12345678));
            // System.out.println("56789234" + Persona.getLetraDni(56789232));

        
        
        


            // System.out.println("\n\n");


            // person.setDni("51981752G");
            // System.out.println("El DNI: \"" + person.getDni() + "\" está correcto \n");





            System.out.println("Fin de Programa \n");

        } catch (Exception e) {
            // Nunca dejaremos un catch vacio
            System.out.println("Error : " + e.getMessage());
        }
        
    }

    
}
