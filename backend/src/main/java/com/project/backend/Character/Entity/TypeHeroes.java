package com.project.backend.Character.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Collection;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "TYPE_HEROES")
public class TypeHeroes {
  @Id
  @SequenceGenerator(name = "TypeHeroes_seq", sequenceName = "TypeHeroes_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TypeHeroes_seq")
  @Column(name = "TypeHeroes_id", unique = true, nullable = true)
  private Long id;

  /*@NotNull
  @Column(name = "IMG_TYPE_HEROES")
  private String img_typeHeroes;*/

  @NotNull
  @Column(name = "TYPE_HEROES")
  private String typeHeroes;


  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Character.class)
  @NotNull
  private List<Character> characters = new ArrayList<>();

}
