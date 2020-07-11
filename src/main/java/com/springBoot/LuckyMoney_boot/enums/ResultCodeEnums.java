
package com.springBoot.LuckyMoney_boot.enums;

/**
* @ClassName: ResultCodeEnums
* @Description: TODO
* @author GMell
* @date 2020年7月11日
*
*/

public enum ResultCodeEnums {
	UNKONW_ERROR(-1,"UNKONW_ERROR"),
	Acount_LIMIT(100,"账户异常"),
	TRANSACTION_LIMIT(101,"已到达转账上限"),;
	
	private String message;
	private Integer code;
	/**
	* @return code
	*/
	
	/**
	 * ResultCodeEnums.
	 *
	 */

	private ResultCodeEnums(Integer code, String msg) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.message = msg;
	}
	public Integer getCode() {
		return code;
	}
	

	/**
	* @return message
	*/
	
	public String getMessage() {
		return message;
	}

}
