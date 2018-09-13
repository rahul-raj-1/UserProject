package com.homeproject.users.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.users.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>
{

}
