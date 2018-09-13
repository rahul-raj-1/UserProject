/**
 * 
 */
package com.homeproject.users.service;

import java.util.List;
import java.util.Optional;

import com.homeproject.users.dto.UserDto;
import com.homeproject.users.entity.Users;

/**
 * @author Rahul
 *
 */

public interface UserService {

	
	 UserDto getUsersList();
	 void updateUsers(List<Long> userIds);
	  void    auditLog(Optional<Users> user);


}
