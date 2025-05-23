package com.podiatric.persistance.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name ="user_role")
@IdClass(UserId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleEntity {

    @Id
    @Column(name = "id_user", length = 200)
    private String username;

    @Id
    @Column(name = "role", length = 20)
    private String role;

    @Column(name = "granted_date")
    private LocalDateTime grantedDate;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    private UserEntity user;
}
