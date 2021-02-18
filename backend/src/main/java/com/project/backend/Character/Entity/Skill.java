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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "SKILL")
public class Skill {
  @Id
  @SequenceGenerator(name = "Skill_seq", sequenceName = "Skill_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Skill_seq")
  @Column(name = "Skill_id", unique = true, nullable = true)
  private Long id;

  //======================= Skill   ===========================
  @NotNull
  @Column(name = "IMG_SKILL")
  private String img_skill;

  @NotNull
  @Column(name = "NAME_SKILL")
  private String name_skill;

  @NotNull
  @Size(min = 10, max = 1000)
  @Column(name = "DETAIL_SKILL")
  private String detail_skill;


  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Character.class)
  @NotNull
  private List<Character> characters = new ArrayList<>();

}
