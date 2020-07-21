package com.bakingcrud.springbootthymeleafcookingapp.service;

import java.util.List;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;
import com.bakingcrud.springbootthymeleafcookingapp.respository.InfoRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    
   @Autowired
   private InfoRespository infoRepo;

    @Override
    public List<Info> getAllInfo() {
        
        return infoRepo.findAll();
    }

    @Override
    public void saveInfo(Info info) {
        this.infoRepo.save(info);

    }
}