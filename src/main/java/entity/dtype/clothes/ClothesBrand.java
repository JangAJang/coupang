package entity.dtype.clothes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLOTHESBRAND")
public class ClothesBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLOTHESBRAND_ID")
    private Long id;

    @Column(name = "CLOTHESBRAND_NAME")
    private String name;

    @OneToMany(mappedBy = "clothesBrand")
    @JoinColumn
    private List<Clothes> clothes = new LinkedList<Clothes>();

    public void addClothes(Clothes clothes){
        this.clothes.add(clothes);
    }
}
