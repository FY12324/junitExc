package th;

//Thread实现多线程
//定义一个继承Thread线程类的类
class myThread1 extends Thread{
	//创建子线程类有参构造方法
	public myThread1(String name) {
		super(name);
	}
	
	//重新Thread类的run()方法
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		}
	}
}
public class Example01 {
	public static void main(String[] args) {
		//创建myTheard1的实例化对象
		myThread1 thread1=new myThread1("Thread1");
		//调用start()方法启动线程
		thread1.start();
		//创建并启动另一个线程myThread02
		myThread1 thread2=new myThread1("Thread2");
		thread2.start();
	}
}
