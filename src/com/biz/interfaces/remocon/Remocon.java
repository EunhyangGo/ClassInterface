package com.biz.interfaces.remocon;
/*
 * �������̽��� �ι�° ����
 * ���������� ������ ������Ʈ�� �����Ҷ� Ŭ���� ����� ���õ� ������ ����������,
 * Ŭ������ �ۼ��ϴ� �������� �Ϻ� method�� ������Ű�� ��찡 ����.
 * 
 * method�� �����Ǹ�, �� ������ �ۼ��� ����(*.java)�� �����Ͽ� �׽�Ʈ�� �ϴ� �������� 
 * ������ method������ ������ �߻��Ѵ�.
 * 
 * �̶� ������Ʈ�� ���۵Ǵ� �ܰ迡�� �ڵ�� ����, �̸��� �ִ� �޼������ 
 * interface�� ������ �ΰ� ���õ� Ŭ������ ���鶧 �� interface�� implements �ϸ�
 * �ڵ����� �� �ʿ��� method���� ������ �ۼ��ϵ��� �� �� �ִ�.
 * 
 * interface = Ŭ���� ���� ���赵
 */
public interface Remocon {

	public void volUp();
	public void volDown();
	public void chUp();
	public void chDown();
	public void power();
}
