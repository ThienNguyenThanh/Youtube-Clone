package com.newbiecoder.youtubeclone.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseService implements FileService {

    @Override
    public String uploadFile(MultipartFile file) {
        return "test";
    };

    @Override
    public void getFile() {
        // FirebaseOptions bucket =
    }
}
