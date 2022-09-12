package com.gestion_facturation.Facturation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="roles")
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity implements Serializable {
    @Id
    private Integer roleId;
    @Column(nullable = false)
    private String name;
    @ManyToMany()
    @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "roleId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<UserEntity> users;
}
