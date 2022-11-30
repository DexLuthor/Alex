package sb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @GetMapping("gettodos")
    public List<Todo> getTodos() {
        return List.of(new Todo(1L, "Buy milk", true));
    }
    @PostMapping()
    public void saveNewTodo(){

    }
    @GetMapping("getAppName")
    public String getAppName() {
        return "Todos";
    }
}


@AllArgsConstructor
@Setter
@Getter
class Todo {
    private Long id;
    private String content;
    private boolean done;
}