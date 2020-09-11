package com.project.backend.Rune.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
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
@Table(name = "TYPE")
public class TypeRune {
  @Id
  @SequenceGenerator(name = "TypeRune_seq", sequenceName = "TypeRune_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TypeRune_seq")
  @Column(name = "TypeRune_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "TYPE_RUNE")
  private String typeRune;

  @NotNull
  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Rune.class)
  private List<Rune> runes = new ArrayList<>();

}