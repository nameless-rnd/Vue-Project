package com.project.backend.Mode.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "RANK")
public class Rank {
  @Id
  @SequenceGenerator(name = "Rank_seq", sequenceName = "Rank_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Rank_seq")
  @Column(name = "Rank_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "NAME")
  private String name;

  @NotNull
  @Column(name = "IMG_RANK")
  private String img_rank;

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Mode.class)
  private List<Mode> mode = new ArrayList<>();

}
