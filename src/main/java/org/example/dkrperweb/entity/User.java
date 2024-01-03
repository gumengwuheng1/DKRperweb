package org.example.dkrperweb.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 264615886075375169L;
    /**
     * 用户id
     */
    private Integer uId;
    /**
     * 用户名称
     */
    private String uName;
    /**
     * 用户头像
     */
    private String uHeadPortrait;
    /**
     * 创建时间
     */
    private Date uCreationTime;
    /**
     * 修改时间
     */
    private Date uModificationTime;


}

