package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long id;

    @Column(name = "ITEM_NAME")
    private String name;

    @Column(name = "ITEM_PRICE")
    private Integer price;

    @Column(name = "ITEM_STOCK")
    private Integer stock;

    @JoinColumn(name = "CATEGORYITEM_ID")
    @ManyToOne
    private CategoryItem categoryItem;
}
