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
 * 班级信息
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@TableName("banjixinxi")
public class BanjixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 教师工号
     */

    private String jiaoshigonghao;
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
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public BanjixinxiEntity() {

    }


    public BanjixinxiEntity(T t) {
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
