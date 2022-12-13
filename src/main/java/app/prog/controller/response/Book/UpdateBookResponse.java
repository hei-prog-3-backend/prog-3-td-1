package app.prog.controller.response.Book;

import app.prog.model.AuthorEntity;
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
public class UpdateBookResponse {
    private Integer id;
    private String author;
    private String title;
    private List<CategoryEntity> categoryEntity;
}
