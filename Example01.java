package th;

//Threadʵ�ֶ��߳�
//����һ���̳�Thread�߳������
class myThread1 extends Thread{
	//�������߳����вι��췽��
	public myThread1(String name) {
		super(name);
	}
	
	//����Thread���run()����
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()������������");
		}
	}
}
public class Example01 {
	public static void main(String[] args) {
		//����myTheard1��ʵ��������
		myThread1 thread1=new myThread1("Thread1");
		//����start()���������߳�
		thread1.start();
		//������������һ���߳�myThread02
		myThread1 thread2=new myThread1("Thread2");
		thread2.start();
	}
}
