package app.prog.controller.response;

import app.prog.model.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UpdateBookResponse {
    private int id;
    private AuthorEntity author;
    private String title;
}
