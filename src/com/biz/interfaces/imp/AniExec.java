package com.biz.interfaces.imp;

public class AniExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dog�ڽ����� �ڽ��� ����
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bunny bunny = new Bunny();

		view(dog); // ��������� ���// Animal�̶� ���
		view(cat); // �߿��̶�� ���// Animal�̶� ���
		view(bunny); //Animal�̶�� ���
	}
	
	public static void view(Animal a) {
		//view�� ȣ���Ҷ� � type�� ������ �����ߴ°� �˾ƺ��� �ڵ� 
		if(a instanceof Dog) {
			System.out.println("������"); //���� dog�� �ҷ����� �������� ���
		}else if(a instanceof Cat) {
			System.out.println("�߿���");
		}else if(a instanceof Bunny) {
			System.out.println("�������� �䳢");
		}else {
		System.out.println("Animal");
	}
/*
	public static void view(Dog dog) {
		System.out.println("������");
}
	public static void view(Cat cat) {
		System.out.println("�߿���");
	}
	
*/
}
}