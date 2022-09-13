package com.gestion_facturation.Facturation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@Table(name = "profiles")
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String avatar ;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private String phone;
}
