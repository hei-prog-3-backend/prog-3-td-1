package app.prog.repository;


import app.prog.model.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
//     AuthorEntity findByName(String name);
}
