package th;
//Runnable�ӿ�ʵ�ֶ��߳�

//����һ��ʵ��Runnable�ӿڵ�ʵ����
class MyThread2 implements Runnable {
	//��дrunnable��run()����
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"��run()����������");
		}
	}
}

public class Example02 {
	public static void main(String[] args) {
		//����Runnable�ӿ�ʵ�����ʵ������
		MyThread2 myThread2=new MyThread2();
		//ʹ��Thread�вι��췽�������߳�ʵ��,����Runnable�ӿ�ʵ�����ʵ��������Ϊ��������
		Thread thread1=new Thread(myThread2,"Thread1");
		//�����̵߳�start���������߳�
		thread1.start();
		//������������һ���߳�
		Thread thread2=new Thread(myThread2,"Thread2");
		thread2.start();
	}
}

