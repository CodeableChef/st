package encryption;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Codec工具类，加密、base64等
 * @author ligang
 * @version 1.0
 */
public class Base64Utils {
    public static String encode(byte[] value) {
        return new String(Base64.encodeBase64(value));
    }
    public static String decode(byte[] value) {
         return new String(Base64.encodeBase64(value));
    }
    public static byte[] decodeToBytes(String value) {
    	try {
			return Base64.decodeBase64(value.getBytes());
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
    }
    /**
     * Encode a String to base64
     * @param value The plain String
     * @return The base64 encoded String
     */
    public static String encode(String value) {
        try {
            return new String(Base64.encodeBase64(value.getBytes("utf-8")));
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static String decode(String value) {
    	try {
			return new String(Base64.decodeBase64(value.getBytes("utf-8")));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
    }

}
