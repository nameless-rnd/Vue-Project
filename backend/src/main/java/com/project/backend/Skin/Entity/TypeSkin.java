package com.project.backend.Skin.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "TYPE_SKIN")
public class TypeSkin {
  @Id
  @SequenceGenerator(name = "TypeSkin_seq", sequenceName = "TypeSkin_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TypeSkin_seq")
  @Column(name = "TypeSkin_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "TYPE_SKIN")
  private String typeSkin;

  @OneToMany(fetch = FetchType.EAGER)
  //@NotNull
  private Collection<Skin> skin;

}
