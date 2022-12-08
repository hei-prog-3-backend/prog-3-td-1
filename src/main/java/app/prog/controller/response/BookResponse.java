package app.prog.controller.response;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookResponse {
    private Long id;
    private Long author;
    private String title;
    private boolean hasAuthor;
}
