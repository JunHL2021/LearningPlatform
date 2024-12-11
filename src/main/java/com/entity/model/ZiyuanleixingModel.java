package com.entity.model;

import java.io.Serializable;


/**
 * 资源类型
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
public class ZiyuanleixingModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 图片
     */

    private String image;

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
