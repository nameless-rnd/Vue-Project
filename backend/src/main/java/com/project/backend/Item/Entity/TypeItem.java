package com.project.backend.Item.Entity;

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
@Table(name = "TYPE_ITEM")
public class TypeItem {
  @Id
  @SequenceGenerator(name = "TypeItem_seq", sequenceName = "TypeItem_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TypeItem_seq")
  @Column(name = "TypeItem_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "TYPE_ITEM")
  private String typeItem;

  @OneToMany(fetch = FetchType.EAGER, targetEntity = Item.class)
  private Collection<Item> item;

}