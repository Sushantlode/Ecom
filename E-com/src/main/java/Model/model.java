package Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Ecom")
public class model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price ;
    private String description;
    private String image;

    public model() {

    }
    public model(int id, String name, String price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

}
