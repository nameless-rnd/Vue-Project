package com.project.backend.Enchantment.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ENCHANTMENT")
public class Enchantment {
  @Id
  @SequenceGenerator(name = "Enchantment_seq", sequenceName = "Enchantment_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Enchantment_seq")
  @Column(name = "Enchantment_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "image")
  private String image;

  @NotNull
  @Size(min = 10, max = 1000)
  @Column(name = "detail")
  private String detail;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeEn.class)
  @JoinColumn(name = "TYPE_EN", insertable = true)
  @NotNull
  private TypeEn typeEn;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = LevelEn.class)
  @JoinColumn(name = "LEVEL_EN", insertable = true)
  @NotNull
  private LevelEn levelEn;
}