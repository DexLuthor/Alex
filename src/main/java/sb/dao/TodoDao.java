package sb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import sb.controllers.dto.TodoDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

class TodoRowMapper implements RowMapper<TodoDto> {

    @Override
    public TodoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        String content = rs.getString("content");
        boolean done = rs.getBoolean("done");

        TodoDto dto = new TodoDto(id, content, done);
        return dto;
    }
}