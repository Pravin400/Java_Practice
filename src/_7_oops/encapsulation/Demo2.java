package _7_oops.encapsulation;

public class Demo2 {

    public static void main(String[] args) {
    Person person = new Person();
        person.setId(01);
        person.setName("Mahesh");
        person.setAddress("Pune");
        person.setAge(18);
        System.out.println("Id : "+person.getId());
        System.out.println("Name : "+ person.getName());
        System.out.println("Address : " + person.getAddress());
        System.out.println("Age : " + person.getAge());
    }
}
