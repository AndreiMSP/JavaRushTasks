package test;

import java.util.Objects;

public class Cat  {
    private String name;
    int a = 5;

    public Cat(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return a == cat.a && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, a);
    }
}
