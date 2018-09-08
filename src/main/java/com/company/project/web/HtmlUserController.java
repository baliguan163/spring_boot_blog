package com.company.project.web;

import com.company.project.model.Blog;
import com.company.project.model.User;
import com.company.project.service.BlogService;
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

/**
 * Created by wangchenghao on 2017/8/2.
 */
@Controller
@RequestMapping("/admin")
public class HtmlUserController{
    @Autowired
    private BlogService blogService;
    @Autowired
    private UserService userService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    /**
     * 后台主页
     */
    @RequestMapping(value = "")
    public String admin(Model model) {
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "admin/index";
    }


    /**
     * 登录模块
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "admin/login";
    }

    /**
     * 登录验证
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String dologin(HttpServletResponse response,User user,String username, String password, Model model){
        System.out.println("username:" + username  +  "  password:" + password);
        User u = userService.findBy("userAccount",username);
        System.out.println("username:" + u.getUserAccount()  +  "  password:" + u.getUserPassword());
        if(u.getUserAccount().compareTo("username")==0 && (u.getUserPassword().compareTo("password")==0)){
//            model.addAttribute("user", user);
//            System.out.println(cookie.getName());

//            List<Blog> blogs = blogService.findAll();
//            model.addAttribute("blogs", blogs);
//            return "admin/index";
            return "redirect:/admin";
        }else {
            model.addAttribute("error", "用户名或者密码错误");
            System.out.println("failture");
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
//
//            return "redirect:/admin";
//        }else {
//            model.addAttribute("error", "用户名或者密码错误");
//            System.out.println("failture");
//            return "admin/login";
//        }
//    }


    /**
     * 删除博客
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        blogService.deleteById(id);
        return "redirect:/admin";
    }

    @RequestMapping("/write")
    public String write(Model model){
//        List<Category> categories = categoryService.list();
//        model.addAttribute("categories", categories);
        model.addAttribute("article", new Blog());
        return "admin/write";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Blog article){
//        //设置种类
//        String name = article.getCategory().getName();
//        Category category = categoryService.fingdByName(name);
//        article.setCategory(category);
        //设置摘要,取前40个字
//        if(article.getBlogText().length() > 40){
//            article.setSummary(article.getContent().substring(0, 40));
//        }else {
//            article.setSummary(article.getContent().substring(0, article.getContent().length()));
//        }
        article.setBlogDate(new Date());
        blogService.save(article);
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
        Blog blog = blogService.findById(id);
        model.addAttribute("target", blog);
//        List<Category> categories = categoryService.list();
//        model.addAttribute("categories", categories);
        model.addAttribute("article", new Blog());
        return "admin/update";
    }

}
