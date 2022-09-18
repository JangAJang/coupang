package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DELIVERY")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    private Long id;

    @Column(nullable = false, name = "DELIVERY_CITY")
    private String city;

    @JoinColumn
    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Column(nullable = false, name = "DELIVERY_street")
    private String street;

    @Column(nullable = false, name = "DELIVERY_ZIPCODE")
    private String zipcode;

    @Column(name = "DELIVERY_EXPECTED-DATE")
    private Date expectedDate;
}
