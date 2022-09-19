package entity.dtype.food;

import entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorColumn(name = "FOOD")
@PrimaryKeyJoinColumn(name = "FOOD_ID")
public class Food extends Item {

    @Column(name = "FOOD_NAME")
    private String name;

    @Column(name = "FOOD_STOCK")
    private Integer stock;

    @Column(name = "FOOD_PRICE")
    private Integer price;

    @Column(name = "FOOD_TIMETOEXPIRE")
    private Integer timeToExpire;
}
