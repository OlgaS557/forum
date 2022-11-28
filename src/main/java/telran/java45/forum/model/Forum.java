package telran.java45.forum.model;

import java.util.Map;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.java45.forum.dto.List;
import telran.java45.forum.dto.LocalDate;
import telran.java45.forum.dto.String;
import telran.java45.student.model.Student;

@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Forum {
	@Id
	String id;
	@Setter
    String title;
	@Setter
    String content;
	@Setter
    String author;
	@Setter
    LocalDate dateCreated;
    List<String> tags;
    @Setter
    Integer likes;
    List<String> comments;

}
