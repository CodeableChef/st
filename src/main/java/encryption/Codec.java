package encryption;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Codec工具类，加密、base64等
 * @author ligang
 * @version 1.0
 */
public class Codec {

    /**
     * @return an UUID String
     */
    public static String UUID() {
        return UUID.randomUUID().toString();
    }
    public static void main(String[] args) {
        System.out.println(hexMD5("yuwang" + "lmZMDgvLq3xIMjQK"));
//        System.out.println("uuid: " + UUID());
//        System.out.println("2fa78c49fb4b3189fb67f4cf5efeb369".equals(hexMD5("yuwang" + "lmZMDgvLq3xIMjQK")));
    }
    /**
     * Encode a String to base64
     * @param value The plain String
     * @return The base64 encoded String
     */
    public static String encodeBASE64(String value) {
        try {
            return new String(Base64.encodeBase64(value.getBytes("utf-8")));
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Encode binary data to base64 
     * @param value The binary data
     * @return The base64 encoded String
     */
    public static String encodeBASE64(byte[] value) {
        return new String(Base64.encodeBase64(value));
    }

    /**
     * Decode a base64 value
     * @param value The base64 encoded String
     * @return decoded binary data
     */
    public static String decodeBASE64(byte[] value) {
         return new String(Base64.encodeBase64(value));
    }
    public static byte[] decodeB64(String value) {
    	try {
			return Base64.decodeBase64(value.getBytes());
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
    }
    
    public static String decodeBASE64(String value) {
    	try {
			return new String(Base64.decodeBase64(value.getBytes("utf-8")));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
    }
    
    private final static char[] hexDigits = { '0', '1', '2', '3', '4', '5',  
        '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    
    public static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();  
        int t;  
        for (int i = 0; i < 16; i++) {  
            t = bytes[i];  
            if (t < 0)  
                t += 256;  
            sb.append(hexDigits[(t >>> 4)]);  
            sb.append(hexDigits[(t % 16)]);  
        }  
        return sb.toString();  
    }  
    public static String code(String input, int bit) throws Exception {  
        try {  
            MessageDigest md = MessageDigest.getInstance(System.getProperty(  
                    "MD5.algorithm", "MD5"));  
            if (bit == 16)  
                return bytesToHex(md.digest(input.getBytes("utf-8")))  
                        .substring(8, 24);  
            return bytesToHex(md.digest(input.getBytes("utf-8")));  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
            throw new Exception("Could not found MD5 algorithm.", e);  
        }  
    }  
    
    /**
     * Build an hexadecimal MD5 hash for a String
     * @param value The String to hash
     * @return An hexadecimal Hash
     */
    public static String hexMD5(String value) {
    	return hexMD5(value, "utf-8");
    }
    public static String hexMD5(String value, String encode) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(value.getBytes(encode));
            byte[] digest = messageDigest.digest();
            return byteToHexString(digest);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Build an hexadecimal SHA1 hash for a String
     * @param value The String to hash
     * @return An hexadecimal Hash
     */    
    public static String hexSHA1(String value) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-1");
            md.update(value.getBytes("utf-8"));
            byte[] digest = md.digest();
            return byteToHexString(digest);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Write a byte array as hexadecimal String.
     */
    public static String byteToHexString(byte[] bytes) {
        return String.valueOf(Hex.encodeHex(bytes));
    }

    /**
     * Transform an hexadecimal String to a byte array.
     */
    public static byte[] hexStringToByte(String hexString) {
        try {
            return Hex.decodeHex(hexString.toCharArray());
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
    }

}
