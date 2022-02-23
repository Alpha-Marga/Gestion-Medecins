package io.github.alphamarga.gestionmedecins.service;

import io.github.alphamarga.gestionmedecins.entity.Visitor;
import io.github.alphamarga.gestionmedecins.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final VisitorRepository visitorRepository;

    @Autowired
    public MyUserDetailsService(VisitorRepository visitorRepository){
        this.visitorRepository = visitorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        Visitor visitor = visitorRepository.findVisitorByUsername(username);
        if (visitor == null){
             throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincipal(visitor);
    }
}
