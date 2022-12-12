package app.prog.controller;

import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;
import app.prog.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorController {
    private  final AuthorService service;


    @GetMapping("/authors")
    public List<AuthorEntity> getAllBooks(){
        return service.getAllAuthors();
    }
}
