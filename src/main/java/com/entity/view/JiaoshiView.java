package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.JiaoshiEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 教师
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
@TableName("jiaoshi")
public class JiaoshiView extends JiaoshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public JiaoshiView() {
    }

    public JiaoshiView(JiaoshiEntity jiaoshiEntity) {
        try {
            BeanUtils.copyProperties(this, jiaoshiEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
