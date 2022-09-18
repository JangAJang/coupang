package entity.dtype.book;

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
@DiscriminatorValue("BOOK")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
public class Book extends Item {

    @Column(name = "BOOK_ISBN", nullable = false)
    private String isbn;

    @JoinColumn(name = "BOOK_AUTHOR")
    @OneToMany(mappedBy = "book")
    private List<BookWriter> bookWriters = new LinkedList<BookWriter>();

    public void addAuthor(BookWriter bookWriter){
        bookWriter.setBook(this);
        bookWriters.add(bookWriter);
    }


}
