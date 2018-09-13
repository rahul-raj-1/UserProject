/**
 * 
 */
package com.homeproject.users.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.users.entity.Roles;

/**
 * @author Rahul
 *
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long>
{

	
}
