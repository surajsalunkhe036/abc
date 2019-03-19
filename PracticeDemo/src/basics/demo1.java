package basics;

class Test {
	protected int x, y;
}

class demo1 {
	public static void main(String args[]) {
		Test t = new Test();
		System.out.println(t.x + " " + t.y);
	}
}
