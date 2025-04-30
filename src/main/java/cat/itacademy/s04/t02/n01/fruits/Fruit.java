package cat.itacademy.s04.t02.n01.fruits;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Fruit")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int quantity;
    public Fruit(String id, String name, int quantity) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit() {
        super();
    }

    public Fruit(String name, int quantity) {
        super();
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
