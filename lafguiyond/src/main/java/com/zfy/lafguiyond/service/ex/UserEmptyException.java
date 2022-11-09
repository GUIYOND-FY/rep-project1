package com.zfy.lafguiyond.service.ex;

/** 非法访问的异常 */
public class UserEmptyException extends ServiceException {
    public UserEmptyException() {
        super();
    }

    public UserEmptyException(String message) {
        super(message);
    }

    public UserEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserEmptyException(Throwable cause) {
        super(cause);
    }

    protected UserEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
