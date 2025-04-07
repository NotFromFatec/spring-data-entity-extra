package com.example.demo.model;

import jakarta.persistence.*; // Use jakarta for Spring Boot 3+
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Projeto") // Maps to the "Projeto" table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projeto {

    @Id // Marks this field as the primary key
    @Column(name = "CodProj", nullable = false) // Maps to "CodProj", cannot be null
    private Integer codProj;

    @Column(name = "tipo", length = 15) // Maps to "tipo", max length 15
    private String tipo;

    @Column(name = "descr", length = 255) // Maps to "descr", max length 255
    private String descr;

    // --- Relationship Mapping ---
    // Many projects can be associated with one employee (Emp)
    @ManyToOne(fetch = FetchType.LAZY) // LAZY fetching is usually preferred for performance
    @JoinColumn(name = "EmpCodEmp", referencedColumnName = "CodEmp", nullable = false) // Defines the foreign key column
    // name = "EmpCodEmp": The name of the foreign key column in the "Projeto" table.
    // referencedColumnName = "CodEmp": The name of the primary key column in the "Emp" table that this FK refers to.
    // nullable = false: Indicates that every Projeto must be linked to an Emp.
    private Emp emp; // Represents the associated Employee object
}