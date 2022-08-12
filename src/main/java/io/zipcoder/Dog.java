package io.zipcoder;

public class Dog extends Pet{

    public Dog() {
        super("Yuki");
    }

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "bark!";
    }

    public int compareTo(Object o) {
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
