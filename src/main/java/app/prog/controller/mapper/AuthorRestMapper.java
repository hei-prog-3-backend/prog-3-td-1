package app.prog.controller.mapper;

import app.prog.controller.response.Author.AuthorResponse;
import app.prog.controller.response.Author.CreateAuthorResponse;
import app.prog.controller.response.Author.UpdateAuthorResponse;
import app.prog.model.AuthorEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthorRestMapper {

    public AuthorResponse toRest(AuthorEntity domain){
        return AuthorResponse.builder()
                .id(Math.toIntExact(domain.getId()))
                .name(domain.getName())
                .particularity(domain.getParticularity())
                .hasParticularity(domain.getParticularity() != null)
                .build();
    }

    public AuthorEntity toDomain(CreateAuthorResponse authorResponse){
        return  AuthorEntity.builder()
                .Name(authorResponse.getName())
                .particularity(authorResponse.getParticularity())
                .birthDate(authorResponse.getBirth_date())
                .build();
    }

    public AuthorEntity toDomain(UpdateAuthorResponse authorResponse){
        return  AuthorEntity.builder()
                .Id(authorResponse.getId())
                .Name(authorResponse.getName())
                .particularity(authorResponse.getParticularity())
                .birthDate(authorResponse.getBirthDate())
                .particularity(authorResponse.getParticularity())
                .build();
    }
}
