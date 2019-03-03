package day02;

public class IntegerDemo02 {
	
	public static void main(String[] args) {
		/**
		 * 包装类提供了String(10进制)到基本类型的转换
		 * int Integer.parsrDouble(10进制字符串)
		 * double Integer.parsrDouble(10进制字符串)
		 * */
		int n = Integer.parseInt("90");
		double m = Double.parseDouble("3.14159265358979");
		System.out.println(n);
		System.out.println(m);
	}
}
