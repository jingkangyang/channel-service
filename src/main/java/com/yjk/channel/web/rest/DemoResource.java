package com.yjk.channel.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yjk.biz.client.DemoFeignService;
import com.yjk.biz.dto.ResultDto;

import io.swagger.annotations.Api;

@Api(value="Demo聚合服务",tags="Demo聚合服务")
public class DemoResource {
	
	@Autowired
	private DemoFeignService demoFeignService;
	
	@PostMapping(value="/demo")
	public ResultDto<String> demo(@RequestParam String applCde) {
		ResultDto<String> demo = new ResultDto<String>();
		ResultDto<String> demo2 = new ResultDto<String>();
		ResultDto<String> demo3 = new ResultDto<String>();
		demo = demoFeignService.selectDemo(applCde);
		demo2 = demoFeignService.selectDemo2(applCde);
		demo3 = demoFeignService.selectDemo3(applCde);
		return demo;
	}
	
}
