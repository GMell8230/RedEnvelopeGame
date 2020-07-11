
package com.springBoot.LuckyMoney_boot.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.LuckyMoney_boot.domain.LimitConfig;

/**
* @ClassName: HelloController
* @Description: TODO
* @author GMell
* @date 2020-7-10
*@Component + @ResponseBody = @RestController
*/

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private LimitConfig limitConfig;
	
	@GetMapping("/say")
//	@PostMapping("/say")
//	@RequestMapping("/say")
	public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id) {
		return "id:"+id+" description: "+limitConfig.getDescription();
//		return "index";
	}
	@GetMapping("/hello2")
	@ResponseBody
	public String say2() {
//		return " description: "+limitConfig.getDescription();
		return "index";
	}
}
