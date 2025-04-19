// package bystream;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
