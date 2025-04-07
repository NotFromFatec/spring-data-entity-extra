package com.example.demo.repository;

import com.example.demo.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a Spring repository component
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    // JpaRepository<EntityType, IdType> provides basic CRUD operations:
    // save(), findById(), findAll(), deleteById(), count(), existsById(), etc.

    // You can add custom query methods here if needed, e.g.:
    // List<Emp> findByNomeContainingIgnoreCase(String name);
    // List<Emp> findBySalGreaterThan(BigDecimal salary);
}