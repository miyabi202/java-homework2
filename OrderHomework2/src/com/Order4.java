package com;

import java.io.Serializable;

public class Order4 implements Serializable {
		private String Oname;
		private String Pname;
		private Integer CanQ;
		private Integer DailyQ;
		private Integer ToyQ;
	    private boolean member;// 是會員的核取框
		private Integer sum;
		// public boolean isMember;// 是會員的核取框

		// 確保 isMember 正確初始化
		

		public Order4(String oname, String pname, Integer canQ, Integer dailyQ, Integer toyQ, boolean member) {
			super();
			Oname = oname;
			Pname = pname;
			CanQ = canQ;
			DailyQ = dailyQ;
			ToyQ = toyQ;
			this.member = member;
			
		}
			
			// 新增計算 sum 的方法
		
		public Integer getSum() {
			
			System.out.println("Member status: " + member);
			System.out.println("Sum before discount: " + sum);


		sum=(int) (CanQ * 150 + DailyQ * 880  + ToyQ* 250) ; 					
		
		//this.isMember = isMember;
		if (member) {
	        // 如果是會員，先打 0.95 折扣
	        this.sum = (int) (CanQ * 150 * 0.95 + DailyQ * 880 * 0.95 + ToyQ* 250 * 0.95);

		}// 判斷是否超過 2000，如果超過再打 0.95 折扣
	 if (this.sum > 2000) {
		        this.sum = (int) (this.sum * 0.95);}
	return sum;


			    }
			
		
	    		
	    		
	    		
	    		
	    		
	    


		/*public void show() {
			sum = this.getSum();
		}*/

		public String getOname() {
			return Oname;
		}

		public void setOname(String oname) {
			Oname = oname;
		}

		public String getPname() {
			return Pname;
		}

		public void setPname(String pname) {
			Pname = pname;
		}

		public Integer getCanQ() {
			return CanQ;
		}

		public void setCanQ(Integer canQ) {
			CanQ = canQ;
		}

		public Integer getDailyQ() {
			return DailyQ;
		}

		public void setDailyQ(Integer dailyQ) {
			DailyQ = dailyQ;
		}

		public Integer getToyQ() {
			return ToyQ;
		}

		public void setToyQ(Integer toyQ) {
			ToyQ = toyQ;
		}

	}


