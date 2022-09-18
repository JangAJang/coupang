package entity.dtype.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BOOKWRITER")
public class BookWriter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKWRITER_ID")
    private Long id;

    @JoinColumn(name = "BOOK_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;
}
