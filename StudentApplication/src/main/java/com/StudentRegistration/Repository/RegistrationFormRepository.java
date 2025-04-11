package com.StudentRegistration.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.StudentRegistration.Entity.RegistrationForm;
import com.demo.entity.Registration;

public interface RegistrationFormRepository extends CrudRepository<RegistrationForm, Long> {

	//Jpql Query
	@Query("Select r from RegistrationForm r.email = :x")
	RegistrationForm findByEmployeeEmail(@Param("x") String email);
	
	@Query("Select r from RegistrationForm r.mobile = :y")
	RegistrationForm findByEmployeeMobile(@Param("y") String mobile);
	
	@Query("Select r from RegistrationForm r.email = :x and r.mobile= :y")
	RegistrationForm findByEmployeeEmailAndMobile(@Param("x") String email, @Param("y") String mobile);
	
	@Query("Select r from RegistrationForm r.email = :x or r.mobile=:y")
	List<RegistrationForm> findByEmployeeEmailOrMobile(@Param("x") String email, @Param("y") String mobile);
	
	
	Optional<RegistrationForm> findByEmail(String email);
	Optional<RegistrationForm> findByMobile(String mobile);
	Iterable<RegistrationForm> findByEmailOrMobile(String email, String mobile);
	Optional<RegistrationForm> findByEmailAndMobile(String email, String mobile);
	
	
}