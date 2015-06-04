package apartment.rental.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nettanwat on 6/4/15 AD.
 */
@Entity
public class Apartment {

    @Id
    @GeneratedValue
    Long id;
    String name;

}
