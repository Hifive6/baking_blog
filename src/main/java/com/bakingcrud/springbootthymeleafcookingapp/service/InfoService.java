package com.bakingcrud.springbootthymeleafcookingapp.service;

import java.util.List;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;

import org.springframework.web.multipart.MultipartFile;

public interface InfoService {
    List<Info> getAllInfo();
    void saveInfo(Info info);
    // Info saveInfo(MultipartFile file);
}