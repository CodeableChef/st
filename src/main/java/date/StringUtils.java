package date;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description StringUtils
 * <pre>
 * 字符串工具类
 * </pre>
 * @author Eric Li 
 * @createTime 2014年12月3日
 * @version 1.0
 * @modifier Eric Li
 * @modifyTime 2014年12月3日
 */
public class StringUtils {
	public static boolean isEmpty(String... strs) {
		if (strs == null || strs.length == 0) {
			return true;
		}
		for (String str : strs) {
			if (str == null || str.length() == 0) {
				return true;
			}
		}
		return false;
	}

	public static String getRandomStringByUUID() {
		String str = UUID.randomUUID().toString();
		return str.replace("-", "");
	}

	public static String getRandomString(int length) { // length表示生成字符串的长度
		String base = "abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString().toUpperCase();
	}
	
	public static String random(int length) { // length表示生成字符串的长度
		String base = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString().toUpperCase();
	}
	
	public static String getRandomAESIV() {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()_-";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 16; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static Gson gson = new Gson();

	/**
	 * 将对象转成json字符串
	 * 
	 * @param o
	 * @return
	 */
	public static String toStr(Object o) {
		return gson.toJson(o);
	}
	public static <T> T toObj(String str, Class<T> classz) {
		return gson.fromJson(str, classz);
	}

	/**
	 * 将集合转成json字符串
	 * 
	 * @param list
	 * @return
	 */
	public static <T> String listToJson(List<T> list) {
		return gson.toJson(list, new TypeToken<List<T>>() {
		}.getType());
	}

	/**
	 * 将json字符串转成对象
	 * 
	 * @param str
	 * @param clazz
	 * @return
	 */
	public static <T> T jsonToObj(String str, Class<T> clazz) {
		return gson.fromJson(str, clazz);
	}

	/**
	 * <pre>
	 * 将json字符串转成集合
	 * new TypeToken<List<Map<String, Object>>>() {}.getType()
	 * </pre>
	 * @param str
	 * @param type
	 * @return
	 */
	public static <T> List<T> jsonToList(String str, Type type) {
		return gson.fromJson(str, type);
	}
	
	public static <T> List<T> jsonToMapList(String str) {
		return gson.fromJson(str, new TypeToken<List<Map<String, Object>>>() {}.getType());
	}

	public static String listToString(List<String> stringList){
		if (stringList==null) {
			return null;
		}
		StringBuilder result=new StringBuilder();
		boolean flag=false;
		for (String string : stringList) {
			if (flag) {
				result.append(",");
			}else {
				flag=true;
			}
			result.append(string);
		}
		return result.toString();
	}

	public static List<String> matchEmails(String str) {
		List<String> mails = new LinkedList<String>();
		if (!isEmpty(str)) {
			String reg = "([a-z0-9A-Z_][-|\\.]?)+[a-z0-9A-Z_]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}";
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(str);
			while(m.find()) {
				mails.add(m.group());
			}
		}
		return mails;
	}
	public static String[] matchEmailsArray(String str) {
		List<String> mails = matchEmails(str);
		String[] mailsArray = new String[mails.size()];
		for (int i = 0; i < mails.size(); i++) {
			mailsArray[i] = mails.get(i);
		}
		return mailsArray;
	}

	/**
	 * 将null变为empty
	 */
	public static Object null2Str(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}
}
