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
 * 提交作业
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@TableName("tijiaozuoye")
public class TijiaozuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 课程名称
     */

    private String kechengmingcheng;
    /**
     * 课程封面
     */

    private String kechengfengmian;
    /**
     * 提交时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date tijiaoshijian;
    /**
     * 班级
     */

    private String banji;
    /**
     * 作业名称
     */

    private String zuoyemingcheng;
    /**
     * 作业内容
     */

    private String zuoyeneirong;
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
     * 是否审核
     */

    private String sfsh;
    /**
     * 审核回复
     */

    private String shhf;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public TijiaozuoyeEntity() {

    }


    public TijiaozuoyeEntity(T t) {
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
     * 获取：提交时间
     */
    public Date getTijiaoshijian() {
        return tijiaoshijian;
    }

    /**
     * 设置：提交时间
     */
    public void setTijiaoshijian(Date tijiaoshijian) {
        this.tijiaoshijian = tijiaoshijian;
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
     * 获取：作业内容
     */
    public String getZuoyeneirong() {
        return zuoyeneirong;
    }

    /**
     * 设置：作业内容
     */
    public void setZuoyeneirong(String zuoyeneirong) {
        this.zuoyeneirong = zuoyeneirong;
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
     * 获取：是否审核
     */
    public String getSfsh() {
        return sfsh;
    }

    /**
     * 设置：是否审核
     */
    public void setSfsh(String sfsh) {
        this.sfsh = sfsh;
    }

    /**
     * 获取：审核回复
     */
    public String getShhf() {
        return shhf;
    }

    /**
     * 设置：审核回复
     */
    public void setShhf(String shhf) {
        this.shhf = shhf;
    }

}