package io.zipcoder;

public class Cat extends Pet{

    public Cat() {
        super("Tofu");
    }

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "meow!";
    }

    public int compareTo(Object o) {
        return 0;
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
