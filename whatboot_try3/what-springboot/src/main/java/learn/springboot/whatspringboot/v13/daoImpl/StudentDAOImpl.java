package learn.springboot.whatspringboot.v13.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import learn.springboot.whatspringboot.v13.dao.StudentDAO;
import learn.springboot.whatspringboot.v13.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOImpl  implements StudentDAO {

    EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
