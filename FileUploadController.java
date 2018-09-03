/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.SbHibernateShoppingCart.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author archange
 */
class FileUploadController {

  public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";

  public String upload(MultipartFile[] files) {
      System.out.println( System.getProperty("user.dir"));
      //public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	  StringBuilder fileNames = new StringBuilder();
	  for (MultipartFile file : files) {
		  java.nio.file.Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
		  fileNames.append(file.getOriginalFilename()+" ");
		  try {
			Files.write(fileNameAndPath, file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }
	 // model.addAttribute("msg", "Successfully uploaded files "+fileNames.toString());
	  return fileNames.toString();
  }
    
}
