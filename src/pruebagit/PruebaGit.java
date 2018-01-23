/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author hectortllo
 */
public class PruebaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("hola mundo (en minúsculas)");
        System.out.println("hola mundo (desde github.com)");
        
        String textoSinEncriptar="sergio"; 
        String textoEncriptadoConMD5=DigestUtils.md5Hex(textoSinEncriptar); 
        System.out.println("Texto Encriptado con MD5 : "+textoEncriptadoConMD5);
    }
    
}
