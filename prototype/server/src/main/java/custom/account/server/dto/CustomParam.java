package custom.account.server.dto;

public class CustomParam {

	private String busiNum;
	private String customName;
	
	public CustomParam() {
		
	}
	
	public CustomParam(String busiNum, String customName) {
		super();
		this.busiNum = busiNum;
		this.customName = customName;
	}

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	@Override
	public String toString() {
		return "CustomParam [busiNum=" + busiNum + ", customName=" + customName + "]";
	}
}
