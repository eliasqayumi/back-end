package com.example.meyok.Repository;

import com.example.meyok.Model.Expertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpertiseRepository extends JpaRepository<Expertise,String> {
    Optional<Expertise> findExpertiseById(String expertiseId);

}
