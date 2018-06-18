package _19.jpql;

public class ProductDetails {

	private String productName;

	private double unitPrice;

	private int available;

	private String brandName;

	private String categoryName;

	public ProductDetails(String productName, double unitPrice, int available, String brandName, String categoryName) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.available = available;
		this.brandName = brandName;
		this.categoryName = categoryName;
	}

	public ProductDetails() {
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductDetails [productName=" + productName + ", unitPrice=" + unitPrice + ", available=" + available
				+ ", brandName=" + brandName + ", categoryName=" + categoryName + "]";
	}

}
