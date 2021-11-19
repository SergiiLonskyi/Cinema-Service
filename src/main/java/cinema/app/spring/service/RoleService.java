package cinema.app.spring.service;

import cinema.app.spring.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}
