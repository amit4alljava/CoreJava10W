
public class StringBadWay {

	public static void main(String[] args) {
		String product = "mobile";
		String osType = "android";
		int screenSize = 5;
		StringBuffer sb = new StringBuffer("Hello");
		//String sql= "select *  from products ";
		StringBuffer sql = new StringBuffer("select * from products");
		if(product!=null){
			sql.append("where productType").append(product);
			//sql = sql + " where productType="+product;
		}
		if(osType!=null){
			sql.append("and osType =").append(osType);
			//sql = sql+" and osType = "+osType;
		}
		if(screenSize!=0){
			sql.append(" and screen=").append(screenSize);
			//sql = sql+" and screen="+screenSize;
		}

	}

}
