package com.consult.consultancy.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//            generator = "system-uuid")
//    @GenericGenerator(name="system-uuid" , strategy = "uuid")


    List<String> columns;

    public Employee(List<String> columns) {
        this.columns = columns;
    }

}
