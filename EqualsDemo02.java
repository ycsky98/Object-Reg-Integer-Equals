package day02;

public class EqualsDemo02 {
	public static void main(String[] args) {
		/*
		 * String 重写类equals方法用于比较两个
		 * 字符串对象是否相等
		 * 对象不能用双等号比较
		 * 只有对和错
		 * ==比较变量的值,引用变量的值是地址
		 * 所以equals用于比较对象的内存地址
		 * Object 的equals方法就是用==比较的,
		 * 建议子类重写为可靠的方法
		 * 
		 * Java提供的API几乎都重写了equals方法
		 * 包括:String Integer Date
		 * */
		String h1 = new String("123");
		String h2 = new String("123");
		String h3 = new String("456");
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
	}
}