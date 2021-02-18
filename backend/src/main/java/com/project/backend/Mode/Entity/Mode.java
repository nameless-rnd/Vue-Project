package com.project.backend.Mode.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "MODE")
public class Mode {
  @Id
  @SequenceGenerator(name = "Mode_seq", sequenceName = "Mode_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Mode_seq")
  @Column(name = "Mode_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "INFORMATION")
  private String information;

  @NotNull
  @Column(name = "IMG_MODE")
  private String img_mode;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeMode.class)
  @JoinColumn(name = "TYPE_MODE", insertable = true)
  @NotNull
  private TypeMode TypeMode;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Map.class)
  @JoinColumn(name = "map_id", insertable = true)
  @NotNull
  private Map map;

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Rank.class)
  @JoinColumn(name = "rank_id", insertable = true)
  private List<Rank> ranks = new ArrayList<>();

  public void addRank(Rank rank) {
    this.ranks.add(rank);
  }

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = Monster.class)
  @JoinColumn(name = "monster_id", insertable = true)
  private List<Monster> monsters = new ArrayList<>();

  public void addMonster(Monster monster) {
    this.monsters.add(monster);
  }

}
