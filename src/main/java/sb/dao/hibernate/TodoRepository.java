package sb.dao.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import sb.controllers.dto.TodoDto;

public interface TodoRepository extends JpaRepository<TodoDto, Long> {
    TodoDto findByContentAndDone(String content, boolean done);
}
