package app.prog.controller.response.Book;

import app.prog.model.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookResponse {
    private Integer id;
    private String author;
    private String title;
    private boolean hasAuthor;
    private List<CategoryEntity> categoryEntity;
}
