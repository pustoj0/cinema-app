package spring.dao;

import java.util.Optional;
import spring.model.Role;
import spring.model.RoleName;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(RoleName roleName);
}
