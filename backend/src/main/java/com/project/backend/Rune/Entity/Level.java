package com.project.backend.Rune.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "LEVEL")
public class Level {
  @Id
  @SequenceGenerator(name = "Level_seq", sequenceName = "Level_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Level_seq")
  @Column(name = "Level_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "LEVEL")
  private int level;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Rune> rune;
}
