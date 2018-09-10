package com.company.project.web;

import com.company.project.model.Article;
import com.company.project.model.Category;
import com.company.project.model.User;
import com.company.project.service.ArticleService;
import com.company.project.service.CategoryService;
import com.company.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserHtmlController{
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;
    @Autowired
    private CategoryService categoryService;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    /**
     * 后台主页 http://localhost:8099/admin
     */
    @RequestMapping(value = "")
    public String admin(Model model) {
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        return "admin/index";
    }

    /**
     * 登录模块 http://localhost:8099/admin/login
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "admin/login";
    }

    /**
     * 登录验证 http://localhost:8099/admin/dologin
     * @param model
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String dologin(HttpServletResponse response, String username, String password, Model model){
        System.out.println("in:" + username  +  "  password:" + password);
        User u = userService.findBy("username",username);
        System.out.println("out:" + u.getUsername()  +  "  password:" + u.getPassword());
        if(u.getUsername().compareTo(username)==0 && (u.getPassword().compareTo(password)==0)){
            return "redirect:/admin";
        }else {
            model.addAttribute("error", "用户名或者密码错误");
            System.out.println("用户名或者密码错误");
            return "admin/login";
        }
    }
//    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
//    public String doLogin(HttpServletResponse response, User user, Model model){
//        if(userService.login(user.getUsername(), user.getPassword())){
//            Cookie cookie = new Cookie(WebSecurityConfig.SESSION_KEY, user.toString());
//            response.addCookie(cookie);
//            model.addAttribute("user", user);
//            System.out.println(cookie.getName());
//            return "redirect:/admin";
//        }else {
//            model.addAttribute("error", "用户名或者密码错误");
//            System.out.println("failture");
//            return "admin/login";
//        }
//    }


    /**
     * 删除文章
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        articleService.deleteById(id);
        return "redirect:/admin";
    }

    /**
     * 修改博客
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") Integer id, Model model){
        Article article = articleService.findById(id);
        model.addAttribute("target", article);
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("article", new Article());
        return "admin/update";
    }



//    @RequestMapping("/write")
//    public String write(Model model){
////        List<Category> categories = categoryService.list();
////        model.addAttribute("categories", categories);
//        model.addAttribute("article", new Blog());
//        return "admin/write";
//    }


//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save(Blog article){
////        //设置种类
////        String name = article.getCategory().getName();
////        Category category = categoryService.fingdByName(name);
////        article.setCategory(category);
//        //设置摘要,取前40个字
////        if(article.getBlogText().length() > 40){
////            article.setSummary(article.getContent().substring(0, 40));
////        }else {
////            article.setSummary(article.getContent().substring(0, article.getContent().length()));
////        }
//        article.setBlogDate(new Date());
//        blogService.save(article);
//        return "redirect:/admin";
//    }
//
//


}
