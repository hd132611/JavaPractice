package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ Car
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 * @author ���ؼ�
 *
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	public void setCompany(String newCompany){
		company = newCompany;
	}
	public String getCompany(){
		return company;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public String getModel(){
		return model;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public String getColor(){
		return color;
	}
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public void setPrice(int newPrice){
		price = newPrice;
	}
	public int getPrice(){
		return price;
	}
}
