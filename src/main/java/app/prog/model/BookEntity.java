package app.prog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer pageNumber;
    private LocalDate releaseDate;
    @ManyToOne( cascade = CascadeType.ALL )
    @JoinColumn( name="author")
    private AuthorEntity author;

    @OneToMany(targetEntity = CategoryEntity.class)
   private List<CategoryEntity> categoryEntity;
    public boolean hasAuthor() {
        return author != null;
    }

}
