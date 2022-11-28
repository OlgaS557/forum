package telran.java45.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java45.forum.service.ForumCreateDto;
import telran.java45.forum.service.Integer;
import telran.java45.student.dto.StudentCreateDto;
import telran.java45.student.dto.StudentDto;
import telran.java45.student.service.StudentService;


@RestController
@RequiredArgsConstructor
public class ForumController {
	final ForumService forumService;
	
	@PostMapping("/forum/post/JavaFan")
	public ForumInfoDto addPost(@RequestBody ForumCreateDto forumCreateDto) {
		return forumService.addPost(forumCreateDto);
	}
	
	@GetMapping("/forum/post/{id}")
	public ForumInfoDto findPostById(@PathVariable String id) {
		return forumService.findStudent(id);
	}
	
	@PutMapping("/forum/post/{id}/like")
	public Integer addLike(@PathVariable String id, Integer likes) {
		return forumService.addLike(id, likes);
// TO DO
}
