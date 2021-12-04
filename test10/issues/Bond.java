package issues;

public class Bond{
    private String code;
    private String name;
    private Integer maturity;
    private Double coupon;

    public enum BondType{
        COUPON_BOND,
        ZERO_COUPON_BOND
    }

    public Bond(String code, String name, Integer maturity, Double coupon){
        if(code == null){
            throw new IllegalArgumentException();
        }else{
            this.code = code;
        }

        if(name == null){
            throw new IllegalArgumentException();
        }else{
            this.name = name;
        }
        if(20000101 > maturity){
            throw new IllegalArgumentException();
        } else if(29991231 < maturity){
            throw new IllegalArgumentException();
        } else {
            this.maturity = maturity;
        }

        if(coupon >= 0){
            this.coupon = coupon;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public int getMaturity(){
        return this.maturity;
    }

    public double getCoupon(){
        return this.coupon;
    }

    public BondType getBondType(){
        if(coupon != 0){
            return BondType.COUPON_BOND;
        }else{
            return BondType.ZERO_COUPON_BOND;
        }
    }

    @Override
    public String toString(){
        return "コード：" + code + ", 名称：" + name + ", 償還年月日：" + Integer.toString(maturity) + ", クーポンレート：" + String.valueOf(coupon);
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		long temp;
		temp = Double.doubleToLongBits(coupon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + maturity;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Bond other = (Bond) obj;
		if (code != other.code){
            return false;
        }

		if (coupon != other.coupon) {
			return false;
		}
		if (maturity != other.maturity) {
			return false;
        }

        if (name != other.name){
            return false;
        }
		return true;
	}
}