package com.example.prototypeweb.rest;

import com.example.prototypeweb.domain.Bom;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bom", path = "bom")
public interface BomRepository extends PagingAndSortingRepository<Bom, Integer> {
}
