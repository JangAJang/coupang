package entity.dtype.album;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ALBUMSING")
public class AlbumSinger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ALBUMSING_ID")
    private Long id;

    @Column(name = "ALBUMSING_NAME")
    private String name;

    @JoinColumn(name = "ALBUM_ID")
    @ManyToOne
    private Album album;
}
