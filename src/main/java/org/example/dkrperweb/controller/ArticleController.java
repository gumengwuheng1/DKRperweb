package org.example.dkrperweb.controller;

import org.apache.ibatis.annotations.Param;
import org.example.dkrperweb.entity.Article;
import org.example.dkrperweb.service.ArticleService;
import org.example.dkrperweb.standard.PromptRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2024-01-01 17:05:21
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private PromptRule promptRule;

    /**
     * 新增文章接口
     *
     * @param article
     * @return
     */
    @RequestMapping("/newArticleInsert")
    public PromptRule NewArticleInsert(Article article) {
        try {
            if (articleService.ArticleInsert(article)) {
                return promptRule.success();
            } else {
                return promptRule.error("新增失败");
            }
        } catch (Exception e) {
            return promptRule.error();
        }
    }


}

