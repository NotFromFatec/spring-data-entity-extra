package com.example.demo.model;

import jakarta.persistence.*; // Use jakarta for Spring Boot 3+
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
// import java.util.List; // Uncomment if adding bidirectional mapping in Projeto

@Entity
@Table(name = "Emp") // Maps to the "Emp" table
@Data                 // Lombok: Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor    // Lombok: Generates no-args constructor (required by JPA)
@AllArgsConstructor   // Lombok: Generates all-args constructor
public class Emp {

    @Id // Marks this field as the primary key
    @Column(name = "CodEmp", nullable = false) // Maps to the "CodEmp" column, cannot be null
    private Integer codEmp;

    @Column(name = "Nome", length = 100) // Maps to "Nome", max length 100
    private String nome;

    @Column(name = "Cat", length = 1) // Maps to "Cat", max length 1
    private String cat; // Using String for single character for simplicity with JPA

    @Column(name = "Sal", precision = 7, scale = 2) // Maps to "Sal", decimal type with 7 total digits, 2 after decimal point
    private BigDecimal sal;

    @Column(name = "DataIni") // Maps to "DataIni"
    @Temporal(TemporalType.DATE) // Specifies mapping to SQL DATE type
    private LocalDate dataIni;

    /*
    // Optional: Bidirectional Relationship (if needed)
    // If you want to navigate from Emp back to their Projetos
    @OneToMany(mappedBy = "emp", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // mappedBy = "emp" refers to the 'emp' field in the Projeto class
    // cascade = CascadeType.ALL means operations (persist, merge, remove) on Emp cascade to Projetos
    // fetch = FetchType.LAZY means Projetos are loaded only when accessed
    private List<Projeto> projetos;
    */
}