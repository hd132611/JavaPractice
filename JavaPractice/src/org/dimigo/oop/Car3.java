package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ Car2
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 * @author ���ؼ�
 *
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed){
		this(company,model,color,maxSpeed,0);
	}
	public Car3(String company, String model, String color){
		this(company,model,color,0,0);
	}
	
//	public void setCompany(String newCompany){
//		company = newCompany;
//	}
	public String getCompany(){
		return company;
	}
//	public void setModel(String newModel){
//		model = newModel;
//	}
	public String getModel(){
		return model;
	}
//	public void setColor(String newColor){
//		color = newColor;
//	}
	public String getColor(){
		return color;
	}
//	public void setMaxSpeed(int newMaxSpeed){
//		maxSpeed = newMaxSpeed;
//	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
//	public void setPrice(int newPrice){
//		price = newPrice;
//	}
	public int getPrice(){
		return price;
	}
}
