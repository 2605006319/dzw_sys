package com.accp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.WareTableBiz;
import com.accp.pojo.waretable;

@RestController
@RequestMapping("api/wares")
public class WareTableAction {
	
	@Autowired
	private WareTableBiz biz;

	@GetMapping
	public List<waretable> queryWareTableAll(){
		return biz.queryWareTableAll();
	}
}
