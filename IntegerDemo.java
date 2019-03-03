package day02;

public class IntegerDemo {
	
	public static void main(String[] args) {
		/**
		 * 包装类:
		 * 用于将基本类型包装为对象
		 * Number 是 Integer 的父类型
		 * 
		 * Number 定义了6种数值类型相互转换的方法
		 * */
		Number n = new Integer(5);
		System.out.println(n.doubleValue());
		
		Double x = new Double(4.5);
		int h = x.intValue();
		System.out.println(h);
		
		int pp = 2;
		for (int i = 1; i < 10; i++) {
			pp = pp * 2;
		}
		System.out.println(pp);
	}
}
