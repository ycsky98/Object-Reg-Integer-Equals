package day02;

public class RegDemo04 {
	public static void main(String[] args) {
		/**
		 * 正则匹配特殊字符串,需要利用\进行转意
		 * 如:
		 * 匹配字符[采用:\[
		 * 案例:检测一个字符串是否是整数数组类型
		 * 
		 * 特殊字符包括: [] \ | () . ? * +
		 * 
		 * 分组 \\.(序列1|序列2|序列3|序列4)多选
		 * 
		 * \b边界
		 * */
		
		String reg = "int\\[\\s*\\]";
		System.out.println(reg);
		boolean b = "int[]".matches(reg);
		System.out.println(b);
		b = "double[]".matches(reg);
		System.out.println(b);
		
		String oo = "\\w+\\.(jpg|png|jar)";
		System.out.println("asd.jpg".matches(oo));
		System.out.println("asd.jar".matches(oo));
		System.out.println("asd.png".matches(oo));
		System.out.println("asd.jpeg".matches(oo));
		
		String op = "\\.\\d";
		System.out.println(".1".matches(op));
		
		String qq = "[^0]\\w{8,10}\\@qq.com";
		System.out.println("190051890@qq.com".matches(qq));
		
		String pp = "(0086|\\+86)?\\s*?1\\d{10}\\b";
		System.out.println("18882828211".matches(pp));
	}
}
