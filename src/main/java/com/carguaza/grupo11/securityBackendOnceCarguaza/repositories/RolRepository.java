package com.carguaza.grupo11.securityBackendOnceCarguaza.repositories;

import com.carguaza.grupo11.securityBackendOnceCarguaza.models.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {
}
