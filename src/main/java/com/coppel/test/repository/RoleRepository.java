package com.coppel.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coppel.test.model.Role;

public interface RoleRepository  extends JpaRepository<Role, Long> {

}
