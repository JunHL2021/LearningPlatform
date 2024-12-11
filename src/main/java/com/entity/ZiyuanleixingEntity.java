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
 * 资源类型
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
@TableName("ziyuanleixing")
public class ZiyuanleixingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 资源类型
     */

    private String ziyuanleixing;
    /**
     * 图片
     */

    private String image;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public ZiyuanleixingEntity() {

    }


    public ZiyuanleixingEntity(T t) {
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
     * 获取：图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置：图片
     */
    public void setImage(String image) {
        this.image = image;
    }

}
