package app.prog.controller.mapper;

import app.prog.controller.response.Book.BookResponse;
import app.prog.controller.response.Book.CreateBookResponse;
import app.prog.controller.response.Book.UpdateBookResponse;
import app.prog.model.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookRestMapper {
    public BookResponse toRest(BookEntity domain) {
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(domain.getAuthor())
                .hasAuthor(domain.hasAuthor())
                .build();
    }

    public BookEntity toDomain(CreateBookResponse rest) {
        return BookEntity.builder()
                .author(rest.getAuthor().getName())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }

    public BookEntity toDomain(UpdateBookResponse rest) {
        return BookEntity.builder()
                .id(rest.getId())
                .author(rest.getAuthor().getName())
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }
}
