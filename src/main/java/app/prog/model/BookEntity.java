package app.prog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private Integer pageNumber;
    private LocalDate releaseDate;


   @OneToOne(cascade = CascadeType.ALL)
    private AuthorEntity author;

   @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   private CategoryEntity categoryEntity;
    public boolean hasAuthor() {
        return author != null;
    }

}
