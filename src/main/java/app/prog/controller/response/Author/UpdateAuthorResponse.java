package app.prog.controller.response.Author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UpdateAuthorResponse {
    private Long id;
    private String name;
    private  String particularity;
    private String BirthDate;
}
