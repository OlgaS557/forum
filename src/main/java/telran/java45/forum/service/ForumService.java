package telran.java45.forum.service;

import java.util.List;

import org.bson.codecs.IntegerCodec;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import telran.java45.forum.dto.LocalDate;

public interface ForumService {
	ForumInfoDto addPost(ForumCreateDto forumCreateDto);
	ForumInfoDto findPostById(String id);
	Integer addLike(String id, Integer likes);
	ForumInfoDto findPostByAuthor(String author);
	ForumInfoDto addComment(String message);
	ForumInfoDto removePost(String id);
	ForumInfoDto findPostByTags(List<String> tags);
	ForumInfoDto findPostByPeriod(LocalDate dateFrom, LocalDate dateTo);
	ForumInfoDto updatePost(String id, ForumCreateDto forumCreateDto);

}
