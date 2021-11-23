package spring.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import spring.dao.AbstractDao;
import spring.dao.RoleDao;
import spring.exception.DataProcessingException;
import spring.model.Role;
import spring.model.RoleName;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getRoleByName = session
                    .createQuery("from Role where roleName = :roleName", Role.class);
            getRoleByName.setParameter("roleName", roleName);
            return getRoleByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Not found role with name " + roleName, e);
        }
    }
}
