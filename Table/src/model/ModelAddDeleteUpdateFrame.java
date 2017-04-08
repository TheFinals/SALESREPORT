package model;

import java.sql.Date;

public class ModelAddDeleteUpdateFrame 
{
	static String categoryField;
	static String productNameField;
	static String costField;
	static String quantityField;
	static Date date;
	
	
	public static Date getDate() {
		return date;
	}
	public static void setDate(Date date) {
		ModelAddDeleteUpdateFrame.date = date;
	}
	public static String getCategoryField() {
		return categoryField;
	}
	public static void setCategoryField(String categoryField) {
		ModelAddDeleteUpdateFrame.categoryField = categoryField;
	}
	public static String getProductNameField() {
		return productNameField;
	}
	public static void setProductNameField(String productNameField) {
		ModelAddDeleteUpdateFrame.productNameField = productNameField;
	}
	public static String getCostField() {
		return costField;
	}
	public static void setCostField(String costField) {
		ModelAddDeleteUpdateFrame.costField = costField;
	}
	public static String getQuantityField() {
		return quantityField;
	}
	public static void setQuantityField(String quantityField) {
		ModelAddDeleteUpdateFrame.quantityField = quantityField;
	}
	
}
