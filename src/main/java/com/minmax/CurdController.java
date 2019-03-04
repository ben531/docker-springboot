package com.minmax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.minmax.mapper.EmployMapper;
import com.minmax.model.Employ;

@RestController
@RequestMapping(value = "curd")
public class CurdController {
	@Autowired
	private EmployMapper mapper;
	@Autowired
	private JsonResult jr;

	@GetMapping(value = "c")
	public String creat() {
		Employ record = new Employ();
		record.seteName("李白");
		int insertSelective = mapper.insertSelective(record);
//		JsonResult jr = new JsonResult();
		if (insertSelective != 0) {
			jr.setCode("1");
			jr.setData(record);
			return JSON.toJSONString(jr);
		}
		return JSON.toJSONString(new JsonResult("0", "插入失败"));
	}

	@GetMapping(value = "u")
	public Integer update() {
		return null;
	}

	@GetMapping(value = "r")
	public Integer retrieve() {
		return null;
	}

	@GetMapping(value = "d")
	public Integer delete() {
		return null;
	}
}
