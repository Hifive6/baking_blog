package com.bakingcrud.springbootthymeleafcookingapp.service;

import java.util.List;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;
import com.bakingcrud.springbootthymeleafcookingapp.respository.InfoRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

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

    // @Override
    // public Info storeFile(MultipartFile file){
    //     String filename = StringUtils.cleanPath(file.getOriginalFilename());

    //     try {
    //         if(filename.contains("...")){
    //             throw new Exception("Sorry! Filename contains invalid path sequence " + filename);
    //         }

    //         Info dbimage = new Info(null, filename, file.getContentType(), filename, filename, file.getBytes());
    //          return infoRepo.save(dbimage);
    //     } catch (Exception e) {
    //         throw new Exception("Could not store file " + filename + " please, try again.")
    //     }
    // }
}