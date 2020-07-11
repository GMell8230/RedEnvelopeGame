
package com.springBoot.LuckyMoney_boot.utill;

import com.springBoot.LuckyMoney_boot.domain.ResultMsg;

/**
* @ClassName: ResultUtill
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/

public class ResultMsgUtill {
	public static ResultMsg success(Object obj) {
		ResultMsg res = new ResultMsg<>();
		res.setErrCode(0);
		res.setData(obj);
		res.setMsg("success");
		return res;
	}
	
	public static ResultMsg success() {
		return success(null);
	}
	
	public static ResultMsg failed(Integer code, String msg) {
		ResultMsg res = new ResultMsg<>();
		res.setErrCode(code);
		res.setData(null);
		res.setMsg(msg);
		return res;
	}
}
