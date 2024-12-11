package com.entity.model;

import java.io.Serializable;


/**
 * 教师
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
public class JiaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 教师姓名
     */

    private String jiaoshixingming;

    /**
     * 密码
     */

    private String mima;

    /**
     * 手机号
     */

    private String shoujihao;

    /**
     * 性别
     */

    private String xingbie;

    /**
     * 年龄
     */

    private String nianling;

    /**
     * 头像
     */

    private String touxiang;

    /**
     * 获取：教师姓名
     */
    public String getJiaoshixingming() {
        return jiaoshixingming;
    }

    /**
     * 设置：教师姓名
     */

    public void setJiaoshixingming(String jiaoshixingming) {
        this.jiaoshixingming = jiaoshixingming;
    }

    /**
     * 获取：密码
     */
    public String getMima() {
        return mima;
    }

    /**
     * 设置：密码
     */

    public void setMima(String mima) {
        this.mima = mima;
    }

    /**
     * 获取：手机号
     */
    public String getShoujihao() {
        return shoujihao;
    }

    /**
     * 设置：手机号
     */

    public void setShoujihao(String shoujihao) {
        this.shoujihao = shoujihao;
    }

    /**
     * 获取：性别
     */
    public String getXingbie() {
        return xingbie;
    }

    /**
     * 设置：性别
     */

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    /**
     * 获取：年龄
     */
    public String getNianling() {
        return nianling;
    }

    /**
     * 设置：年龄
     */

    public void setNianling(String nianling) {
        this.nianling = nianling;
    }

    /**
     * 获取：头像
     */
    public String getTouxiang() {
        return touxiang;
    }

    /**
     * 设置：头像
     */

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

}