package day02;

public class RegDemo02 {
	public static void main(String[] args) {
		/**
		 * 正则表达式数量词
		 * {n}表示n个
		 * {n,}至少n个
		 * {n,m}至少n个,最多m个
		 * */
		
		String reg = "\\d{6}";
		boolean b = "100087".matches(reg);
		System.out.println(b);
		
		reg = "\\d{7,10}";
		b = "1000879213".matches(reg);
		System.out.println(b);
		
		reg = "^[\\d|\\w]{7,}";
		b = "1000879".matches(reg);
		System.out.println(b);
		
		/**
		 * 简化数词
		 * ?等价{0,1} //没有s或者有一个s
		 * *等价{0,} //没有s或者有多个s
		 * +等价{1,} //至少有一个s，或者多个s
		 * */
		
		String reg1 = "s?";
		boolean jj = "s".matches(reg1);
		System.out.println(jj);
		jj = "ss".matches(reg1);
		System.out.println(jj);
		
		reg1 = "s*";
		boolean bb = "s".matches(reg1);
		System.out.println(bb);
	}
}
