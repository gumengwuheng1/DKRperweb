package org.example.dkrperweb.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@Data
public class Article implements Serializable {
    private static final long serialVersionUID = -57280729096016377L;
    /**
     * 文章id
     */
    private Long aId;
    /**
     * 文章标题
     */
    private String aName;
    /**
     * 文章内容
     */
    private String aContent;
    /**
     * 创建人
     */
    private String aCreator;
    /**
     * 创建时间
     */
    private Date aCreationTime;
    /**
     * 修改时间
     */
    private Date aModificationTime;
    /**
     * 修改人
     */
    private String aModifier;
    /**
     * 文章状态(0删除,1正常)
     */
    private Integer aState;

}

