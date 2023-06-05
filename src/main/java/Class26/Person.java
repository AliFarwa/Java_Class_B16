package Class26;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

 class testperson2 {

    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>(); // TreeMap to store keys in ascending order

        // Creating Person objects and storing them in the map
        Person person1 = new Person("John", "Doe", 30, 50000.0);
        Person person2 = new Person("Jane", "Smith", 25, 60000.0);
        Person person3 = new Person("Alice", "Johnson", 35, 70000.0);

        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);

        // Printing details of each Person object in the map
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            int personId = entry.getKey();
            Person person = entry.getValue();

            System.out.println("Person ID: " + personId);
            person.printDetails();
        }
    }
}
