package com.project.backend.Post.Entity;

import com.project.backend.User.Entity.User;
import com.project.backend.Comment.Entity.Comment;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import lombok.*;

/*import java.util.ArrayList;
import java.util.List;*/

@Data
@Entity
@NoArgsConstructor
@Table(name = "Post")
public class Post {
  @Id
  @SequenceGenerator(name = "Post_seq", sequenceName = "Post_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Post_seq")
  @Column(name = "Post_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Size(min = 1, max = 1000)
  @Column(name = "INFORMATION_POST")
  private String informationPost;

  @NotNull
  @Column(name = "DATE")
  private String date;

  /*@NotNull
  @Column(name = "IMG_Post")
  private String img_post;*/

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
  @JoinColumn(name = "user_id", insertable = true)
  private User createdBy;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Comment> comments;
}
