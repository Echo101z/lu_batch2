
class Mobile{
	static String company="XYZ";
	String name;
	String plan;
	int number;
	int amount;
	
	Mobile(String name,int number,String plan,int amount){
		this.name=name;
		this.plan=plan;
		this.amount=amount;
		this.number=number;
		
	}
	
	
	public String getBill() {
		return company+" bill of \n "+this.name +" customer \n Number "+this.number+" is "+this.amount +" for "+this.plan;
	}
	
	
	
	
	
	
	
}