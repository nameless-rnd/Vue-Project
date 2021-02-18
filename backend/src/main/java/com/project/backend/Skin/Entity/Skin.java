package com.project.backend.Skin.Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.*;

/*import java.util.ArrayList;
import java.util.List;*/

@Data
@Entity
@NoArgsConstructor
@Table(name = "SKIN")
public class Skin {
  @Id
  @SequenceGenerator(name = "Skin_seq", sequenceName = "Skin_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Skin_seq")
  @Column(name = "Skin_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "IMG_SMALL")
  private String img_small;

  @NotNull
  @Column(name = "IMG_BIG")
  private String img_big;

  /*@NotNull
  @Column(name = "RECEIVE")
  private String receive;*/

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeSkin.class)
  @JoinColumn(name = "TYPE_SKIN", insertable = true)
  @NotNull
  private TypeSkin typeSkin;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Receive.class)
  @JoinColumn(name = "RECEIVE", insertable = true)
  @NotNull
  private Receive Howto;

}
