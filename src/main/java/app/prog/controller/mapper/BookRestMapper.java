package app.prog.controller.mapper;

import app.prog.controller.response.BookResponse;
import app.prog.controller.response.CreateBookResponse;
import app.prog.controller.response.UpdateBookResponse;
import app.prog.model.AuthorEntity;
import app.prog.model.CategoryEntity;
import app.prog.repository.AuthorRepository;
import app.prog.model.BookEntity;
import app.prog.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BookRestMapper {
    private AuthorRepository repository;
    private AuthorService service;
    public BookResponse toRest(BookEntity domain) {
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(String.valueOf((domain.getAuthor())))
                .hasAuthor(domain.hasAuthor())
                .build();
    }

    public BookEntity toDomain(CreateBookResponse rest) {
        Optional<AuthorEntity> optional = service.searchByName(rest.getAuthorName());
        if (optional.isPresent()) {
            return BookEntity.builder()
                    .author(optional.get())
                    .title(rest.getTitle())
                    .pageNumber(0)
                    .build();
        } else {
            throw new RuntimeException("Not found");
        }
    }

    public BookEntity toDomain(UpdateBookResponse rest) {
        Optional<AuthorEntity> optional = service.searchByName(rest.getAuthorName());
        if (optional.isPresent()) {
            return BookEntity.builder()
                    .id(rest.getId())
                    .author(optional.get())
                    .title(rest.getTitle())
                    .pageNumber(0)
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, rest.getAuthorName() + " Not found");
        }
}}
