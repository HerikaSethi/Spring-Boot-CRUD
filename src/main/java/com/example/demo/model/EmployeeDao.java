package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.UUID;

@Table(name = "employee")
@Entity
@Data
public class EmployeeDao {
    @Column(name = "id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator", parameters = {
            @Parameter(name = "UUID_gen_strategy_class", value = "org.hibernate.id.UUID.CustomVersionOneStrategy") })
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "email")
    private String email;
}
