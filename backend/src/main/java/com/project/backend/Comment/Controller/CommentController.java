package com.project.backend.Comment.Controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.backend.Comment.Entity.Comment;
import com.project.backend.Comment.Repository.CommentRepository;
import com.project.backend.Post.Entity.Post;
import com.project.backend.Post.Repository.PostRepository;
import com.project.backend.User.Entity.User;
import com.project.backend.User.Repository.UserRepository;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class CommentController {

  @Autowired
  private final CommentRepository commentRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PostRepository postRepository;

  public CommentController(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  @GetMapping("/comment")
  public Collection<Comment> Comment() {
    return commentRepository.findAll().stream().collect(Collectors.toList());
  }

  @PostMapping("/comment/{informationComment}/{post_id}/{user_id}")
  public Comment newComment(
    Comment newComment,
    @PathVariable String informationComment,
    @PathVariable long user_id,
    @PathVariable long post_id
  ) {
    User user = userRepository.findById(user_id);
    Post post = postRepository.findById(post_id);
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern(
      "dd MMMM yyyy - HH:mm:ss"
    );
    String dateTime = date.format(format);

    newComment.setInformationComment(informationComment);
    newComment.setCreatedBy(user);
    newComment.setPost(post);
    newComment.setDate(dateTime);

    return commentRepository.save(newComment);
  }
}
