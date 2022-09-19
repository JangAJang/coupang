package entity.dtype.clothes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLOTHESOPTION")
public class ClothesOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLOTHESOPTION_ID")
    private Long id;

    @Column(name = "CLOTHESOPTION_STOCK")
    private Integer stock;

    @Column(name = "CLOTHESOPTION_PRICE")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLOTHES_ID")
    private Clothes clothes;
}
