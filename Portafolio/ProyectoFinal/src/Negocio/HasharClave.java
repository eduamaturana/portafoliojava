/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jorpi
 */
public class HasharClave {
    
    public String MD5(String md5){
        
        try{
            
            MessageDigest md1 = MessageDigest.getInstance("MD5");
            byte[] array = md1.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xff) |0x100).substring(1,3));
                
            }
            
            return sb.toString();
        }catch (NoSuchAlgorithmException e) {
            
             
        }
        
        return null;
        
    }
    
}
