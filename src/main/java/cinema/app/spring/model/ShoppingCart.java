package cinema.app.spring.model;

import lombok.Data;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Data
@Entity
public class ShoppingCart {
    @Id
    private Long id;
    @OneToMany
    private List<Ticket> tickets;
    @MapsId
    @OneToOne
    private User user;
}
