package com.neuq.bean;

public class Paging {        //ҳ����   
	//����
		private int totalRow;//���ݿ���һ���ж����� 
		//private int totalRow1;
		private int showNum;//ÿҳ��ʾ������ 
		//private int showNum1;
		private int totalPage;//һ���ж���ҳ
		//private int totalPage1;
		private int reqPage;//��ǰ�����ҳ 
		//private int reqPage1;
		private int start;//ÿҳ��ʼ��λ��
		//private int start1;
		private int end;//ÿҳ������λ��
		//private int end1;
		private int next;//��һҳ
		//private int next1;
		private int previous;//��һҳ
		//private int previous1;
		
		public Paging(){
			
		}
		
		public Paging(int totalRow,int showNum){   //������ҳ��
			this.totalRow=totalRow;
			this.showNum=showNum;
			if(this.totalRow%this.showNum==0)
				this.totalPage=this.totalRow/this.showNum;
			else
				this.totalPage=this.totalRow/this.showNum+1;
		}
		
		//���з�ҳ
		public void doPaging(int reqP){        //dopaging���� ����start��end��ֵ
			this.reqPage=reqP;
			this.start=(this.reqPage-1)*this.showNum+1;
			this.end=this.reqPage*this.showNum;
		}
		     
		
		/**
				public void doPaging1(int reqP){
					this.reqPage=reqP;
					this.start1=(this.reqPage-1)*this.showNum+1;
					this.end1=this.reqPage*this.showNum;
				}
				*/
		

		public int getTotalRow() {
			return totalRow;
		}

		public int getShowNum() {
			return showNum;
		}

		public int getTotalPage() {
			return totalPage;
		}

		public int getReqPage() {
			return reqPage;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}
		
		/**
		public int getStart1() {
			return start1;
		}

		public int getEnd1() {
			return end1;
		}
		*/

		//��ȡ��һҳ
		public int getNext() {
			if(this.reqPage==this.totalPage)
				this.next=this.totalPage;
			else
				this.next=this.reqPage+1;
			return next;
		}

		//��ȡ��һҳ
		public int getPrevious() {
			if(this.reqPage==1)
				this.previous=1;
			else
				this.previous=this.reqPage-1;
			return previous;
		}
		
		

	}

