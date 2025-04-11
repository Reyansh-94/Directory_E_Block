package com.Repository.Student;


import java.util.List;

import org.apache.catalina.User;
import org.hibernate.annotations.SQLInsert;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	com.Model.Student.User save(com.Model.Student.User user);
	
	@Find
	List<User> findAll();
	
    @SQLInsert(sql = "user") 
	User save(User user);
}
