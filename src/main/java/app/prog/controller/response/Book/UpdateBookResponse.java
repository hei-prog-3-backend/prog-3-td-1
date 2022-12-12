package app.prog.controller.response.Book;

import app.prog.model.AuthorEntity;
import app.prog.model.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateBookResponse {
    private int id;
    private String author;
    private String title;
    private CategoryEntity categoryEntity;
}
