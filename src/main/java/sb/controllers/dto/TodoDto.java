package sb.controllers.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class TodoDto {
    private Long id;
    private String content;
    private boolean done;
}
