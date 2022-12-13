package app.prog.repository;

import app.prog.model.AuthorEntity;
import app.prog.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<AuthorEntity, String> {
    Optional<AuthorEntity> findByName( String name);
}
