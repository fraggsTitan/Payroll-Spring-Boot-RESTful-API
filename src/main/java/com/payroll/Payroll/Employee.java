package com.payroll.Payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {
    private @Id  @GeneratedValue Long id;
    private String name;
    private String role;
    public Employee(){}
    public Employee(String name, String role) {this.name=name;this.role=role;}
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getRole() {return role;}
    public void setId(long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setRole(String role) {this.role = role;}
    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if(!(o instanceof Employee))return false;
        Employee e = (Employee)o;
        return (Objects.equals(this.id, e.id))&&(Objects.equals(this.name, e.name))&&(Objects.equals(this.role, e.role));
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.role);
    }
    @Override
    public String toString(){
        return String.format("Employee{ id=%d, name='%s', role='%s'}",this.id,this.name,this.role);
    }
}
