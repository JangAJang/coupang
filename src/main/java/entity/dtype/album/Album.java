package entity.dtype.album;

import entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("ALBUM")
@PrimaryKeyJoinColumn(name = "ALBUM_ID")
public class Album extends Item {

    @JoinColumn(name = "ALBUM_PRODUCER")
    @OneToMany(mappedBy = "album")
    private List<AlbumProducer> albumProducers = new LinkedList<AlbumProducer>();

    @JoinColumn(name = "ALBUM_SINGER")
    @OneToMany(mappedBy = "album")
    private List<AlbumSinger> albumSingers = new LinkedList<AlbumSinger>();

    public void addAlbumSinger(AlbumSinger albumSinger){
        albumSinger.setAlbum(this);
        albumSingers.add(albumSinger);
    }

    public void addAlbumProducer(AlbumProducer albumProducer){
        albumProducer.setAlbum(this);
        albumProducers.add(albumProducer);
    }

}
