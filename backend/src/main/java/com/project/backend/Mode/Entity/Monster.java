package com.project.backend.Mode.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "MONSTER")
public class Monster {
  @Id
  @SequenceGenerator(name = "Monster_seq", sequenceName = "Monster_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Monster_seq")
  @Column(name = "Monster_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "NAME")
  private String name;

  @NotNull
  @Column(name = "IMG_MONSTER")
  private String img_monster;

  @NotNull
  @Column(name = "TIME_START")
  private Integer time_start;

  @NotNull
  @Column(name = "TIME_PERIOD")
  private Integer time_period;

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Mode.class)
  private List<Mode> mode = new ArrayList<>();

}
