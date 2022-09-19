package entity.dtype.clothes;

import entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "CLOTHES")
@PrimaryKeyJoinColumn(name = "CLOTHES_ID")
public class Clothes extends Item {

    @Column(nullable = false, name = "CLOTHES_NAME")
    private String name;

    @JoinColumn(name = "CLOTHES_OPTION")
    @OneToMany(mappedBy = "clothes")
    private List<ClothesOption> clothesOptions = new LinkedList<ClothesOption>();

    @JoinColumn(name = "CLOTHES_BRAND")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClothesBrand clothesBrand;

    public void addoption(ClothesOption clothesOption){
        clothesOption.setClothes(this);
        clothesOptions.add(clothesOption);
    }

    public void setBrand(ClothesBrand clothesBrand){
        this.setBrand(clothesBrand);
        clothesBrand.addClothes(this);
    }
}
