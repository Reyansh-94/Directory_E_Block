package com.webdemo.Repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.webdemo.Entity.Registration;


public interface RegistrationRepository extends JpaRepository<Registration, Long> {
        @Modifying
	    @Transactional
		@Query("DELETE FROM Registration r WHERE r.emailId=:x")
		void deleteByEmailId(@Param("x") String emailId);

}
