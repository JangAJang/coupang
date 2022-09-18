package entity.dtype.album;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ALBUMPRODUCER")
public class AlbumProducer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ALBUMPRODUCER_ID")
    private Long id;

    @Column(name = "ALBUMPRODUCER_NAME")
    private String name;

    @JoinColumn(name = "ALBUM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Album album;
}
