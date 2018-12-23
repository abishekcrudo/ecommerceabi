package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="ProductDetails")
public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProductID")
	private int pId;
	@Column(name="ProductCost")
	private int pCost;
	@Column(name="ProductName")
	private String pName;
	public Product()
	{
		
	}
	public Product(String pName, int pCost) 
	{
		this.pCost = pCost;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}
