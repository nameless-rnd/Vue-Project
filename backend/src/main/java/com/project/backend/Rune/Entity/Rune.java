package com.project.backend.Rune.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "RUNE")
public class Rune {
  @Id
  @SequenceGenerator(name = "Rune_seq", sequenceName = "Rune_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Rune_seq")
  @Column(name = "Rune_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "IMG_RUNE")
  private String img_rune;

  @NotNull
  @Column(name = "EFFECT")
  private String effect;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Level.class)
  @JoinColumn(name = "LEVEL", insertable = true)
  @NotNull
  private Level level;

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = TypeRune.class)
  @JoinColumn(name = "typeRune_id", insertable = true)
  @NotNull
  private List<TypeRune> types = new ArrayList<>();

  public void addType(TypeRune type) {
    this.types.add(type);
  }
}
