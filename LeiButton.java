package saolei;

public class LeiButton implements java.io.Serializable {
	int x=0,y=0;						//x�����꣬y������
	String name,lei,amount;				//name�Ƿ��ǣ�lei�Ƿ����ף�amount��Χ������
	public void setX(int x)  {
		this.x = x;
	}
	public void setY(int y) {			
		this.y = y;
	}
	public void setAmount(String amount) {			
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;			//δɨflag0�����flag1����ɨflag2
	}
	public void setLei(String lei) {
		this.lei = lei;			//����lei1������lei0
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public String getAmount(){
		return amount;
	}
	public String getName(){
		return name;
	}
	public String getLei(){
		return lei;
	}
}
