package page4;
interface dlsxm{
	int plus1(int a,int b,int c);
}
interface ejqmf{
	double plustlf(double a,double b,double c);
}
class A implements dlsxm{
	public int plus1(int a,int b,int c) {
		return a+b+c;
	}}
class B implements ejqmf{
	public double plustlf(double a,double b,double c) {
	
	return a+b+c;}
	}




public class pr111 {


	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		System.out.println(a.plus1(1, 2, 3));
		System.out.println(b.plustlf(1.1, 2.2, 3.3));
		
	}}
	


	

