package app.prog.controller;

import app.prog.controller.mapper.AuthorRestMapper;
import app.prog.controller.response.Author.AuthorResponse;
import app.prog.controller.response.Author.CreateAuthorResponse;
import app.prog.controller.response.Author.UpdateAuthorResponse;
import app.prog.controller.response.Book.BookResponse;
import app.prog.controller.response.Book.CreateBookResponse;
import app.prog.controller.response.Book.UpdateBookResponse;
import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;
import app.prog.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorController {
    private  final AuthorService service;

    private final AuthorRestMapper mapper;

    @GetMapping("/authors")
    public List<AuthorResponse> getAllAuthors() {
        return service.getAllAuthors().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/authors")
    public List<AuthorResponse> createAuthors(@RequestBody List<CreateAuthorResponse> toCreate) {

        List<AuthorEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createAuthors(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/authors")
    public List<AuthorResponse> updateAuthors(@RequestBody List<UpdateAuthorResponse> toUpdate) {
        List<AuthorEntity> domain = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updateAuthor(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
    @DeleteMapping("/author/{authorId}")
    public AuthorResponse deleteBook(@PathVariable Integer authorId) {
        return mapper.toRest(service.deleteAuthor(authorId));
    }
}
