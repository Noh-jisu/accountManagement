package spring.framework.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.framework.test.dao.MainDao;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	MainDao dao;

}
