package telran.java45.forum.dto;

import org.bson.codecs.IntegerCodec;
import org.springframework.beans.factory.ListableBeanFactory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ForumInfoDto {
	String id;
    String title;
    String content;
    String author;
    LocalDate dateCreated;
    List<String> tags;
    Integer likes;
    List<String> comments;

}
