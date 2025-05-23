package com.podiatric.persistance.entity.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "username", nullable = false, length = 200)
    private String username;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "disbled", columnDefinition = "TINYINT", nullable = false)
    private boolean disabled = false;

    @Column(name = "locked", columnDefinition = "TINYINT", nullable = false)
    private boolean locked = false;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserRoleEntity> roles;



}
