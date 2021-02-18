package com.project.backend.Item.Entity;

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
import javax.validation.constraints.Size;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "ITEM")
public class Item {
  @Id
  @SequenceGenerator(name = "Item_seq", sequenceName = "Item_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Item_seq")
  @Column(name = "Item_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "IMG_ITEM")
  private String img_item;

  @Size(max = 1000)
  @Column(name = "SPECAIL_EFFECT")
  private String specialEffect;

  @NotNull
  @Column(name = "PRICE_ITEM")
  private int priceItem;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeItem.class)
  @JoinColumn(name = "TYPE_ITEM", insertable = true)
  private TypeItem typeItem;

  @ManyToMany(fetch = FetchType.EAGER, targetEntity = PropertyItem.class)
  @JoinColumn(name = "PropertyItem_id", insertable = true)
  @NotNull
  private List<PropertyItem> propertys = new ArrayList<>();

  public void addProperty(PropertyItem property) {
    this.propertys.add(property);
  }
}
