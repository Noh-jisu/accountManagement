package custom.account.server.dto;

public class CountryDto {
	private String eng;
	private String kor;
	
	public CountryDto() {
		
	}
	
	public CountryDto(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "CountryDto [eng=" + eng + ", kor=" + kor + "]";
	}
}
