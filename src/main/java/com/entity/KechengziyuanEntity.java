package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 课程资源
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@TableName("kechengziyuan")
public class KechengziyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 资源名称
     */

    private String ziyuanmingcheng;
    /**
     * 资源类型
     */

    private String ziyuanleixing;
    /**
     * 资源图片
     */

    private String ziyuantupian;
    /**
     * 资源文件
     */

    private String ziyuanwenjian;
    /**
     * 资源介绍
     */

    private String ziyuanjieshao;
    /**
     * 发布日期
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat
    private Date faburiqi;
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
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public KechengziyuanEntity() {

    }


    public KechengziyuanEntity(T t) {
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：资源名称
     */
    public String getZiyuanmingcheng() {
        return ziyuanmingcheng;
    }

    /**
     * 设置：资源名称
     */
    public void setZiyuanmingcheng(String ziyuanmingcheng) {
        this.ziyuanmingcheng = ziyuanmingcheng;
    }

    /**
     * 获取：资源类型
     */
    public String getZiyuanleixing() {
        return ziyuanleixing;
    }

    /**
     * 设置：资源类型
     */
    public void setZiyuanleixing(String ziyuanleixing) {
        this.ziyuanleixing = ziyuanleixing;
    }

    /**
     * 获取：资源图片
     */
    public String getZiyuantupian() {
        return ziyuantupian;
    }

    /**
     * 设置：资源图片
     */
    public void setZiyuantupian(String ziyuantupian) {
        this.ziyuantupian = ziyuantupian;
    }

    /**
     * 获取：资源文件
     */
    public String getZiyuanwenjian() {
        return ziyuanwenjian;
    }

    /**
     * 设置：资源文件
     */
    public void setZiyuanwenjian(String ziyuanwenjian) {
        this.ziyuanwenjian = ziyuanwenjian;
    }

    /**
     * 获取：资源介绍
     */
    public String getZiyuanjieshao() {
        return ziyuanjieshao;
    }

    /**
     * 设置：资源介绍
     */
    public void setZiyuanjieshao(String ziyuanjieshao) {
        this.ziyuanjieshao = ziyuanjieshao;
    }

    /**
     * 获取：发布日期
     */
    public Date getFaburiqi() {
        return faburiqi;
    }

    /**
     * 设置：发布日期
     */
    public void setFaburiqi(Date faburiqi) {
        this.faburiqi = faburiqi;
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