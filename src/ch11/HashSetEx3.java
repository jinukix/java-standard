package ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return name.equals(person.name) && age == person.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name+age).hashCode();
    }

    public String toString() {
        return name + ":" + age;
    }
}
