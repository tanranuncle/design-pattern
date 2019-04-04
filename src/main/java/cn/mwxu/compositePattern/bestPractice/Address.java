package cn.mwxu.compositePattern.bestPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * 地址
 */
public class Address {

    private String name;

    private List<Address> subordinates = new ArrayList<>();

    public Address(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        subordinates.add(address);
    }

    public void removeAddress(Address address) {
        subordinates.remove(address);
    }

    public List<Address> getSubordinates() {
        return subordinates;
    }

    public void printAll(){
        System.out.println(this);
        for (Address subordinate : subordinates) {
            subordinate.printAll();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
