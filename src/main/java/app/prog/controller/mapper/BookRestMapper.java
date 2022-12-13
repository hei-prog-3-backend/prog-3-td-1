package app.prog.controller.mapper;

import app.prog.controller.response.Book.BookResponse;
import app.prog.controller.response.Book.CreateBookResponse;
import app.prog.controller.response.Book.UpdateBookResponse;
import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;

import app.prog.model.CategoryEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookRestMapper {

    public BookResponse toRest(BookEntity domain) {
        String author = domain.getAuthor() != null ? domain.getAuthor().getName() : null;
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(author)
                .hasAuthor(domain.hasAuthor())
                .categoryEntity(domain.getCategoryEntity())
                .build();
    }

    public BookEntity toDomain(CreateBookResponse rest) {
        AuthorEntity entity = new AuthorEntity();
        entity.setName(rest.getAuthor());
        return BookEntity.builder()
                .author(entity)
                .title(rest.getTitle())
                .categoryEntity(rest.getCategoryEntity())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }

    public BookEntity toDomain(UpdateBookResponse rest) {

        AuthorEntity author = new AuthorEntity();
        author.setName(rest.getAuthor());
        return BookEntity.builder()
                .id(rest.getId())
                .author(author)
                .title(rest.getTitle())
                .categoryEntity(rest.getCategoryEntity())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }
}
