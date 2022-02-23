package io.github.alphamarga.gestionmedecins.service;

import io.github.alphamarga.gestionmedecins.entity.Visitor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MyUserPrincipal implements UserDetails {
    private final Visitor visitor;


    public MyUserPrincipal(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_VISITOR"));
        return authorities;
    }

    public Visitor getVisitor() {
        return this.visitor;
    }

    @Override
    public String getPassword() {
        return this.visitor.getPasswrd();
    }

    @Override
    public String getUsername() {
        return this.visitor.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
