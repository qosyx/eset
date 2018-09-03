/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hbase;

import java.sql.SQLException;
import org.hbase.cryptage.Décrypter;
import org.hbase.cryptage.Encrypt;

/**
 *
 * @author archange
 */
public class Cryptage {
    
    public static void main(String[] args) throws SQLException {
        Encrypt encrypt = new Encrypt();
         byte[] encrypted = encrypt.encrypt("de jesus20");
         String en1 =new String(encrypted);
         byte[] k =null;
         for (byte b : encrypted) {
            byte b1 = b;
            
        }
        System.out.println(en1);
        System.out.println(encrypted);
        Décrypter décrypter = new Décrypter();
        byte[] decrypted = décrypter.decrypt(encrypted);
        String en =new String(decrypted);
         System.out.println(en);

    }
}
