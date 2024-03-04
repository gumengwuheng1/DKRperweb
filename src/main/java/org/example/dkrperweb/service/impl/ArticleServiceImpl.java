package org.example.dkrperweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.experimental.Helper;
import org.example.dkrperweb.dao.ArticleDao;
import org.example.dkrperweb.entity.Article;
import org.example.dkrperweb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HexFormat;
import java.util.List;
import java.util.Map;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao; //  注入Dao


    boolean estimate = false;

    /**
     * 新增文章
     *
     * @param article
     * @return
     */
    @Override
    public boolean ArticleInsert(Article article) {
        if (articleDao.ArticleInsert(article) > 0) {
            estimate = true;
        }
        return estimate;
    }

    /**
     * 删除文章
     *
     * @param id
     * @return
     */

    @Override
    public boolean ArticleDelete(Integer id) {
        if (articleDao.ArticleDelete(id) > 0) {
            estimate = true;
        }
        return estimate;
    }

    /**
     * 修改文章
     *
     * @param article
     * @return
     */

    @Override
    public boolean ArticleUpdate(Article article) {
        if (articleDao.ArticleUpdate(article) > 0) {
            estimate = true;
        }
        return estimate;
    }

    /**
     * 查询单个文章详情
     *
     * @param id
     * @return
     */

    @Override
    public Article ArticleLook(Integer id) {
        return articleDao.ArticleLook(id);
    }


    /**
     * 分页查询
     *
     * @return
     */
    @Override
    public PageInfo<Article> ArticlePageInfoList(Map<String, Object> map) {
        Article article = new Article();

        PageHelper.startPage(Integer.getInteger(map.get("pageNow").toString()), (Integer.getInteger(map.get("pageSize").toString())));

        List<Article> list = articleDao.ArticleList(article);
        PageInfo<Article> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }
}
