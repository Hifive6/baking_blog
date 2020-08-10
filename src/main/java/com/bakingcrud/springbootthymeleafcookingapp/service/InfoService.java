package com.bakingcrud.springbootthymeleafcookingapp.service;

import java.util.List;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;

public interface InfoService {
    List<Info> getAllInfo();
    Info saveInfo(Info info);
    // Info saveInfo(MultipartFile file);
	// List<Info> createSession(String fullName, String description, String title, CommonsMultipartFile[] image);
}