package com.multipartupload.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.multipartupload.service.FileInfoServiceImpl;

@RestController
public class FileInfoController {
	
	@Autowired
	private FileInfoServiceImpl fileInfoServiceImpl;
	
	@PostMapping("/upload")
	public String uploadFile(@RequestParam("requestPath") String requestPath , @RequestParam("multipartFile") MultipartFile multipartFile) {
		
		try {
			fileInfoServiceImpl.uploadImage(requestPath, multipartFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "File Uploaded Successfully....";
		
	}

}
