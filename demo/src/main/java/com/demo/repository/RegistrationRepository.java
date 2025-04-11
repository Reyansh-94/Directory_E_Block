package com.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long>{

	//Finder method should be abstract
	//Should start with findByVariablename
@Query("Select r from Registration r where r.email=:x")
Registration findByEmployeeEmail(@Param("x") String email);

@Query("Select r from Registration r where r.mobile=:x")
Registration findByEmployeeMobile(@Param("x") String mobile);
	
@Query("Select r from Registration r where r.email=:x or r.mobile=:y")
List<Registration> findByEmployeeEmailOrMobile(@Param("x") String email, @Param("y") String mobile);

@Query("Select r from Registration r where r.email=:x and r.mobile=:y")
Registration findByEmployeeEmailAndMobile(@Param("x") String email, @Param("y") String mobile);

	Optional<Registration> findByEmail(String email);
	Optional<Registration> findByMobile(String mobile);
	Iterable<Registration> findByEmailOrMobile(String email, String mobile);
	Optional<Registration> findByEmailAndMobile(String email, String mobile);	
}	

