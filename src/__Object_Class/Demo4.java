package __Object_Class;

class Address1 implements Cloneable{
     String City;
     Address1(String City){
         this.City = City;
     }
     @Override
    public Object clone() throws CloneNotSupportedException{
         return super.clone();
     }
 }

 class Persons implements Cloneable{
    String name;
    Address1 address;
    Persons(String name,Address1 address){
        this.name = name;
        this.address = address;
    }

    @Override
     public  Object clone() throws CloneNotSupportedException{
         Persons ClonedPerson = (Persons) super.clone();//shallow clone
         ClonedPerson.address = (Address1) address.clone();//deep clone
        return ClonedPerson;
    }
 }


class Demo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 a1 = new Address1("Pune");
        Persons p1 = new Persons("xyz",a1);
        Persons p2 = (Persons) p1.clone();
        System.out.println("Before Updating");
        System.out.println(a1.City);
        System.out.println(p1.address.City);
        System.out.println(p2.address.City);
        p2.address.City = "Chinchwad";
        System.out.println("After Updating");
        System.out.println(a1.City);
        System.out.println(p1.address.City);
        System.out.println(p2.address.City);
        System.out.println("Changing p2.address.City also changes p1.address.City because address is not cloned, only its reference is copied.");
    }
    }

