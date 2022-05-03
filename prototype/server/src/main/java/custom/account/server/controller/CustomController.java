package custom.account.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import custom.account.server.dto.AccountDto;
import custom.account.server.dto.CountryDto;
import custom.account.server.dto.CustomDto;
import custom.account.server.dto.CustomParam;
import custom.account.server.dto.TotalDto;
import custom.account.server.service.CustomService;

@RestController
public class CustomController {
	
	@Autowired
	CustomService sv;
	
	// 거래처 등록
	@RequestMapping(value = "/insertData", method = {RequestMethod.GET, RequestMethod.POST})
	public String insertData(CustomDto dto) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(insertData)등록할 데이터 : " + dto);
		
		boolean b = sv.insertData(dto);
		if(b) {
			// 등록 성공
			return "success";
		}
		// 등록 실패
		return "fail";
	}
	
	// 계좌정보 등록
	@RequestMapping(value = "/insertAccount", method = {RequestMethod.GET, RequestMethod.POST})
	public String insertAccount(AccountDto dto) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(insertAccount)등록할 계좌정보 : " + dto);
		
		boolean b = sv.insertAccount(dto);
		if(b) {
			// 등록성공
			return "success";
		}
		// 등록 실패
				return "fail";
	}
	
	// 나라목록 조회
	@RequestMapping(value = "/searchCountry", method = {RequestMethod.GET, RequestMethod.POST})
	public List<CountryDto> searchCountry() {
		List<CountryDto> list = sv.searchCountry();
		
		// 서버로 보낼 나라목록 확인
		System.out.println("(searchCountry)조회한 나라목록 : " + list);
		
		return list;
	}
	
	// 거래처 목록 조회
	@RequestMapping(value = "/searchCustom", method = {RequestMethod.GET, RequestMethod.POST})
	public List<CustomDto> searchCustom(CustomParam dto) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(searchCustom)검색한 내용 : " + dto);
		
		List<CustomDto> list = sv.searchCustom(dto);
		System.out.println(list);
		return list;
	}
	
	// 선택한 거래처 목록 불러오기
	@RequestMapping(value = "/getCustomDetail", method = {RequestMethod.GET, RequestMethod.POST})
	public TotalDto getCustomDetail(String busiNum) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(getCustomDetail)사업자번호 : " + busiNum);
		
		TotalDto dto = sv.getCustomDetail(busiNum);
		System.out.println("클라이언트로 보내는 정보 : " + dto);
		
		return dto;
	}
	
	// 선택한 거래처 목록 삭제
	@RequestMapping(value = "/deleteCustom", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteCustom(String busiNum) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(deleteCustom)사업자번호 : " + busiNum);
		
		boolean b = sv.deleteCustom(busiNum);
		
		if(b) {
			// 삭제성공
			return "success";
		}
		
		//삭제실패
		return "fail";
	}
	
	// 선택한 거래처 목록 수정
	@RequestMapping(value = "/updateCustom", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateCustom(CustomDto dto) {
		//클라이언트에서 넘어온 데이터
		System.out.println("(updateCustom)수정할 거래처 정보 : " + dto);
		
		boolean b = sv.updateCustom(dto);
		
		if(b) {
			//수정 성공
			return "success";
		}
		//수정 실패
		return "fail";
	}
	
	// 선택한 계좌정보 수정
	@RequestMapping(value = "/updateAccount", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateAccount(AccountDto dto) {
		// 클라이언트에서 넘어온 데이터
		System.out.println("(updateAccount)수정할 계좌정보 : " + dto);
		
		boolean b = sv.updateAccount(dto);
		
		if(b) {
			// 수정 성공
			return "success";
		}
		// 수정 실패
		return "fail";
	}
	
}


















