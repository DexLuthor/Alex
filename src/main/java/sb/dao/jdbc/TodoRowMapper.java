package sb.dao.jdbc;

import org.springframework.jdbc.core.RowMapper;
import sb.controllers.dto.TodoDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoRowMapper implements RowMapper<TodoDto> {

    @Override
    public TodoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        String content = rs.getString("content");
        boolean done = rs.getBoolean("done");

        TodoDto dto = new TodoDto(id, content, done);
        return dto;
    }
}
