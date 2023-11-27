package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private UUID id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String address;
    @Column
    private String phoneNumber;
    @Column
    private String email;
}
