package th;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//创建一个Callable接口的实现类
class MyThread3 implements Callable<Object>{
	//重写call()方法
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call()方法正在执行");
		}
		return i;
	}
}

public class Example03 {
	public static void main(String[] args)throws InterruptedException,ExecutionException {
		//创建Callable接口的实现类对象
		MyThread3 myThread3=new MyThread3();
		//使用FutureTask线程结果处理类的有参构造方法来封装Callable接口
		FutureTask<Object>ft1=new FutureTask<>(myThread3);
		//使用Thread(Runnable target,String name)构造方法创建线程对象
		Thread thread1=new Thread(ft1,"Thread1");
		//调用线程实例的start()方法启动线程
		thread1.start();
		//创建并启动另一个线程
		FutureTask<Object> ft2=new FutureTask<>(myThread3);
		Thread thread2=new Thread(ft2,"Thread2");
		thread2.start();
		//通过FutureTask对象的方法管理返回值
		System.out.println("thread1返回的结果为："+ft1.get());
		System.out.println("thread1返回的结果为："+ft2.get());
	}
}
