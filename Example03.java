package th;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//����һ��Callable�ӿڵ�ʵ����
class MyThread3 implements Callable<Object>{
	//��дcall()����
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��call()��������ִ��");
		}
		return i;
	}
}

public class Example03 {
	public static void main(String[] args)throws InterruptedException,ExecutionException {
		//����Callable�ӿڵ�ʵ�������
		MyThread3 myThread3=new MyThread3();
		//ʹ��FutureTask�߳̽����������вι��췽������װCallable�ӿ�
		FutureTask<Object>ft1=new FutureTask<>(myThread3);
		//ʹ��Thread(Runnable target,String name)���췽�������̶߳���
		Thread thread1=new Thread(ft1,"Thread1");
		//�����߳�ʵ����start()���������߳�
		thread1.start();
		//������������һ���߳�
		FutureTask<Object> ft2=new FutureTask<>(myThread3);
		Thread thread2=new Thread(ft2,"Thread2");
		thread2.start();
		//ͨ��FutureTask����ķ���������ֵ
		System.out.println("thread1���صĽ��Ϊ��"+ft1.get());
		System.out.println("thread1���صĽ��Ϊ��"+ft2.get());
	}
}
