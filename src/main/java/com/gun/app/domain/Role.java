package com.gun.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    USER("사용자", "ROLE_USER"),
    ADMIN("관리자", "ROLE_ADMIN");

    private String title;
    private String value;
}
