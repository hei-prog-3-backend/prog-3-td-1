package app.prog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    private Long Id;
    private String Name;
    private String birthDate;
    private String particularity;

    private boolean hasParticulaty(){
        return  Name != null;
    }
}
