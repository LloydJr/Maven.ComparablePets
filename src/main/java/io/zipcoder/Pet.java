package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;
public abstract class Pet implements Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
