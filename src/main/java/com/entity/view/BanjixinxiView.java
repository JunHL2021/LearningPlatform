package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.BanjixinxiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 班级信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@TableName("banjixinxi")
public class BanjixinxiView extends BanjixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public BanjixinxiView() {
    }

    public BanjixinxiView(BanjixinxiEntity banjixinxiEntity) {
        try {
            BeanUtils.copyProperties(this, banjixinxiEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
