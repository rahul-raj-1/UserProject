/**
 * 
 */
package com.homeproject.users.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.users.entity.UserAudit;

/**
 * @author Rahul
 *
 */
@Repository
public interface UserAuditRepository  extends JpaRepository<UserAudit, Long>{

}
