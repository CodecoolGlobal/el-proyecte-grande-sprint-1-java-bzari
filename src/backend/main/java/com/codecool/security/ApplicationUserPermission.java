package com.codecool.security;

import lombok.Getter;

@Getter
public enum ApplicationUserPermission {

    POST_WRITE("post:write"),
    POST_READ("post:read");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
