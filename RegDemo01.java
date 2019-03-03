package day02;

public class RegDemo01 {
	public static void main(String[] args) {
		String reg = "s\\d.";
		/**
		 * java String API方法 matchs(String)
		 * 用于检查是否包含该字符串
		 * */
		boolean b = "s5o".matches(reg);
		System.out.println(b);
		
		String reg1 = "s..";
		b = "so6".matches(reg1);
		System.out.println(b);
		
		String reg2 = "s\\w";
		b = "sp".matches(reg2);
		System.out.println(b);
		
		String reg3 = "s\\s";
		b = "s\n".matches(reg3);
		System.out.println(b);
	}
}
