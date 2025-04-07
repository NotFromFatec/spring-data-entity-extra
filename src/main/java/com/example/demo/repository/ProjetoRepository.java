package com.example.demo.repository;

import com.example.demo.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List; // Uncomment if adding custom methods

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
    // Provides basic CRUD operations for Projeto entities.

    // You can add custom query methods here if needed, e.g.:
    // List<Projeto> findByTipo(String tipo);
    // List<Projeto> findByEmpCodEmp(Integer empCodEmp); // Find projects by employee ID
    // List<Projeto> findByEmp(Emp emp); // Find projects by employee object
}