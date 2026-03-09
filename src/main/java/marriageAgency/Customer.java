package marriageAgency;

import static java.lang.Math.abs;

public class Customer {
    private final int age;

    public Customer(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public boolean match(Customer c){
        return true;
    }

    public boolean appropriateAge(Customer c){
        return abs(c.getAge() - age) <= 7;
    }
}
