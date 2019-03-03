package day02;

public class ObjectDemo02 {
	/**
	 * java提供的API几乎都重写了toString()
	 * 包括String StringBuilder Date Integer......
	 * */
	public static void main(String[] args) {
		/**
		 * 调用toString方法
		 * */
		Integer m = new Integer(13);
		Integer l = new Integer(13);
		if (m.equals(l)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		Point jj = new Point(9, 8);
		Point jj1 = new Point(9, 8);
		Point jj2 = new Point(9, 8);
		Point jj3 = new Point(9, 8);
		Point jj4 = new Point(9, 8);
		Point jj5 = new Point(9, 8);
		/*
		 * 调用重写的toString方法
		 */
		System.out.println(jj1);
		System.out.println(jj.toString());
		/*
		 * toString方法的用途:java的API会自动调用
		 * toString方法,利用这个特点可以简化
		 * 程序的调试输出.如:println(p)
		 * 自动调用toString
		 * 重写toString很方便
		 * */
	}
}

//平面坐标系中的一个点
/**
 * 重写toString方法,返回Point的关键数据(x,y)
 * */
class Point{
	int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return x + "," + y;
	}
}