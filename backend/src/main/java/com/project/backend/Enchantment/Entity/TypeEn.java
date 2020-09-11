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
@Table(name = "TYPE_EN")
public class TypeEn {
  @Id
  @SequenceGenerator(name = "TypeEn_seq", sequenceName = "TypeEn_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TypeEn_seq")
  @Column(name = "TypeEn_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "TYPE_EN")
  private String typeEn;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Enchantment> enchantment;

}