package custom.account.server.dto;

/*
CREATE TABLE CUSTOM(
	BUSI_NUM CHAR(20) PRIMARY KEY NOT NULL,
	CUSTOM CHAR(20) NOT NULL,
	SHORT CHAR(20),
	CEO CHAR(10),
	CHARGE_PERSON CHAR(10),
	BUSI_CONDITION CHAR(10),
	ITEM CHAR(10),
	POST_NUM CHAR(10),
	ADDR1 VARCHAR2(80),
	ADDR2 VARCHAR2(80),
	TEL CHAR(10),
	FAX CHAR(10),
	HOMEPAGE CHAR(20),
	CO_YN CHAR(1),
	FOREIGN_YN CHAR(1),
	TAX_YN CHAR(1),
	COUNTRY_ENG CHAR(20),
	COUNTRY_KOR CHAR(20),
	SPECIAL_RELATION CHAR(1),
	TRADE_STOP CHAR(1),
	CONTRACT_PERIOD_S DATE,
	CONTRACT_PERIOD_E DATE,
	REGI_INFO_MAN CHAR(10),
	REGI_INFO_DATE DATE,
	MODI_INFO_MAN CHAR(10),
	MODI_INFO_DATE DATE
);
*/

public class CustomDto {
	private String busiNum;
	private String custom;
	private String Short;
	private String ceo;
	private String chargePerson;
	private String busiCondition;
	private String item;
	private String postNum;
	private String addr1;
	private String addr2;
	private String tel;
	private String fax;
	private String homepage;
	private String coYn;
	private String foreignYn;
	private String taxYn;
	private String countryEng;
	private String countryKor;
	private String specialRelation;
	private String tradeStop;
	private String contractPeriodS;
	private String contractPeriodE;
	private String regiInfoMan;
	private String regiInfoDate;
	private String modiInfoMan;
	private String modiInfoDate;
	
	public CustomDto() {
		
	}

	public CustomDto(String busiNum, String custom, String s, String ceo, String chargePerson, String busiCondition,
			String item, String postNum, String addr1, String addr2, String tel, String fax, String homepage,
			String coYn, String foreignYn, String taxYn, String countryEng, String countryKor, String specialRelation,
			String tradeStop, String contractPeriodS, String contractPeriodE, String regiInfoMan, String regiInfoDate,
			String modiInfoMan, String modiInfoDate) {
		super();
		this.busiNum = busiNum;
		this.custom = custom;
		Short = s;
		this.ceo = ceo;
		this.chargePerson = chargePerson;
		this.busiCondition = busiCondition;
		this.item = item;
		this.postNum = postNum;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.coYn = coYn;
		this.foreignYn = foreignYn;
		this.taxYn = taxYn;
		this.countryEng = countryEng;
		this.countryKor = countryKor;
		this.specialRelation = specialRelation;
		this.tradeStop = tradeStop;
		this.contractPeriodS = contractPeriodS;
		this.contractPeriodE = contractPeriodE;
		this.regiInfoMan = regiInfoMan;
		this.regiInfoDate = regiInfoDate;
		this.modiInfoMan = modiInfoMan;
		this.modiInfoDate = modiInfoDate;
	}

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getShort() {
		return Short;
	}

	public void setShort(String s) {
		Short = s;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getChargePerson() {
		return chargePerson;
	}

	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}

	public String getBusiCondition() {
		return busiCondition;
	}

	public void setBusiCondition(String busiCondition) {
		this.busiCondition = busiCondition;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPostNum() {
		return postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getCoYn() {
		return coYn;
	}

	public void setCoYn(String coYn) {
		this.coYn = coYn;
	}

	public String getForeignYn() {
		return foreignYn;
	}

	public void setForeignYn(String foreignYn) {
		this.foreignYn = foreignYn;
	}

	public String getTaxYn() {
		return taxYn;
	}

	public void setTaxYn(String taxYn) {
		this.taxYn = taxYn;
	}

	public String getCountryEng() {
		return countryEng;
	}

	public void setCountryEng(String countryEng) {
		this.countryEng = countryEng;
	}

	public String getCountryKor() {
		return countryKor;
	}

	public void setCountryKor(String countryKor) {
		this.countryKor = countryKor;
	}

	public String getSpecialRelation() {
		return specialRelation;
	}

	public void setSpecialRelation(String specialRelation) {
		this.specialRelation = specialRelation;
	}

	public String getTradeStop() {
		return tradeStop;
	}

	public void setTradeStop(String tradeStop) {
		this.tradeStop = tradeStop;
	}

	public String getContractPeriodS() {
		return contractPeriodS;
	}

	public void setContractPeriodS(String contractPeriodS) {
		this.contractPeriodS = contractPeriodS;
	}

	public String getContractPeriodE() {
		return contractPeriodE;
	}

	public void setContractPeriodE(String contractPeriodE) {
		this.contractPeriodE = contractPeriodE;
	}

	public String getRegiInfoMan() {
		return regiInfoMan;
	}

	public void setRegiInfoMan(String regiInfoMan) {
		this.regiInfoMan = regiInfoMan;
	}

	public String getRegiInfoDate() {
		return regiInfoDate;
	}

	public void setRegiInfoDate(String regiInfoDate) {
		this.regiInfoDate = regiInfoDate;
	}

	public String getModiInfoMan() {
		return modiInfoMan;
	}

	public void setModiInfoMan(String modiInfoMan) {
		this.modiInfoMan = modiInfoMan;
	}

	public String getModiInfoDate() {
		return modiInfoDate;
	}

	public void setModiInfoDate(String modiInfoDate) {
		this.modiInfoDate = modiInfoDate;
	}

	@Override
	public String toString() {
		return "CustomDto [busiNum=" + busiNum + ", custom=" + custom + ", Short=" + Short + ", ceo=" + ceo
				+ ", chargePerson=" + chargePerson + ", busiCondition=" + busiCondition + ", item=" + item
				+ ", postNum=" + postNum + ", addr1=" + addr1 + ", addr2=" + addr2 + ", tel=" + tel + ", fax=" + fax
				+ ", homepage=" + homepage + ", coYn=" + coYn + ", foreignYn=" + foreignYn + ", taxYn=" + taxYn
				+ ", countryEng=" + countryEng + ", countryKor=" + countryKor + ", specialRelation=" + specialRelation
				+ ", tradeStop=" + tradeStop + ", contractPeriodS=" + contractPeriodS + ", contractPeriodE="
				+ contractPeriodE + ", regiInfoMan=" + regiInfoMan + ", regiInfoDate=" + regiInfoDate + ", modiInfoMan="
				+ modiInfoMan + ", modiInfoDate=" + modiInfoDate + "]";
	}
	
}
