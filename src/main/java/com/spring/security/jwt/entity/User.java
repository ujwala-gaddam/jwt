package com.spring.security.jwt.entity;

import com.spring.security.jwt.enums.Role;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.modelmapper.internal.bytebuddy.asm.MemberSubstitution;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.AllArguments;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@RequiredArgsConstructor



public class User implements UserDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        @Column(unique = true)
        private String email;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public @Nullable String getPassword() {
        return this.password;
    }
    @Override
    public String getUsername() {
        return this.name;
    }
}
