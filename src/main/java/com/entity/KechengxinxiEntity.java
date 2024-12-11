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
 * 课程信息
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@TableName("kechengxinxi")
public class KechengxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 课程编号
     */

    private String kechengbianhao;
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

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
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
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public KechengxinxiEntity() {

    }


    public KechengxinxiEntity(T t) {
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
     * 获取：课程编号
     */
    public String getKechengbianhao() {
        return kechengbianhao;
    }

    /**
     * 设置：课程编号
     */
    public void setKechengbianhao(String kechengbianhao) {
        this.kechengbianhao = kechengbianhao;
    }

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
