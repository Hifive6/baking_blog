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
    public Info saveInfo(Info info) {
        return this.infoRepo.save(info);

    }

    // @Override
    // public Info saveInfo(MultipartFile file) {
    //     String filename = StringUtils.cleanPath(file.getOriginalFilename());

    //     try {
           
    //         Info info = new Info(file.getContentType(), file.getContentType(), file.getContentType(), file.getContentType(),
    //                 file.getBytes());

    //          return infoRepo.save(info);
    //     } catch (Exception e) {
    //          "Could not store file " + filename + " please, try again.";
    //     }
    // }
}