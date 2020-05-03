package com.example.prototypeweb.rest;

import com.example.prototypeweb.domain.Material;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "materials", path = "materials")
public interface MaterialRepository extends PagingAndSortingRepository<Material, Integer> {
	List<Material> findByCode(@Param("code") String code);
}
