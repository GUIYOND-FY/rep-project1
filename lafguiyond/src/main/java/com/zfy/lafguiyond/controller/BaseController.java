package com.zfy.lafguiyond.controller;

import com.zfy.lafguiyond.controller.ex.*;
import com.zfy.lafguiyond.service.ex.*;
import com.zfy.lafguiyond.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    public static final int OK = 200;
    /** @ExceptionHandler用于统一处理方法抛出的异常 */
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
        if (e instanceof UsernameDuplicatedException) {
            result.setState(4000);
        } else if (e instanceof UserNotFoundException) {
            result.setState(4001);
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(4002);
        } else if (e instanceof FoundDuplicatedException) {
            result.setState(4003);
        }else if (e instanceof UserEmptyException) {
            result.setState(4004);
        }else if (e instanceof InsertException) {
            result.setState(5000);
        }else if (e instanceof FileEmptyException) {
            result.setState(6000);
        } else if (e instanceof FileSizeException) {
            result.setState(6001);
        } else if (e instanceof FileTypeException) {
            result.setState(6002);
        } else if (e instanceof FileStateException) {
            result.setState(6003);
        } else if (e instanceof FileUploadIOException) {
            result.setState(6004);
        }

        return result;
    }


}
