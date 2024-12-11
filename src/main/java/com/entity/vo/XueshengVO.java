package com.entity.vo;

import java.io.Serializable;


/**
 * 学生
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
public class XueshengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 学生姓名
     */

    private String xueshengxingming;

    /**
     * 密码
     */

    private String mima;

    /**
     * 班级
     */

    private String banji;

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
     * 获取：学生姓名
     */
    public String getXueshengxingming() {
        return xueshengxingming;
    }

    /**
     * 设置：学生姓名
     */

    public void setXueshengxingming(String xueshengxingming) {
        this.xueshengxingming = xueshengxingming;
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
     * 获取：班级
     */
    public String getBanji() {
        return banji;
    }

    /**
     * 设置：班级
     */

    public void setBanji(String banji) {
        this.banji = banji;
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
