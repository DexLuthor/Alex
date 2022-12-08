package sb.dao.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import sb.controllers.dto.TodoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TodoDao {
    @Autowired
    private JdbcTemplate dbCommunicator;

    public TodoDto getFirstTodo() {
        String getAll = "SELECT * FROM todos limit 1;";
        TodoDto dto = dbCommunicator.queryForObject(
                getAll,
                new TodoRowMapper()
        );
        return dto;
    }
}
