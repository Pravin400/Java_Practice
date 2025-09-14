package _7_oops.encapsulation;
public class Student {
    private int id;
    private String name;
    private String address;
//Java Provide by default no args constructor by default if not any other constructor is defined
    //No-Args Construnctor
    public Student() {
    }
    //All-Args Construnctor
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    //Setters
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}