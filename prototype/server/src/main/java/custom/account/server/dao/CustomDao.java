package custom.account.server.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import custom.account.server.dto.AccountDto;
import custom.account.server.dto.CountryDto;
import custom.account.server.dto.CustomDto;
import custom.account.server.dto.CustomParam;
import custom.account.server.dto.TotalDto;

@Mapper
@Repository
public interface CustomDao {

	// 거래처 등록
	public int insertData(CustomDto dto);
	
	// 계좌정보 등록
	public int insertAccount(AccountDto dto);
	
	// 국가목록 조회
	public List<CountryDto> searchCountry();
	
	// 거래처 목록 조회
	public List<CustomDto> searchCustom(CustomParam dto);
	
	// 선택한 거래처 정보 불러오기
	public TotalDto getCustomDetail(String busiNum);
	
	// 선택한 거래처 정보 삭제
	public int deleteCustom(String busiNum);
	
	// 선택한 거래처 정보 수정
	public int updateCustom(CustomDto dto);
	
	// 선택한 계좌정보 수정
	public int updateAccount(AccountDto dto);
	
}
