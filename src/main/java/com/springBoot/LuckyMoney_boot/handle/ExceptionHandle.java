
package com.springBoot.LuckyMoney_boot.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springBoot.LuckyMoney_boot.domain.ResultMsg;
import com.springBoot.LuckyMoney_boot.exception.AccountException;
import com.springBoot.LuckyMoney_boot.utill.ResultMsgUtill;

/**
* @ClassName: ExceptionHandle
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/
@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultMsg handle(Exception e) {
		if (e instanceof AccountException) {
			AccountException accountException = (AccountException) e;
			return ResultMsgUtill.failed(accountException.getCode(), accountException.getMessage());
		}else {
			return ResultMsgUtill.failed(-1, "unkown error");
		}
		
	}
}