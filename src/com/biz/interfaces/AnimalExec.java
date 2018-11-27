package com.biz.interfaces;

public class AnimalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZooKeper zooKeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionImp = new Lion();
		
		// ZooKeper�� �ִ� food(Lion lion) �޼��带 ȣ��
		zooKeper.food(lion);
		
		// ZooKeper���ִ� food(Tiger tiger) �޼��� ȣ��
		zooKeper.food(tiger);
		
		zooKeper.add(3, 4); //������ ���� �ΰ�
		zooKeper.add(3f, 4f); //�Ǽ��� �Ǽ� �ΰ�
	}

}
