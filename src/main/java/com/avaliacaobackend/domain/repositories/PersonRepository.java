package com.avaliacaobackend.domain.repositories;

import com.avaliacaobackend.domain.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


}
