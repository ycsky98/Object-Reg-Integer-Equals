package day02;

public class RegDemo07 {
	
	/**
	 * String.matches()规则检查
	 * String.split()切片
	 * String.replaceAll()全局替换
	 * 
	 * 用户表单数据检查
	 * 字符串规则检查
	 * 
	 * 技巧:
	 * 可以利用开发工具的正则搜索功能检查表达式的正确性
	 * 
	 * */
	public static void main(String[] args) {
		String reg1 = "^\\w{8,10}$";
		String reg2 = "\\w{8,10}";
		
		String str = "Hello_World";
		/*
		 * matches方法进行整体匹配检查,相当于包含^$边界检查
		 * 造成如上正则检查结果相同!这个不是正则表达式的问题
		 * 是java matches方法的现象
		 * */
		
		System.out.println(str.matches(reg1));
		System.out.println(str.matches(reg2));
		
		
		String str1 = "Tom,119,tom@tedu.cn,北京";
		String[] kk = str1.split(",");
		System.out.println(kk[2]);
		//切割字符
		String ip = "192.168.1.100";
		String[] ipString = ip.split("\\.\\s*");
		for (int i = 0; i < ipString.length; i++) {
			System.out.println(ipString[i]);
		}
		
		//利用replaceAll(String,String)
		//替换字符串
		//字符串 = 原字符串.replaceAll(替换的字符,修改后的字符)
		String ji = "傻逼";
		String ko = "你个傻逼";
		String no = ko.replaceAll(ji, "xx");
		System.out.println(no);
	}
}
