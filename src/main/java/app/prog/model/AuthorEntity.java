package app.prog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Entity
@Data
@Table(name = "author")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    private String Name;
    private String birthDate;
    private String particularity;
    @OneToMany(mappedBy = "id")
    private List<BookEntity> bookEntityList;
    private boolean hasParticulaty(){
        return  Name != null;
    }
}
