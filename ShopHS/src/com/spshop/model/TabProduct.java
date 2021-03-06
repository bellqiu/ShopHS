package com.spshop.model;

import java.util.ArrayList;
import java.util.List;

public class TabProduct extends Component{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2574127222646178290L;
	private List<Product> products = new ArrayList<Product>();
	
	public TabProduct() {
		// TODO Auto-generated constructor stub
	}
	public TabProduct(TabProduct product) {
		super(product);
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * @autogenerated by CodeHaggis (http://sourceforge.net/projects/haggis)
	 * clone
	 * @return Object
	 */
	public TabProduct clone() {
		TabProduct obj = null;
		obj = new TabProduct(this);
		if (this.products != null) {
			/* Does not have a clone() method */
			obj.products = new ArrayList<Product>();
			for (Product p : this.products) {
				obj.products.add(p.clone());
			}
		}
		return obj;
	}

}
