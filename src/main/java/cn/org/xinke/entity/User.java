package cn.org.xinke.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;

/**
 * @description 用户实体
 * @author cinco
 * @date 2019-3-15
 */
@Getter
@Setter
public class User implements Serializable {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
