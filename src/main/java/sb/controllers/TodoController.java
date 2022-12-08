package sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.controllers.dto.TodoDto;
import sb.dao.TodoDao;

@RestController
public class TodoController {

    @Autowired
    private TodoDao dao;


    @GetMapping("/todos")
    public TodoDto getTodos() {
        return dao.getFirstTodo();
    }

}
