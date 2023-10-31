package com.developers.hireasenior.repository;

import com.developers.hireasenior.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import com.developers.hireasenior.model.Account;

import java.util.List;
import java.util.Set;

import java.util.Optional;


public interface AccountRepository extends JpaRepository<Account, String>  {
    List<Account> findAllByTechnologiesIn(Set<Technology> technologies);
    Optional<Account> findByEmail(String email);
}
