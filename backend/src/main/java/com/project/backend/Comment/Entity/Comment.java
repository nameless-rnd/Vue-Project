package com.project.backend.Comment.Entity;

import com.project.backend.User.Entity.User;
import com.project.backend.Post.Entity.Post;

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
import lombok.*;

/*import java.util.ArrayList;
import java.util.List;*/

@Data
@Entity
@NoArgsConstructor
@Table(name = "COMMENT")
public class Comment {
  @Id
  @SequenceGenerator(name = "Comment_seq", sequenceName = "Comment_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment_seq")
  @Column(name = "Comment_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Size(min = 1, max = 1000)
  @Column(name = "INFORMATION_COMMENT")
  private String informationComment;

  @NotNull
  @Column(name = "DATE")
  private String date;

  /*@NotNull
  @Column(name = "IMG_Comment")
  private String img_Comment;*/

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
  @JoinColumn(name = "user_id", insertable = true)
  private User createdBy;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Post.class)
  @JoinColumn(name = "post_id", insertable = true)
  @NotNull
  private Post post;
}
