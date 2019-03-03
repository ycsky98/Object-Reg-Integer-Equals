package day02;

public class EqualsDemo01 {
	
	/**
	 * 1、默认的equals不能比较对象中数据是否相等
	 * 建议子类重写这个方法
	 * 2、重写的时候,按照关键数据比较两个对象是否相等
	 * */
	public static void main(String[] args) {
		Cell p1 = new Cell(90, 100);
		Cell p2 = new Cell(90, 100);
		Cell p3 = null;
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1==p2);
	}
}

class Cell{
	private int row,col;
	public Cell(int row, int col){
		this.col = col;
		this.row = row;
	}
	/*
	 * 重写equals方法(修改父类方法)
	 * */
	
	public boolean equals(Object obj){
		/*
		 * 方法执行期间this是当前对象
		 * obj是引用对象
		 * 比较关键数据:就是比较this.(row,col)
		 * 和obj(row,col)是否相等
		 * */
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;//性能好
		}
		if (obj instanceof Cell) {
			Cell bb = (Cell)obj;
			return this.row == bb.row &&
					this.col == bb.col;
		}
		return false;
	}
}