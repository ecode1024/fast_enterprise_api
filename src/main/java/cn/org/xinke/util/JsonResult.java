package cn.org.xinke.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 * @description 接口数据统一返回格式
 * @author cinco
 * @date 2019-2-15
 */
public class JsonResult implements Serializable {

    private Integer code = 200;

    private String msg = "";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pages;

    private Object data = "";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object attachedData;

    public JsonResult() {
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getAttachedData() {
        return this.attachedData;
    }

    public void setAttachedData(Object attachedData) {
        this.attachedData = attachedData;
    }
}
