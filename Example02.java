package th;
//Runnable接口实现多线程

//定义一个实现Runnable接口的实现类
class MyThread2 implements Runnable {
	//重写runnable的run()方法
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}

public class Example02 {
	public static void main(String[] args) {
		//创建Runnable接口实现类的实例对象
		MyThread2 myThread2=new MyThread2();
		//使用Thread有参构造方法创建线程实例,并将Runnable接口实现类的实例对象作为参数传入
		Thread thread1=new Thread(myThread2,"Thread1");
		//调用线程的start方法启动线程
		thread1.start();
		//创建并启动另一个线程
		Thread thread2=new Thread(myThread2,"Thread2");
		thread2.start();
	}
}

