package com.gestion_facturation.Facturation.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "factures")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FactureEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Integer ref;
    @Column(nullable = false,name = "date_create_facture")
    private Date date;
    @ManyToOne()
    private ClientEntity client;


}
