package lk.easycar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Driver {
    @Id
    private String license;
    private String name;
    private String address;
    private String contact;
}
