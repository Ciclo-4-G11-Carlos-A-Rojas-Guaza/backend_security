package com.carguaza.grupo11.securityBackendOnceCarguaza.repositories;

import com.carguaza.grupo11.securityBackendOnceCarguaza.models.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer> {
}
