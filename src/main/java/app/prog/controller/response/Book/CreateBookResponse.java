package app.prog.controller.response.Book;

import app.prog.model.AuthorEntity;
import app.prog.model.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateBookResponse {
    private String author;
    private String title;
    private CategoryEntity categoryEntity;
}
