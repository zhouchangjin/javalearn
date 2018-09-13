package javalearn.trycatch;

public class TryCatcheLearn {
	
	
	public static int ReturnInCatch(int a) {
		int res=0;
		try {
			res=2/a;
			res++;
		}catch(Exception e) {
			return 0;
		}
		res--;
		return res;
	}
	

	public static int CatchOnly(int a) {
		int res=0;
		try {
			res=2/a;
			res++;
		}catch(Exception e) {
		}
		res--;
		return res;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReturnInCatch(0));
		System.out.println(CatchOnly(0));
	}

}
