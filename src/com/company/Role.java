package com.company;

import java.util.List;

public enum Role {
    ADMIN(List.of(Authoroties.SUPER_USER)),
    GUEST(List.of(Authoroties.READ_RECORD));

    private List<Authoroties> authorities;

    Role(List<Authoroties> authorities) {
        this.authorities = authorities;
    }
}
