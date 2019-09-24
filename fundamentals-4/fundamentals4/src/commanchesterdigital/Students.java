package commanchesterdigital;

public class Students {

    private String name;
    private int age;

    public static void main(String[] args) {
        Students englishStudent = new Students("Callum");
        System.out.println(englishStudent.getName());

        Students frenchStudent = new Students("Callum", 22);
        System.out.println(frenchStudent.getName());
    }

    public Students(String name){
        this.name = name;
    }

    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                        '}';
    }
}
