package app.prog.repository;

import app.prog.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
    Optional<AuthorEntity> findAuthorByName(String name);

    @Override
    Optional<AuthorEntity> findById(Integer integer);
}
