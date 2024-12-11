package com.entity.vo;

import java.io.Serializable;


/**
 * 课程类型
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public class KechengleixingVO implements Serializable {
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
