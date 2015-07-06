package com.hoo.exception;

import org.springframework.dao.DataAccessException;

/**
 * function:�Զ���Biz���쳣��Ϣ
 * 
 * @author hoojo
 * @createDate 2015-06-28 ����10:52:28
 * @file BizException.java
 * @package com.hoo.exception
 * @project MyBatisForSpring
 * @version 1.0
 */
public class BizException extends DataAccessException {

	private static final long serialVersionUID = 1L;

	public BizException(String msg) {
		super(msg);
	}

	public BizException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
