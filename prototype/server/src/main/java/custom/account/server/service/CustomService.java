package custom.account.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import custom.account.server.dao.CustomDao;
import custom.account.server.dto.AccountDto;
import custom.account.server.dto.CountryDto;
import custom.account.server.dto.CustomDto;
import custom.account.server.dto.CustomParam;
import custom.account.server.dto.TotalDto;

@Service
@Transactional
public class CustomService {

	@Autowired
	CustomDao dao;
	
	// 거래처 등록
	public boolean insertData(CustomDto dto) {
		int n = dao.insertData(dto);
		return n>0?true:false;
	}
	
	// 계좌정보 등록
	public boolean insertAccount(AccountDto dto) {
		int n = dao.insertAccount(dto);
		return n>0?true:false;
	}
	
	// 나라목록 조회
	public List<CountryDto> searchCountry() {
		return dao.searchCountry();
	}
	
	// 거래처 목록 조회
	public List<CustomDto> searchCustom(CustomParam dto) {
		return dao.searchCustom(dto);
	}
	
	// 선택한 거래처 정보 불러오기
	public TotalDto getCustomDetail(String busiNum) {
		return dao.getCustomDetail(busiNum);
	}
	
	// 선택한 거래처 정보 삭제
	public boolean deleteCustom(String busiNum) {
		int n = dao.deleteCustom(busiNum);
		return n>0?true:false;
	}
	
	// 선택한 거래처 정보 수정
	public boolean updateCustom(CustomDto dto) {
		int n = dao.updateCustom(dto);
		return n>0?true:false;
	}
	
	// 선택한 계좌정보 수정
	public boolean updateAccount(AccountDto dto) {
		int n = dao.updateAccount(dto);
		return n>0?true:false;
	}
	
}
