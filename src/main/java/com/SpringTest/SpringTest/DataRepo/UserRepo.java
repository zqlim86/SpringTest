package com.SpringTest.SpringTest.DataRepo;

import com.SpringTest.SpringTest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
