package com.contract.system.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.contract.system.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
}