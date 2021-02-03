package taewoo;

public class OrderDTO {
	
	
	private String ame;
	private String latte;
	private String dutch;
	private String mocha;
	private String mojito;
	private String orange;
	private String mango;
	private String strawberry;
	
	public OrderDTO() {}
	
	public OrderDTO(String ame, String latte, String dutch, String mocha, String mojito, String orange, String mango,
			String strawberry) {
		super();
		this.ame = ame;
		this.latte = latte;
		this.dutch = dutch;
		this.mocha = mocha;
		this.mojito = mojito;
		this.orange = orange;
		this.mango = mango;
		this.strawberry = strawberry;
	}
	
	@Override
	public String toString() {
		return "OrderDTO [ame=" + ame + ", latte=" + latte + ", dutch=" + dutch + ", mocha=" + mocha + ", mojito="
				+ mojito + ", orange=" + orange + ", mango=" + mango + ", strawberry=" + strawberry + "]";
	}
	
	
	public String getAme() {
		return ame;
	}
	public void setAme(String ame) {
		this.ame = ame;
	}
	public String getLatte() {
		return latte;
	}
	public void setLatte(String latte) {
		this.latte = latte;
	}
	public String getDutch() {
		return dutch;
	}
	public void setDutch(String dutch) {
		this.dutch = dutch;
	}
	public String getMocha() {
		return mocha;
	}
	public void setMocha(String mocha) {
		this.mocha = mocha;
	}
	public String getMojito() {
		return mojito;
	}
	public void setMojito(String mojito) {
		this.mojito = mojito;
	}
	public String getOrange() {
		return orange;
	}
	public void setOrange(String orange) {
		this.orange = orange;
	}
	public String getMango() {
		return mango;
	}
	public void setMango(String mango) {
		this.mango = mango;
	}
	public String getStrawberry() {
		return strawberry;
	}
	public void setStrawberry(String strawberry) {
		this.strawberry = strawberry;
	}
	

	
	




}
