package io.github.alphamarga.gestionmedecins.repository;

import io.github.alphamarga.gestionmedecins.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, String> {
    Visitor findVisitorByUsername(String login);
//    @Query("SELECT v FROM Visitor v WHERE v.username = :username")
//    public Visitor getUserByUsername(@Param("username") String username);


}
