import java.util.Scanner;
public class GradeBookTest {
    
    public static void main(String[] args){
        
        Scanner nombreCurso = new Scanner(System.in);
        
        GradeBook planillaNotasPOO = new GradeBook("programacion Orientada a Objetos");
        GradeBook planillaNotasEstructuras = new GradeBook("Estructura de Datos");
        
        planillaNotasPOO.displayMessage();
        planillaNotasEstructuras.displayMessage();
        
        //System.out.println("El nombre del curso antes de la asignacion es: " + planillaNotas.getCourseName());
        
       // System.out.println("Por favor ingrese el nombre del curso: ");
        //String nombreEntradaCurso = nombreCurso.nextLine();
        //planillaNotas.setCourseName(nombreEntradaCurso);
        
        //System.out.println("El nuevo nombre del curso es : " + planillaNotas.getCourseName());
        //planillaNotas.displayMessage();
    }
}