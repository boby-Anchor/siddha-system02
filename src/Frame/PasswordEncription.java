/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author CHETHANA
 */
    public class PasswordEncription {
   private static final String ALGORITH = "AES";
   private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
   private static final String PASSKEY = "ThisIsTheKeyValu";

   public static final String encrypt(String message){

       byte[] encryptedMessage = null;

       try {
           Cipher cipher = Cipher.getInstance(TRANSFORMATION);
           SecretKey sk = new SecretKeySpec(PASSKEY.getBytes(), ALGORITH);
           cipher.init(Cipher.ENCRYPT_MODE,sk);
           encryptedMessage = cipher.doFinal(message.getBytes());
           encryptedMessage = Base64.getEncoder().encode(encryptedMessage);
       } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
           systemLogger.initLogger(invoice.class).error("encrypt() Error",ex);
       }
       return new String(encryptedMessage);
   }

   public static final String decrypt(String message){

       byte[] decryptedMessage = null;

       try {
           Cipher cipher = Cipher.getInstance(TRANSFORMATION);
           SecretKey sk = new SecretKeySpec(PASSKEY.getBytes(), ALGORITH);
           cipher.init(Cipher.DECRYPT_MODE,sk);
//           decryptedMessage = cipher.doFinal(message.getBytes());
           decryptedMessage = cipher.doFinal(Base64.getDecoder().decode(message));
       } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
           systemLogger.initLogger(invoice.class).error("decrypt() Error",ex);
       }
       return new String(decryptedMessage);
   }
        public static void main(String[] args) {
            ;
            System.out.println(PasswordEncription.encrypt("6414"));
            
        }
}

