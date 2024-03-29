package com.site.restauranttier.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");
    UserRole(String value){
        this.value = value;
    }

    String value;
}
