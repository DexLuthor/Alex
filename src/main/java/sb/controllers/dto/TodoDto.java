package sb.controllers.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class TodoDto {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "content")
    private String content;
    @Column(name = "done")
    private boolean done;

    public TodoDto() {
    }

    public TodoDto(Long id, String content, boolean done) {
        this.id = id;
        this.content = content;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
