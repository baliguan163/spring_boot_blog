package com.company.project.web;

import com.company.project.model.Article;
import com.company.project.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleHtmlController {
    @Autowired
    ArticleService articleService;
    /*
       所有文章http://localhost:8099/article
     */
    @RequestMapping("")
    public String list(Model model){
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        return "front/index";
    }

//    @RequestMapping("/get/{id}")
//    public String get(Model model, @PathVariable(name = "id") String id){
//        return "index";
//    }


//
//    /*
//    按类型显示博客
//     */
//    @RequestMapping("/column/{displayname}/{category}")
//    public String column(@PathVariable("displayname") String dispalyname, @PathVariable("category") String category, Model model){
//        model.addAttribute("articles", articleService.getArticleByCategoryName(category));
//        model.addAttribute("displayName", dispalyname);
//
//        return "front/columnPage";
//    }
//
    /**
     * 文章详细信息 http://localhost:8099/article/detail/108
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){
        System.out.println("detail:" + id);
        Article article = articleService.findById(id);
//        Markdown markdown = new Markdown();
//        try {
//            StringWriter out = new StringWriter();
//            markdown.transform(new StringReader(article.getContent()), out);
//            out.flush();
//            article.setContent(out.toString());
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
        model.addAttribute("article", article);
        return "front/detail";
    }


//    http://localhost:8099/article/search?key=%E8%AE%A9%E4%BA%BA
//    @RequestMapping("/search")
//    public String search(String key, Model model){
//        List<Article> articles = articleService.search(key);
//        model.addAttribute("articles", articles);
//        return "front/columnPage";
//    }

}
