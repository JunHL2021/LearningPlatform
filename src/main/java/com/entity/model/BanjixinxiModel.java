package com.entity.model;

import java.io.Serializable;


/**
 * 班级信息
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public class BanjixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 教师姓名
     */

    private String jiaoshixingming;

    /**
     * 班级号
     */

    private String banjihao;

    /**
     * 班级名称
     */

    private String banjimingcheng;

    /**
     * 班级人数
     */

    private Integer banjirenshu;

    /**
     * 班级介绍
     */

    private String banjijieshao;

    /**
     * 班级图片
     */

    private String banjitupian;

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
     * 获取：班级号
     */
    public String getBanjihao() {
        return banjihao;
    }

    /**
     * 设置：班级号
     */

    public void setBanjihao(String banjihao) {
        this.banjihao = banjihao;
    }

    /**
     * 获取：班级名称
     */
    public String getBanjimingcheng() {
        return banjimingcheng;
    }

    /**
     * 设置：班级名称
     */

    public void setBanjimingcheng(String banjimingcheng) {
        this.banjimingcheng = banjimingcheng;
    }

    /**
     * 获取：班级人数
     */
    public Integer getBanjirenshu() {
        return banjirenshu;
    }

    /**
     * 设置：班级人数
     */

    public void setBanjirenshu(Integer banjirenshu) {
        this.banjirenshu = banjirenshu;
    }

    /**
     * 获取：班级介绍
     */
    public String getBanjijieshao() {
        return banjijieshao;
    }

    /**
     * 设置：班级介绍
     */

    public void setBanjijieshao(String banjijieshao) {
        this.banjijieshao = banjijieshao;
    }

    /**
     * 获取：班级图片
     */
    public String getBanjitupian() {
        return banjitupian;
    }

    /**
     * 设置：班级图片
     */

    public void setBanjitupian(String banjitupian) {
        this.banjitupian = banjitupian;
    }

}
