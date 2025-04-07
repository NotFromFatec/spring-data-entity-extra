package com.example.demo.model;

import jakarta.persistence.*; 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Projeto") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projeto {

    @Id 
    @Column(name = "CodProj", nullable = false) 
    private Integer codProj;

    @Column(name = "tipo", length = 15) 
    private String tipo;

    @Column(name = "descr", length = 255) 
    private String descr;

    
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "EmpCodEmp", referencedColumnName = "CodEmp", nullable = false) // Defines the foreign key column
    
    private Emp emp; 
}
