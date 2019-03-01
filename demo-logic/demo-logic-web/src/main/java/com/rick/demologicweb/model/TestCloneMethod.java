package com.rick.demologicweb.model;

import com.rick.demologicweb.model.Address;
import com.rick.demologicweb.model.Person;

public class TestCloneMethod {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123", "234");
        Person person = new Person("haha", 1,address);
        Person personClone = (Person)person.clone();
        personClone.getAddress().setProvince("13");
        personClone.setAge(123);

        System.out.println(person);
        System.out.println(personClone);
    }
}
