package com.project.backend.Effect.Entity;

import com.project.backend.Rune.Entity.PropertyRune;
import com.project.backend.Item.Entity.PropertyItem;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "EFFECT")
public class Effect {
  @Id
  @SequenceGenerator(name = "Effect_seq", sequenceName = "Effect_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Effect_seq")
  @Column(name = "Effect_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "EFFECT")
  private String effect;

  /*@OneToMany(fetch = FetchType.EAGER)
  private Collection<PropertyRune> propertyRunes;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<PropertyItem> propertyItems;*/
}