package com.bakingcrud.springbootthymeleafcookingapp.respository;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRespository extends JpaRepository<Info, Long> {
    
}