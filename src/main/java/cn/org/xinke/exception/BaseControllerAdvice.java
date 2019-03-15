package cn.org.xinke.exception;

import cn.org.xinke.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @description 处理全局异常
 * @author cinco
 * @date 2019-3-15
 */
@Slf4j
@ControllerAdvice
public class BaseControllerAdvice {

    private static final int ERROR_CODE = 400;

    private static final String ERROR_MSG = "操作失败";

    public BaseControllerAdvice() {
    }

    /**
     * 统一返回结果方法
     *
     * @param code
     * @param msg
     * @return JsonResult
     */
    private JsonResult getResult(Integer code, String msg) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(code);
        jsonResult.setMsg(msg);
        return jsonResult;
    }

    /**
     * 自定义异常处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler({BusinessException.class})
    public JsonResult baseErrorHandler(BusinessException ex) {
        log.error(ex.getMsg(), ex);
        return getResult(ex.getCode(), ex.getMsg());
    }

    /**
     * 运行时异常处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler({RuntimeException.class})
    public JsonResult runErrorHandler(RuntimeException ex) {
        log.error(ex.getMessage(), ex);
        return getResult(ERROR_CODE, ERROR_MSG);
    }

    /**
     * 数据库异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler({SQLException.class})
    @ResponseBody
    public JsonResult databaseError(Exception ex) {
        log.error(ex.getMessage(), ex);
        return getResult(ERROR_CODE, ERROR_MSG);
    }

    /**
     * 根异常处理
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public JsonResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return getResult(ERROR_CODE, e.getMessage());
    }
}