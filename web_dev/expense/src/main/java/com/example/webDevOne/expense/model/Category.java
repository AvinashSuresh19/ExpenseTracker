package com.example.webDevOne.expense.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import io.micrometer.core.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="category")
public class Category {
    @Id
    private Long id;

    @NonNull
    private String name;

    
}
