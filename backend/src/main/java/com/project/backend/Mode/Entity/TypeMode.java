package com.project.backend.Mode.Entity;

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
@Table(name = "TYPE_MODE")
public class TypeMode {
  @Id
  @SequenceGenerator(name = "TypeMode_seq", sequenceName = "TypeMode_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TypeMode_seq")
  @Column(name = "TypeMode_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "TYPE_MODE")
  private String typeMode;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Mode> mode;
}
