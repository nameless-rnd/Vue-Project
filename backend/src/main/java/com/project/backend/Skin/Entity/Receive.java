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
@Table(name = "RECEIVE")
public class Receive {
  @Id
  @SequenceGenerator(name = "Receive_seq", sequenceName = "Receive_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Receive_seq")
  @Column(name = "Receive_ID", unique = true, nullable = true)
  private Long id;

  @NotNull
  @Column(name = "RECEIVE")
  private String receive;

  @OneToMany(fetch = FetchType.EAGER)
  //@NotNull
  private Collection<Skin> skin;

}
