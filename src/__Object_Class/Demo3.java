package __Object_Class;

import java.util.SplittableRandom;

class Address{
     String City;
     Address(String City){
         this.City = City;
     }
 }

 class person implements Cloneable{
    String name;
    Address address;
    person(String name,Address address){
        this.name = name;
        this.address = address;
    }
    @Override
     public  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
 }


class Demo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a1 = new Address("Pune");
        person p1 = new person("Srushti",a1);
        person p2 = (person) p1.clone();
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

