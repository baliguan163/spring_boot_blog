package com.company.project.web;

import com.company.project.model.Blog;
import com.company.project.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * 首页
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @Autowired
    private BlogService blogService;
    /**
     * 后台主页
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String admin(Model model) {
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "front/index";
    }

//    /**
//     * 登录模块
//     * @return
//     */
//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    public String login(){
//        return "admin/login";
//    }
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
//    @RequestMapping(value = "/delete/{id}")
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
//	@ResponseBody
//	@RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
//	public int addUser(User user){
//	    return userService.addUser(user);
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
//	public Object findUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
//		return userService.findUser(pageNum,pageSize);
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
//	public Object findAllUser(){
//		return userService.findAllUser();
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/select/{id}", produces = {"application/json;charset=UTF-8"})
//	public Object selectByPrimaryKey(@PathVariable("id") int id){
//		return userService.selectByPrimaryKey(id);
//	}

}


//@RestController
//public class UserController {
//
//   @Autowired
//   private UserService userService;
//
//	/**
//	 * 需求:返回json格式数据
//	 */
//	@RequestMapping("hello")
//	public String showHello() {
//		return "hello world!";
//	}
//
//	/**
//	 * 需求：返回一个POJO对象
//	 */
//	@RequestMapping("pojo")
//	public User showUser() {
//		User user = new User();
//		user.setId(1);
//		user.setName("张三丰");
//		user.setSex("男");
//		user.setBirthday(new Date());
//		user.setAddress("武当山");
//		return user;
//	}
//
//	@RequestMapping("maps")
//	public Map<String,Object> showMaps() {
//		Map<String, Object> maps = new HashMap<String, Object>();
//		maps.put("username", "张无忌");
//		maps.put("age", "19");
//		return maps;
//	}
//
//	@RequestMapping("list")
//	public List<User> showList() {
//		List<User> uList = new ArrayList<User>();
//		User user = new User();
//		user.setId(1);
//		user.setName("张三丰1");
//		user.setSex("男");
//		user.setBirthday(new Date());
//		user.setAddress("武当山");
//
//		User user2 = new User();
//		user2.setId(2);
//		user2.setName("张三丰2");
//		user2.setSex("男");
//		user2.setBirthday(new Date());
//		user2.setAddress("武当山");
//
//		uList.add(user);
//		uList.add(user2);
//		return uList;
//	}
//
//
//	//整合Mybatis操作
//	@RequestMapping("ssm")
//	public List<User> findAll(){
//	  List<User> list = userService.findAll();
//	  return list;
//	  }
//
//
//}
