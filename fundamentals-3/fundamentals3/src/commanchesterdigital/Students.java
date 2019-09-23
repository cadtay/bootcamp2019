package commanchesterdigital;

public class Students {

    public static final String CLASS_NAME = "Bootcamp  ";

    // this is an example of an instance variable:
    private String studentName;


    public Students(String studentName){
        this.studentName = studentName;
    }

    public void printDetails(){
        System.out.println("Student's name is " + studentName);
    }

    public static void main(String[] args) {
        Students student = new Students("Callum");
        student.printDetails();
    }
}
