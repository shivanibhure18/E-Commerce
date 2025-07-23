package UserInformation;

public class ProductInfo {
	
	private int productId;
	private String productName;
	private String productInfo;
	private float productRate;
	private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public float getProductRate() {
		return productRate;
	}
	public void setProductRate(float productRate) {
		this.productRate = productRate;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
	    return "[" + productId + ", " + productName + ", " + productInfo + ", " + productRate + ", " + productPrice + "]";
	}
	public ProductInfo(int productId, String productName, String productInfo, float productRate, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productInfo = productInfo;
		this.productRate = productRate;
		this.productPrice = productPrice;
	}
	

}
