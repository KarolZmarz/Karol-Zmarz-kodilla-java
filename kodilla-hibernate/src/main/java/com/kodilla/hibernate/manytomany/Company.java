package com.kodilla.hibernate.manytomany;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.findCompanyByFirst3Letters",
        query = "SELECT * FROM COMPANIES WHERE LEFT(company_name, 3) = :LETTERS",
        resultClass = Company.class
)
@NamedNativeQuery(
        name = "Company.findCompanyByNameFragment",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%', :FRAGMENT , '%')",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(int id) {
        this.id = id;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
