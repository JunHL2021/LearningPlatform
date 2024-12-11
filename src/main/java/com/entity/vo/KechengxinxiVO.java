package com.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 课程信息
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public class KechengxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 课程名称
     */

    private String kechengmingcheng;

    /**
     * 课程类型
     */

    private String kechengleixing;

    /**
     * 课程封面
     */

    private String kechengfengmian;

    /**
     * 班级
     */

    private String banji;

    /**
     * 课程视频
     */

    private String kechengshipin;

    /**
     * 课程详情
     */

    private String kechengxiangqing;

    /**
     * 发布时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date fabushijian;

    /**
     * 教师工号
     */

    private String jiaoshigonghao;

    /**
     * 教师姓名
     */

    private String jiaoshixingming;

    /**
     * 最近点击时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date clicktime;

    /**
     * 点击次数
     */

    private Integer clicknum;

    /**
     * 收藏数
     */

    private Integer storeupnum;

    /**
     * 获取：课程名称
     */
    public String getKechengmingcheng() {
        return kechengmingcheng;
    }

    /**
     * 设置：课程名称
     */

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }

    /**
     * 获取：课程类型
     */
    public String getKechengleixing() {
        return kechengleixing;
    }

    /**
     * 设置：课程类型
     */

    public void setKechengleixing(String kechengleixing) {
        this.kechengleixing = kechengleixing;
    }

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
     * 获取：课程视频
     */
    public String getKechengshipin() {
        return kechengshipin;
    }

    /**
     * 设置：课程视频
     */

    public void setKechengshipin(String kechengshipin) {
        this.kechengshipin = kechengshipin;
    }

    /**
     * 获取：课程详情
     */
    public String getKechengxiangqing() {
        return kechengxiangqing;
    }

    /**
     * 设置：课程详情
     */

    public void setKechengxiangqing(String kechengxiangqing) {
        this.kechengxiangqing = kechengxiangqing;
    }

    /**
     * 获取：发布时间
     */
    public Date getFabushijian() {
        return fabushijian;
    }

    /**
     * 设置：发布时间
     */

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
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
     * 获取：最近点击时间
     */
    public Date getClicktime() {
        return clicktime;
    }

    /**
     * 设置：最近点击时间
     */

    public void setClicktime(Date clicktime) {
        this.clicktime = clicktime;
    }

    /**
     * 获取：点击次数
     */
    public Integer getClicknum() {
        return clicknum;
    }

    /**
     * 设置：点击次数
     */

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    /**
     * 获取：收藏数
     */
    public Integer getStoreupnum() {
        return storeupnum;
    }

    /**
     * 设置：收藏数
     */

    public void setStoreupnum(Integer storeupnum) {
        this.storeupnum = storeupnum;
    }

}
