package com.project.backend.Rune.Entity;

import com.project.backend.Effect.Entity.Effect;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PROPERTY_RUNE")
public class PropertyRune {
  @Id
  @SequenceGenerator(name = "PropertyRune_seq", sequenceName = "PropertyRune_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PropertyRune_seq")
  @Column(name = "PropertyRune_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "PROPERTY_RUNE")
  private double propertyRune;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Effect.class)
  private Effect effects;

  @NotNull
  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Rune.class)
  private List<Rune> runes = new ArrayList<>();

}