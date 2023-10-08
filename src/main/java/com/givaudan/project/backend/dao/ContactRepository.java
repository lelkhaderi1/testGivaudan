package com.givaudan.project.backend.dao;

import com.givaudan.project.backend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring repositoory pour acceder à la base
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}