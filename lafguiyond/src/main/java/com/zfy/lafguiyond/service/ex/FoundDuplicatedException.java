package com.zfy.lafguiyond.service.ex;

/**
 * 用户数据不存在的异常
 */
public class FoundDuplicatedException extends ServiceException{
    public FoundDuplicatedException() {
        super();
    }

    public FoundDuplicatedException(String message) {
        super(message);
    }

    public FoundDuplicatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoundDuplicatedException(Throwable cause) {
        super(cause);
    }

    protected FoundDuplicatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
