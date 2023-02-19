package com.yaroslavsalnikov.spring.springboot.spring_rest_springboot.dao;

import com.yaroslavsalnikov.spring.springboot.spring_rest_springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);

        List<Employee> allEmployees = session.createQuery("from Employee ", Employee.class).getResultList();

        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//
//        Session session = sessionFactory.getCurrentSession();
//
//        session.saveOrUpdate(employee);
//
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//
//        Session session = sessionFactory.getCurrentSession();
//
//        Employee employee = session.get(Employee.class, id);
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//
//        Session session = sessionFactory.getCurrentSession();
//
////        First way
////        Employee employee = session.get(Employee.class, id);
////        session.delete(employee);
//
////        Second way
//        Query<Employee> query = session.createQuery("delete from Employee where id=:employeeID");
//        query.setParameter("employeeID", id);
//        query.executeUpdate();
//
//    }

}
