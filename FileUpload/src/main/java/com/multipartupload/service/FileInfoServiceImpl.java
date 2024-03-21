package com.multipartupload.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileInfoServiceImpl {
	
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		// Original File name to be copied...
		String originalFileName = file.getOriginalFilename(); 
		
		// Where To upload...
		String filePath  = path + File.separator+originalFileName; 
		
		// Create Folder if not created...
		File file2 = new File(path);
		if(!file2.exists()) {
			file2.mkdir();
		}
		
//		File Copy...
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
		return originalFileName;
		
	}

}
