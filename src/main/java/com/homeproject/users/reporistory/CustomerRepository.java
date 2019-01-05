package com.homeproject.users.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.users.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
