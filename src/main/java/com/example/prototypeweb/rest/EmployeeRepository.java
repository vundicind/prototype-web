package com.example.prototypeweb.rest;

import com.example.prototypeweb.domain.Employee;
import com.example.prototypeweb.domain.Material;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
	List<Material> findByCode(@Param("code") String code);
}
