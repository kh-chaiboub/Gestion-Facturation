package com.gestion_facturation.Facturation.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String libelle;
    @Column(nullable = false)
    private String ref;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private double quantity_in_stock;
    @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<LigneFactureEntity> factureEntitys;
}
