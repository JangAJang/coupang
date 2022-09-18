package entity.dtype.movie;

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
@DiscriminatorValue("MOVIE")
@PrimaryKeyJoinColumn(name = "MOVIE_ID")
public class Movie extends Item {

    @JoinColumn(name = "MOVIE_ACTOR")
    @OneToMany(mappedBy = "movie")
    private List<MovieActor> movieActors = new LinkedList<MovieActor>();

    @JoinColumn(name = "MOVIE_PRODUCER")
    @OneToMany(mappedBy = "movie")
    private List<MovieProducer> movieProducers = new LinkedList<MovieProducer>();

    public void addActor(MovieActor movieActor){
        movieActor.setMovie(this);
        movieActors.add(movieActor);
    }

    public void addProducer(MovieProducer movieProducer){
        movieProducer.setMovie(this);
        movieProducers.add(movieProducer);
    }
}
