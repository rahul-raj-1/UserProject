package com.homeproject.users.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homeproject.users.dto.UserDto;
import com.homeproject.users.entity.UserAudit;
import com.homeproject.users.entity.Users;
import com.homeproject.users.reporistory.UserAuditRepository;
import com.homeproject.users.reporistory.UserRepository;

 

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserAuditRepository userAuditRepository;

	
	public UserDto getUsersList() {
		
		List<Users> userList= userRepository.findAll();
		UserDto userDto = new UserDto();
		userDto.setUserList(userList);
		return userDto;
		
		
	}
	
@Transactional	//if you omit this your updates wont be commited
public void updateUsers(List<Long> userIds) {

	     for (Long i : userIds) {
	         Optional<Users> user = userRepository.findById(i);
	            if(user.isPresent()){
                    user.get().setIsActive(6L);
	                user.get().setUserName(" rahul raj");
	                auditLog(user);
	            }
	            
	            
	       }
	
		
	}

@Override
@Transactional	
public void auditLog(Optional<Users> user) {
	
	UserAudit userAudit = new UserAudit();
	
	userAudit.setIsActive(user.get().getIsActive());
	userAudit.setName(user.get().getUserName());
	userAudit.setUserId(user.get().getUserId());
	userAudit.setModTime(LocalDate.now());	
    userAuditRepository.save(userAudit);
	
    //System.out.println( " user.get().getCreatedBy --- " + user.get().getCreatedBy());
}





	

}
