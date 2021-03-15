import java.util.*;



public class ListDemo {

	public static void main(String[] args) {
		 List<MyData> data=new ArrayList<>();
	       data.add(new MyData(2));
	       data.add(new MyData(1));
	       data.add(new MyData(3));
	       int i=data.indexOf(new MyData(3));
	       System.out.println(i);
		}

	}

	class MyData{
		int value;
		public MyData(int v) {
			value=v;
		}
		public String toString() {
			return "value="+value;
		}
		@Override
		public boolean equals(Object obj) {
			MyData x=(MyData)obj;
			return this.value==x.value;
		}
	}