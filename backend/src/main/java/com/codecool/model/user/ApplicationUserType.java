package com.codecool.model.user;

import com.codecool.security.ApplicationUserPermission;
import com.google.common.collect.Sets;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.codecool.security.ApplicationUserPermission.*;

@Getter
public enum ApplicationUserType {
    USER(Sets.newHashSet(POST_READ)),
    MODERATOR(Sets.newHashSet(POST_READ)),
    ADMIN(Sets.newHashSet(POST_WRITE, POST_READ, TOPIC_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserType(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}