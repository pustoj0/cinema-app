package spring.service;

import spring.model.Role;
import spring.model.RoleName;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(RoleName roleName);
}
