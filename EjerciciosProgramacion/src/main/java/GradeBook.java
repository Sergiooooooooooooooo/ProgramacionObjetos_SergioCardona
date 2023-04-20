public class GradeBook {
    
    private String courseName;
    
    public GradeBook(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;  
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage() {
        System.out.println("Bienvenido a la planilla de notas " + getCourseName());

    }
    
}
