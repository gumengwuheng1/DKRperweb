package org.example.dkrperweb.service;

import com.github.pagehelper.PageInfo;
import org.example.dkrperweb.entity.Article;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * (Article)表服务接口
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
public interface ArticleService {
    /**
     * 新增文章
     *
     * @param article
     * @return
     */
    boolean ArticleInsert(Article article);

    /**
     * 删除文章
     *
     * @param id
     * @return
     */
    boolean ArticleDelete(Integer id);

    /**
     * 修改文章
     *
     * @param article
     * @return
     */
    boolean ArticleUpdate(Article article);

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
     * @return
     */
    PageInfo<Article> ArticlePageInfoList(Map<String, Object> map);

}
