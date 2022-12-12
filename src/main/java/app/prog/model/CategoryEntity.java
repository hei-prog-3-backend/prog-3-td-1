package app.prog.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class CategoryEntity {
    private Long id;
    private String name;

    @OneToMany(mappedBy = "id")
    private List<BookEntity> book;
}
