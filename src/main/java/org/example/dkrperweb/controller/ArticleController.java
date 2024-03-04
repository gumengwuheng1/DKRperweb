package org.example.dkrperweb.controller;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.example.dkrperweb.entity.Article;
import org.example.dkrperweb.service.ArticleService;
import org.example.dkrperweb.standard.PromptRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    @PostMapping("/ArticleInsert")
    public PromptRule ArticleInsert(Article article) {
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

    /**
     * 删除文章
     *
     * @param id
     * @return
     */
    @PostMapping("/ArticleDelete")
    public PromptRule ArticleDelete(@RequestParam Integer id) {
        try {
            if (articleService.ArticleDelete(id)) {
                return promptRule.success();
            } else {
                return promptRule.error("删除失败");
            }
        } catch (Exception e) {
            return promptRule.error();
        }
    }

    /**
     * 修改文章
     *
     * @param article
     * @return
     */
    @PostMapping("/ArticleUpdate")
    public PromptRule ArticleUpdate(Article article) {
        try {
            if (articleService.ArticleUpdate(article)) {
                return promptRule.success("修改成功");
            } else {
                return promptRule.error("修改失败");
            }
        } catch (Exception e) {
            return promptRule.error("修改失败");
        }
    }

    /**
     * 查看文章
     *
     * @param id
     * @return
     */
    @GetMapping("/ArticleSelect")
    public PromptRule<Article> ArticleSelect(Integer id) {
        try {
            Article article = articleService.ArticleLook(id);
            if (article != null) {
                return promptRule.success(article);
            } else {
                return promptRule.error("未找到");
            }
        } catch (Exception e) {
            return promptRule.error("查询失败");
        }
    }

    /**
     * 分页查看文章
     *
     * @param map
     * @return
     */
    @GetMapping("/ArticleSelectAll")
    public PromptRule<PageInfo<Article>> ArticleSelectAll(@RequestBody Map<String, Object> map) {
        try {
            PageInfo<Article> articlePageInfo = articleService.ArticlePageInfoList(map);
            if (articlePageInfo != null) {
                return promptRule.success("查询成功", articlePageInfo);
            } else {
                return promptRule.error("未找到");
            }
        } catch (Exception e) {
            return promptRule.error("查询失败");
        }
    }


}

