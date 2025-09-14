package _6_class_component._2_methods.Getters_Setters;

public class Demo7 {
//this is Getters and Setters
//use to access,modify,read,update the private variable
//Getters (getSomething()) → Used to retrieve data
//Setters (setSomething()) → Used to modify data
    public static void main(String[] args) {
        Student student = new Student();//id=0, name=null
        //student.id;//CTE
        student.setId(101);
        student.setName("Aditya");
        System.out.println("ID = " + student.getId());
        System.out.println("Name = " + student.getName());
    }
}
