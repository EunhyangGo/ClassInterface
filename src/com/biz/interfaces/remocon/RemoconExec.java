package com.biz.interfaces.remocon;

/*
 * ������Ʈ ���ü�
 * 1. TvRCom Ŭ������ tvRCom ��ü�� �����϶�
 * 2. tvRCom ��ü�� �ִ� volUp(), volDown(), chUp(), chDown(), power()
 *    �޼��带 ����ؼ� ������ �ڵ带 ����
 *    
 */
public class RemoconExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TvRCom tvRCom = new TvRCom();
		
		tvRCom.volUp();
		tvRCom.volDown();
		tvRCom.chUp();
		tvRCom.chDown();
		tvRCom.power();
	}

}
