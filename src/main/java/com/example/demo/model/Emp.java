package com.example.demo.model;

import jakarta.persistence.*; 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
 

@Entity
@Table(name = "Emp") 
@Data                 
@NoArgsConstructor   
@AllArgsConstructor   
public class Emp {

    @Id 
    @Column(name = "CodEmp", nullable = false) 
    private Integer codEmp;

    @Column(name = "Nome", length = 100) 
    private String nome;

    @Column(name = "Cat", length = 1) 
    private String cat; 

    @Column(name = "Sal", precision = 7, scale = 2) 
    private BigDecimal sal;

    @Column(name = "DataIni") 
    @Temporal(TemporalType.DATE) 
    private LocalDate dataIni;

    /*
    */
}
