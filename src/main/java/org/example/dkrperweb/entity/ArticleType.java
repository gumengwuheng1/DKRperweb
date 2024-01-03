package org.example.dkrperweb.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (ArticleType)实体类
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@Data
public class ArticleType implements Serializable {
    private static final long serialVersionUID = 695232248889836837L;
    /**
     * 文章类型
     */
    private Integer atId;
    /**
     * 类型名称
     */
    private String atName;
    /**
     * 创建人
     */
    private String atCreator;
    /**
     * 创建时间
     */
    private Date atCreationTime;
    /**
     * 修改时间
     */
    private Date atModificationTime;
    /**
     * 创建人
     */
    private String atAModifier;


}

