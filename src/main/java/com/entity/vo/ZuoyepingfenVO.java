package com.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 作业评分
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public class ZuoyepingfenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 课程封面
     */

    private String kechengfengmian;

    /**
     * 评分时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date pingfenshijian;

    /**
     * 班级
     */

    private String banji;

    /**
     * 作业名称
     */

    private String zuoyemingcheng;

    /**
     * 成绩
     */

    private String chengji;

    /**
     * 评分结果
     */

    private String pingfenjieguo;

    /**
     * 教师工号
     */

    private String jiaoshigonghao;

    /**
     * 教师姓名
     */

    private String jiaoshixingming;

    /**
     * 学生账号
     */

    private String xueshengzhanghao;

    /**
     * 学生姓名
     */

    private String xueshengxingming;

    /**
     * 评分内容
     */

    private String pingfenneirong;

    /**
     * 获取：课程封面
     */
    public String getKechengfengmian() {
        return kechengfengmian;
    }

    /**
     * 设置：课程封面
     */

    public void setKechengfengmian(String kechengfengmian) {
        this.kechengfengmian = kechengfengmian;
    }

    /**
     * 获取：评分时间
     */
    public Date getPingfenshijian() {
        return pingfenshijian;
    }

    /**
     * 设置：评分时间
     */

    public void setPingfenshijian(Date pingfenshijian) {
        this.pingfenshijian = pingfenshijian;
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
     * 获取：作业名称
     */
    public String getZuoyemingcheng() {
        return zuoyemingcheng;
    }

    /**
     * 设置：作业名称
     */

    public void setZuoyemingcheng(String zuoyemingcheng) {
        this.zuoyemingcheng = zuoyemingcheng;
    }

    /**
     * 获取：成绩
     */
    public String getChengji() {
        return chengji;
    }

    /**
     * 设置：成绩
     */

    public void setChengji(String chengji) {
        this.chengji = chengji;
    }

    /**
     * 获取：评分结果
     */
    public String getPingfenjieguo() {
        return pingfenjieguo;
    }

    /**
     * 设置：评分结果
     */

    public void setPingfenjieguo(String pingfenjieguo) {
        this.pingfenjieguo = pingfenjieguo;
    }

    /**
     * 获取：教师工号
     */
    public String getJiaoshigonghao() {
        return jiaoshigonghao;
    }

    /**
     * 设置：教师工号
     */

    public void setJiaoshigonghao(String jiaoshigonghao) {
        this.jiaoshigonghao = jiaoshigonghao;
    }

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
     * 获取：学生账号
     */
    public String getXueshengzhanghao() {
        return xueshengzhanghao;
    }

    /**
     * 设置：学生账号
     */

    public void setXueshengzhanghao(String xueshengzhanghao) {
        this.xueshengzhanghao = xueshengzhanghao;
    }

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
     * 获取：评分内容
     */
    public String getPingfenneirong() {
        return pingfenneirong;
    }

    /**
     * 设置：评分内容
     */

    public void setPingfenneirong(String pingfenneirong) {
        this.pingfenneirong = pingfenneirong;
    }

}
