package com.project.backend.User.Entity;

import com.project.backend.Post.Entity.Post;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "USER")
public class User {
  @Id
  @SequenceGenerator(name = "User_seq", sequenceName = "User_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_seq")
  @Column(name = "User_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "username")
  private String username;

  @NotNull
  @Column(name = "password")
  private String password;

  @NotNull
  @Column(name = "email")
  private String email;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Post> post;
}
