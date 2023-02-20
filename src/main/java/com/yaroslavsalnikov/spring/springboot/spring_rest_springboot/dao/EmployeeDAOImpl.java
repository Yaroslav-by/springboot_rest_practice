package com.yaroslavsalnikov.spring.springboot.spring_rest_springboot.dao;

import com.yaroslavsalnikov.spring.springboot.spring_rest_springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

//import org.hibernate.Session;
//import org.hibernate.query.Query;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

//        Hibernate realisation
//        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployees = session.createQuery("from Employee ", Employee.class).getResultList();

//        JPA realisation
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

//        Hibernate realisation
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);

//        JPA realisation
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());

    }

    @Override
    public Employee getEmployee(int id) {
//        Hibernate realisation
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);

//        JPA realisation
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {

//        Hibernate realisation
//        Session session = entityManager.unwrap(Session.class);
//
//        First way
//        Employee employee = session.get(Employee.class, id);
//        session.delete(employee);
//
//        Second way
//        Query<Employee> query = session.createQuery("delete from Employee where id=:employeeID");
//        query.setParameter("employeeID", id);
//        query.executeUpdate();

//        JPA realisation
        Query query = entityManager.createQuery("delete from Employee where id=:employeeID");
        query.setParameter("employeeID", id);
        query.executeUpdate();

    }

}
