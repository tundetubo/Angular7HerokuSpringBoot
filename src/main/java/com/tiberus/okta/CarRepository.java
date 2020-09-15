//class to perform CRUD (create, read, update, and delete) on the Car entity.

package com.tiberus.okta;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200") //map port for request from Angular front-end
interface CarRepository extends JpaRepository<Car, Long>{
	

}
