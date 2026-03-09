package marriageAgency;

import java.util.ArrayList;

public class MarriageAgency {
    private final ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public ArrayList<Customer> findMatches(Customer c){
        ArrayList<Customer> matches = new  ArrayList<>();
        for (Customer c1 : customers){
            if (c1.appropriateAge(c)){
                matches.add(c1);
            }
        }
        return matches;
    }
}
