package cn.linjk.ihouse.common.bean;

/**
 * Create By LinJK At 08/21/2017
 *
 * 响应实体
 */

public class ResponseBody<T> {
    private long status = 200;
    private String message = "正常";
    private T data;
}
