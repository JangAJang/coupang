package entity;

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
@Table(name = "CATEGORYITEM")
public class CategoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORYITEM_ID")
    private Long id;

    @JoinColumn(name = "CATEGORY_ID")
    @OneToOne
    private Category category;

    @JoinColumn(name = "ITEM_ID")
    @OneToMany(mappedBy = "categoryItem")
    private List<Item> items = new LinkedList<Item>();
}
