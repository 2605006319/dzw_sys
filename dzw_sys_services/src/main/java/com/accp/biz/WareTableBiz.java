package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.waretableMapper;
import com.accp.pojo.waretable;

@Service("wareTableBiz")
public class WareTableBiz {
	
	@Autowired
	private waretableMapper dao;
	
	public List<waretable> queryWareTableAll(){
		return dao.queryWareTableAll();
	}

}
