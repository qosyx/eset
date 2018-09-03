/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.SbHibernateShoppingCart.service;

import java.io.File;

/**
 *
 * @author archange
 */
public class FileUpload {

    public FileUpload() {
        new File(FileUploadController.uploadDirectory).mkdir();
    }
    
    
    
}
