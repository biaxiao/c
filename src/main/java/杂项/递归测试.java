package 杂项;

public class 递归测试 {
	public static void main(String[] args) {
		System.out.println(factory1(10,1));
	}
	
	static int factory(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factory(n-1);
		}
	}
	static int factory1(int n, int result) {
		if(n==1) {
			return result;
		}else {
			return factory1(n-1,n*result);
		}
	}
}