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
@Table(name = "MAP")
public class Map {
  @Id
  @SequenceGenerator(name = "Map_seq", sequenceName = "Map_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Map_seq")
  @Column(name = "Map_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "MAP")
  private String map;

  @OneToMany(fetch = FetchType.EAGER)
  private Collection<Mode> mode;

}
