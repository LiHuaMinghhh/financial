package com.neuq.bean;

public class Paging2 {
	
	//����
	private int totalRow2;//���ݿ���һ���ж�����
	

	private int showNum2;//ÿҳ��ʾ������
	private int totalPage2;//һ���ж���ҳ
	private int reqPage2;//��ǰ�����ҳ
	private int start2;//ÿҳ��ʼ��λ��
	private int end2;//ÿҳ������λ��
	private int next2;//��һҳ
	private int previous2;//��һҳ
	
	public Paging2()
	{
		
	}
	
	public Paging2(int totalRow2,int showNum2)
	{
		this.totalRow2=totalRow2;
		this.showNum2=showNum2;
		if(this.totalRow2%this.showNum2==0)
		  this.totalPage2=this.totalRow2/this.showNum2;
		else
		  this.totalPage2=this.totalRow2/this.showNum2+1;
	}
	
	//���з�ҳ
	public void doPaging2(int reqP2)  //reqp�Ǵ�������ֵ
	{
	  this.reqPage2=reqP2;
	  this.start2=(this.reqPage2-1)*this.showNum2+1;
	  this.end2=this.start2*this.showNum2;
	}
	
	
	public int getTotalRow2() {
		return totalRow2;
	}

	public int getShowNum2() {
		return showNum2;
	}

	public int getTotalPage2() {
		return totalPage2;
	}

	public int getReqPage2() {
		return reqPage2;
	}

	public int getStart2() {
		return start2;
	}

	public int getEnd2() {
		return end2;
	}

	//��ȡ��һҳ
	public int getNext2() {
		if(this.reqPage2==this.totalPage2)
			this.next2=this.totalPage2;
		else
			this.next2=this.reqPage2+1;
		return next2;
	}
    //��ȡ��һҳ
	public int getPrevious2() {
		if(this.reqPage2==1)
			this.previous2=1;
		else
			this.previous2=this.reqPage2-1;
		return previous2;
	}
	
	

}
