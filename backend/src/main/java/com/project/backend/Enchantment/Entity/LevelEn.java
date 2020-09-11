package com.project.backend.Enchantment.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "LEVEL_EN")
public class LevelEn {
  @Id
  @SequenceGenerator(name = "LevelEn_seq", sequenceName = "LevelEn_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LevelEn_seq")
  @Column(name = "LevelEn_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "LEVEL_EN")
  private int LevelEn;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Enchantment> enchantment;

}