package lk.easycar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Admin {
    @Id
    private String userName;
    private String password;
    private String name;
    /*@OneToMany(mappedBy = "admin")
    private Collection<Booking> bookings = new ArrayList<>();*/
}
