package com.podiatric.persistance.entity.user;


import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;


public class UserId implements Serializable {
    private Integer username;
    private Integer role;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equals(username, userId.username) && Objects.equals(role, userId.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
}
