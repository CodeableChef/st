package date;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 日期工具类
 * @author 李刚
 * @version 1.0.0
 */
public class DateUtils {
	/**
	 * 获取当前时间封装类对象
	 * @return 时间封装类对象
	 */
	public static final Date currentDate() {
		return new Date();
	}
	/**
	 * 获取当前时间字符串
	 * @return 时间字符串
	 */
	public static final String currentStrDate() {
		return new Date().toString();
	}
	public static final String currentStrDate(DateFormat format) {
		return format(new Date(), format);
	}
	public static final long current() {
		return System.currentTimeMillis();
	}
	public static final String currentStr() {
		return String.valueOf(System.currentTimeMillis());
	}
	/**
	 * 将日期封装类对象格式化成时间字符串
	 * @param date 日期封装类对象
	 * @param pattern 格式化对象
	 * @return 根据格式化字符串格式化后的时间字符串
	 */
	public static final String format(final Date date, final DateFormat format) {
		return format.format(date);
	}
	public static final String format(final Date date, final String pattern) {
		DateFormat format = new DateFormat(pattern);
		return format.format(date);
	}
	/**
	 * 将时间字符串以格式化字符串转换为时间封装类对象
	 * @param source 时间字符串
	 * @param format 格式化对象
	 * @return 转换好的时间封装类对象
	 * @throws ParseException 转换异常
	 */
	public static final Date parse(final String source, final DateFormat format) throws Exception {
		return format.parseToDate(source);
	}
	public static final Date parse(final String source, final String pattern) throws Exception {
		DateFormat format = new DateFormat(pattern);
		return format.parseToDate(source);
	}
	public static final String getBeforeDay(final Date date, final DateFormat format) throws Exception {
		return getBeforeDay(date, 1, format);
	}
	public static final String getAfterDay(final Date date, final DateFormat format) throws Exception {
		return getAfterDay(date, 1, format);
	}
	public static final String getBeforeDay(final Date date, final int num, final DateFormat format) throws Exception  {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE) - num);
		return format(c.getTime(), format);
	}
	public static final String getAfterDay(final Date date, final int num, final DateFormat format) throws Exception  {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE) + num);
		return format(c.getTime(), format);
	}
	public static final int getHour(final Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.HOUR_OF_DAY);
	}
	public static int getYear(final Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.YEAR);
	}
	/**
	 * 计算两个日期相隔天数
	 * @param dt1 小的时间
	 * @param dt2 大的时间
	 * @return 相隔天数
	 */
	public static final long calcDateDay(final Date dt1, final Date dt2) throws Exception {
		return (dt2.getTime()-dt1.getTime()+1000000)/(3600*24*1000);
	}
	public static final Date getDate(String time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(Long.parseLong(time));
		return c.getTime();
	}
	public static final Date getDate(long time) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time);
		return c.getTime();
	}
	public static final String ZERO = "0";
	public static final String DBL_ZERO = "00";
	public static final String CNT_COLUMN_PREFIX = "m";
	public static final String getHourAndTenMin(Date date)  {
		Calendar c = Calendar.getInstance();
		StringBuffer sb = new StringBuffer(CNT_COLUMN_PREFIX);
		c.setTime(date);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		if (hour >= 10) {
			sb.append(hour);
		} else {
			sb.append(ZERO).append(hour);
		}
		if (minute >= 10) {
			sb.append(minute / 10).append(ZERO);
		} else {
			sb.append(DBL_ZERO);
		}
		return sb.toString();
	}


	/**
	 * 在日期上增加数个整月
	 */
	public static Date addMonth(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	/**
	 * 在日期上增加数个整天
	 */
	public static Date addDay(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, n);
		return cal.getTime();
	}

	/**
	 * 在日期上增加数个小时
	 */
	public static Date addHour(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, n);
		return cal.getTime();
	}

	/**
	 * 在日期上增加数个分钟
	 */
	public static Date addMinute(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, n);
		return cal.getTime();
	}

	/**
	 * 得到两个日期时间的差额
	 */
	public static long betDate(Date date, Date otherDate) {
		return date.getTime() - otherDate.getTime();
	}

	/**
	 * 以年，月，日来构造一个日子
	 */
	public static Date makeDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1, year);
		calendar.set(2, month - 1);
		calendar.set(5, day);
		calendar.set(11, 0);
		calendar.set(12, 0);
		calendar.set(13, 0);
		calendar.set(14, 0);
		return calendar.getTime();
	}

	/**
	 * 以年，月，日，小时，分钟，秒来构造一个日子
	 */
	public static Date makeDate(int year, int month, int day, int hour,
			int minute, int second) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1, year);
		calendar.set(2, month - 1);
		calendar.set(5, day);
		calendar.set(11, hour);
		calendar.set(12, minute);
		calendar.set(13, second);
		calendar.set(14, 0);
		return calendar.getTime();
	}

	/**
	 * 返回指定日期是哪一月
	 */
	public static int getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(2) + 1;
	}


	/**
	 * 返回指定日期是哪一年
	 */
	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(5);
	}

	/**
	 * 返回指定日期是周几
	 */
	public static int getWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK);

		if (week == 1)
			return 7;
		else
			return week - 1;

	}
	/**
	 * 获取指定日期的年份
	 * @param date Date日期
	 * @return int 年份
	 */
	public static int getYearOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回年份
		return c.get(Calendar.YEAR);
	}

	/**
	 * 获取指定日期的月份
	 * @param date Date日期
	 * @return int 月份
	 */
	public static int getMonthOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回月份
		return c.get(Calendar.MONTH) + 1;
	}

	/**
	 * 获取指定日期的Day
	 * @param date Date日期
	 * @return int
	 */
	public static int getDayOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回月份
		return c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 获取指定日期的小时
	 * @param date Date日期
	 * @return int 日份
	 */
	public static int getHourOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回日
		return c.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获取指定日期的分钟
	 * @param date Date日期
	 * @return int 分钟
	 */
	public static int getMinuteOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回分钟
		return c.get(Calendar.MINUTE);
	}

	/**
	 * 获取指定日期的秒钟
	 * @param date Date日期
	 * @return int 秒钟
	 */
	public static int getSecondOfDate(Date date) {
		// 得到日期的实例
		Calendar c = Calendar.getInstance();
		// 转换至日历对象
		c.setTime(date);
		// 返回秒钟
		return c.get(Calendar.SECOND);
	}

	/**
	 * 获取当前日期的星期 [如需要中文日期,另写方法]
	 * @param date param
	 * @return 当前日期的星期名（英文三位）
	 */
	public static String getWeekOfDate(Date date) {
		String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // 星期
		// 获得日历实例
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// 星期计算
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0) {
			w = 0;
		}
		// 返回星期名
		return weekDays[w];
	}
	
	public static Date getNextSecond(Date date, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(getYear(date),
				getMonth(date) - 1,
				getDay(date),
				getHour(date),
				getMinuteOfDate(date),
				getSecondOfDate(date) + num);
		return calendar.getTime();
	}
	public static Date getNextMin(Date date, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(getYear(date),
				getMonth(date) - 1,
				getDay(date),
				getHour(date),
				getMinuteOfDate(date) + num,
				getSecondOfDate(date));
		return calendar.getTime();
	}
	public static Date getNextHour(Date date, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(getYear(date),
				getMonth(date) - 1,
				getDay(date),
				getHour(date) + num,
				getMinuteOfDate(date),
				getSecondOfDate(date));
		return calendar.getTime();
	}
	public static List<String> makeMonths(String start_date, String end_date) {
		List<String> months = new LinkedList<String>();
		String start_year = start_date.substring(0, 4);
		String end_year = end_date.substring(0, 4);
		String start_month = start_date.substring(5,7);
		String end_month = end_date.substring(5, 7);
		int sy = Integer.parseInt(start_year);
		int ey = Integer.parseInt(end_year);
		int sm = Integer.parseInt(start_month);
		int em = Integer.parseInt(end_month);
		for (int i = 0; i <= ey - sy; i++) {
			int y = sy + i;
			if (sy == ey) {
				for (int j = 0; j <= em-sm; j++) {
					months.add(y + "-" + buling(sm + j));
				}
			} else {
				if (i == 0) {
					for (int j = 0; j <= 12-sm; j++) {
						months.add(y + "-" + buling(sm + j));
					}
				} else if (i == ey - sy) {
					for (int j = 0; j <= em - 1; j++) {
						months.add(y + "-" + buling(1 + j));
					}
				} else {
					for (int j = 1; j <= 12; j++) {
						months.add(y + "-" + buling(j));
					}
				}
			}
			
		}
		return months;
	}
//	public static void main(String[] args) {
//		System.out.println("-----------------------------------------");
//		List<String> months1 = makeMonths("2015-05-01", "2015-08-31");
//		for (String month : months1) {
//			System.out.println(month);
//		}
//		System.out.println("-----------------------------------------");
//		List<String> months2 = makeMonths("2014-01-01", "2015-09-31");
//		for (String month : months2) {
//			System.out.println(month);
//		}
//		System.out.println("-----------------------------------------");
//		List<String> months3 = makeMonths("2013-01-01", "2015-12-31");
//		for (String month : months3) {
//			System.out.println(month);
//		}
//		System.out.println("-----------------------------------------");
//		List<String> months4 = makeMonths("2013-12-01", "2015-03-31");
//		for (String month : months4) {
//			System.out.println(month);
//		}
//		System.out.println("-----------------------------------------");
//		List<String> months5 = makeMonths("2014-08-01", "2015-03-31");
//		for (String month : months5) {
//			System.out.println(month);
//		}
//		System.out.println("-----------------------------------------");
//	}
	public static String buling(int num) {
		if (num >= 10) {
			return "" + num;
		} else {
			return "0" + num;
		}
		
	}
}
