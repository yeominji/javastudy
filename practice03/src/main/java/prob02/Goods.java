package prob02;

public class Goods {

	private String goodsName;
	private int price;
	private int count;

	public Goods() {
		
	}
	
	public Goods(String goodsName, int price, int count) {
		this.goodsName = goodsName;
		this.price = price;
		this.count = count;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}