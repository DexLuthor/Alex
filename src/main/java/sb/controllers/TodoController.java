package sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sb.controllers.dto.TodoDto;
import sb.dao.hibernate.TodoRepository;
import sb.dao.jdbc.TodoDao;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoDao dao;

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/todos")
    public TodoDto getTodos() {
        return dao.getFirstTodo();
    }

    @GetMapping("/alltodos")
    public List<TodoDto> getAll(){
        List<TodoDto> all = todoRepository.findAll();
        return all;
    }

}
