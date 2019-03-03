package day02;

public class ObjectDemo01 {
	
	/**
	 * Object的toString方法在子类中重写
	 * 父类返回散列值
	 * 子类一般返回关键数据
	 * */
	public static void main(String[] args) {
		Object jj = new ObjectDemo01();
		Foo nn = new Foo();
		String jk = nn.toString();
		System.out.println(jk);
		//ObjectDemo01 hu = (ObjectDemo01)jj;
	}
}
class Foo{
	public String toString(){
		return "123";
	}
}