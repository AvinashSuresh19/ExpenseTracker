package com.example.webDevOne.expense.model;

import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="users")
public class Users {
    
    @Id
    private Long id;

    private String name;

    private String email; 
    
    @OneToMany
    private Set<Category> category;
   
}
