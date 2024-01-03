package org.example.dkrperweb.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.dkrperweb.entity.Article;

import java.util.List;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@Mapper
public interface ArticleDao {

    /**
     * 新增文章
     *
     * @param article
     * @return
     */
    int ArticleInsert(Article article);

    /**
     * 删除文章
     *
     * @param id
     * @return
     */
    int ArticleDelete(Integer id);

    /**
     * 修改文章
     *
     * @param article
     * @return
     */
    int ArticleUpdate(Article article);

    /**
     * 查看单个文章
     *
     * @param id
     * @return
     */
    Article ArticleLook(Integer id);

    /**
     * 分页查看文章
     *
     * @param article
     * @return
     */
    List<Article> ArticleList(Article article);


}

