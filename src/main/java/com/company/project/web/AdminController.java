//package com.company.project.web;
//
//import com.company.project.model.Blog;
//import com.company.project.model.User;
//import com.company.project.service.BlogService;
//import com.company.project.service.UserService;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
//
///**
// * 后台主页
// */
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminController {
//    @Autowired
//    private BlogService blogService;
//    @Autowired
//    private UserService userService;
//    /**
//     * 后台主页
//     */
//    @RequestMapping(value = "")
//    public String admin(Model model) {
//        List<Blog> blogs = blogService.findAll();
//        model.addAttribute("blogs", blogs);
//        return "admin/index";
//    }
//
//    /**
//     * 登录模块
//     * @return
//     */
//    @RequestMapping(value = "/login")
//    public String login(Model model){
////        model.addAttribute("error", "测试数据");
//        return "admin/login";
//    }
//
//
//
//    /***
//     * x修改update/3
//     */
//    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
//    public String update(@PathVariable("id") Integer id,Model model){
//        Blog blog = blogService.findById(id);
//        model.addAttribute("blog", blog);
//        return "admin/update";
//    }
//
//
//
//    /**
//     *删除一条博客
//     * @return
//     */
//    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
//    public String delete(@PathVariable("id") Integer id,Model model){
//        blogService.deleteById(id);
//        List<Blog> blogs = blogService.findAll();
//        model.addAttribute("blogs", blogs);
//        return "admin/index";
//    }
//
//
//    @RequestMapping(value = "/write")
//    public String write(Model model){
//        return "admin/write";
//    }
//
//
//    /**
//     * 用户登录操作
//     * @param response
//     * @param username
//     * @param password
//     * @param model
//     * @return
//     */
//    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
//    public String dologin(HttpServletResponse response,User user,String username, String password, Model model){
//        System.out.println("username:" + username  +  "  password:" + password);
//        User u = userService.findBy("userAccount",username);
//        System.out.println("username:" + u.getUserAccount()  +  "  password:" + u.getUserPassword());
//        if(u.getUserAccount().compareTo("username")==0 && (u.getUserPassword().compareTo("password")==0)){
////            model.addAttribute("user", user);
////            System.out.println(cookie.getName());
//
////            List<Blog> blogs = blogService.findAll();
////            model.addAttribute("blogs", blogs);
////            return "admin/index";
//            return "redirect:/admin";
//        }else {
//            model.addAttribute("error", "用户名或者密码错误");
//            System.out.println("failture");
//            return "admin/login";
//        }
//    }
//
//
////    @RequestMapping(value = "/dologin")
////    public Map<String,String> dologin(String username, String password){
////        System.out.println("username:" + username + " " + password);
////        Map<String,String> map = new HashMap<>();
////        Random random = new Random();
////        if (StringUtils.isBlank(username)){
////            map.put("msg","用户名不能为空");
////            return map;
////        }
////
////        if (StringUtils.isBlank(password)){
////            map.put("msg","密码不能为空");
////            return map;
////        }
////
////        User u = userService.findBy("userAccount",username);
////        if (u==null){
////            return map;
////        }
////        map.put("username",username);
////
//////        if (!JblogUtil.MD5(password+u.getSalt()).equals(u.getPassword())){
//////            map.put("msg","密码错误");
//////            return map;
//////        }
//////
//////        String ticket = addLoginTicket(u.getId());
//////        map.put("ticket",ticket);
////        return map;
////    }
//
//
//
//
////
////	@ResponseBody
////	@RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
////	public int addUser(User user){
////	    return userService.addUser(user);
////	}
////
////	@ResponseBody
////	@RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
////	public Object findUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
////		return userService.findUser(pageNum,pageSize);
////	}
////
////	@ResponseBody
////	@RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
////	public Object findAllUser(){
////		return userService.findAllUser();
////	}
////
////	@ResponseBody
////	@RequestMapping(value = "/select/{id}", produces = {"application/json;charset=UTF-8"})
////	public Object selectByPrimaryKey(@PathVariable("id") int id){
////		return userService.selectByPrimaryKey(id);
////	}
//
//}
//
//
////@RestController
////public class UserController {
////
////   @Autowired
////   private UserService userService;
////
////	/**
////	 * 需求:返回json格式数据
////	 */
////	@RequestMapping("hello")
////	public String showHello() {
////		return "hello world!";
////	}
////
////	/**
////	 * 需求：返回一个POJO对象
////	 */
////	@RequestMapping("pojo")
////	public User showUser() {
////		User user = new User();
////		user.setId(1);
////		user.setName("张三丰");
////		user.setSex("男");
////		user.setBirthday(new Date());
////		user.setAddress("武当山");
////		return user;
////	}
////
////	@RequestMapping("maps")
////	public Map<String,Object> showMaps() {
////		Map<String, Object> maps = new HashMap<String, Object>();
////		maps.put("username", "张无忌");
////		maps.put("age", "19");
////		return maps;
////	}
////
////	@RequestMapping("list")
////	public List<User> showList() {
////		List<User> uList = new ArrayList<User>();
////		User user = new User();
////		user.setId(1);
////		user.setName("张三丰1");
////		user.setSex("男");
////		user.setBirthday(new Date());
////		user.setAddress("武当山");
////
////		User user2 = new User();
////		user2.setId(2);
////		user2.setName("张三丰2");
////		user2.setSex("男");
////		user2.setBirthday(new Date());
////		user2.setAddress("武当山");
////
////		uList.add(user);
////		uList.add(user2);
////		return uList;
////	}
////
////
////	//整合Mybatis操作
////	@RequestMapping("ssm")
////	public List<User> findAll(){
////	  List<User> list = userService.findAll();
////	  return list;
////	  }
////
////
////}
