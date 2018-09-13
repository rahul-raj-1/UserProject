/**
 * 
 */
package com.homeproject.users.reporistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeproject.users.entity.UserRoles;

/**
 * @author Rahul
 *
 */
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
	
	//List<UserRoles> findAll();

}
