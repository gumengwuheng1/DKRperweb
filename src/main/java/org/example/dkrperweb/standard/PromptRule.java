package org.example.dkrperweb.standard;

import lombok.Data;

/**
 * @project 故梦无痕
 * @description
 * @date 2024/3/1 16:16:38
 */

@Data
public class PromptRule<T> {

    private static final Integer SUCCESS = 201; // 成功
    private static final Integer ERROR = 501; // 失败
    private String msg; // 提示
    private Integer code; // 状态码
    private T Data; // 数据


    public PromptRule() {
    }

    public PromptRule(String msg, Integer code, T data) {
        this.msg = msg;
        this.code = code;
        Data = data;
    }

    /**
     * 成功带值带提示
     *
     * @param msg
     * @param data
     * @return
     */
    public PromptRule<T> success(String msg, T data) {
        return new PromptRule<T>(msg, SUCCESS, data);
    }

    /**
     * 成功带值不带提示
     *
     * @param data
     * @return
     */
    public PromptRule<T> success(T data) {
        return new PromptRule<T>("操作成功", SUCCESS, data);
    }

    /**
     * 成功不带值不带提示
     *
     * @return
     */
    public PromptRule<T> success() {
        return new PromptRule<T>("操作成功", SUCCESS, null);
    }

    /**
     * 成功带提示不带值
     *
     * @param msg
     * @return
     */
    public PromptRule<T> success(String msg) {
        return new PromptRule<T>(msg, SUCCESS, null);
    }

    /**
     * 失败带提示
     *
     * @param msg
     * @return
     */
    public PromptRule<T> error(String msg) {
        return new PromptRule<T>(msg, ERROR, null);
    }

    /**
     * 失败不带提示
     *
     * @return
     */
    public PromptRule<T> error() {

        return new PromptRule<T>("操作失败", ERROR, null);
    }


}
