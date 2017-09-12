package date;



import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 时间格式化对象封装类(java.text.SimpleDateFormat)
 * @author 李刚
 * @version 1.0.0
 */
public class DateFormat implements Serializable {
	/**
	 * 序列化吗
	 */
	private static final long serialVersionUID = 4802012747135185687L;
	/**
	 * 日期格式化对象
	 */
	private SimpleDateFormat sdf;
	/**
	 * 默认初始化
	 */
	public DateFormat() {
		sdf = new SimpleDateFormat(DateConstants.DEFAULT_PATTERN);
	}
	/**
	 * 带格式初始化
	 * @param pattern 日期格式
	 */
	public DateFormat(final String pattern) {
		sdf = new SimpleDateFormat(pattern);
	}
	/**
	 * 格式化日期为字符串
	 * @param date 日期封装类对象
	 * @return 格式化后的时间字符串
	 */
//	public final String format(final Date date) {
//		return sdf.format(date.get());
//	}
	public final String format(final java.util.Date date) {
		return sdf.format(date);
	}
	/**
	 * 将时间字符串转换为日期封装类对象
	 * @param source 时间字符串
	 * @return 日期封装类对象
	 * @throws ParseException 转换一场
	 */
//	}
	public final java.util.Date parseToDate(final String source) throws Exception {
		if (StringUtils.isEmpty(source)) {
			return null;
		}
		return sdf.parse(source);
	}
}
