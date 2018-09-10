blog
blog_label
comment
fans
label
place
user
userinfo
-------------------------


CREATE DATABASE blog;
use blog;

-- ----------------------------
-- 1 Table structure for `blog`
-- blog记录博客信息。包括博客id，博客标题，内容，所属用户id，创建日期，访问量。
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_title` varchar(100) NOT NULL,
  `blog_text` text NOT NULL,
  `blog_visit` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `blog_date` date DEFAULT NULL,
  `blog_pv` int(11) DEFAULT NULL,
  PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO blog(blog_title,blog_text,blog_visit,user_id,blog_date,blog_pv)
VALUES ('测试','测试内容测试内容测试内容',0,1,'20180905',0);

INSERT INTO blog(blog_title,blog_text,blog_visit,user_id,blog_date,blog_pv)
VALUES ('浅议李自成败亡的三个致命错误','浅议李自成败亡的三个致命错误浅议李自成败亡的三个致命错误浅议李自成败亡的三个致命错误浅议李自成败亡的三个致命错误',0,1,'20180905',0);







-- ----------------------------
-- 2 Table structure for `blog_label`
-- blog_label表是blog和label的连接表，包括id主键，博客id和标签id。
-- （记录博客对应哪个标签，一个博客可能有多个标签）
-- ----------------------------
DROP TABLE IF EXISTS `blog_label`;
CREATE TABLE `blog_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_id` int(11) DEFAULT NULL,
  `label_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- 3 Table structure for `comment`
-- Comment表记录评论。包括id，父id，博客id，所属用户id，内容，日期，是否有回复
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `father_id` int(11) NOT NULL,
  `blog_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `content` text,
  `date` datetime DEFAULT NULL,
  `have_reply` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- 4 Table structure for `fans`
-- Fans表记录关注情况。包括id主键，userId，noticerid，date。
-- 关系是userId关注noticerId，通过这个关系我们就可以得到粉丝列表和关注列表
-- ----------------------------
DROP TABLE IF EXISTS `fans`;
CREATE TABLE `fans` (
  `user_id` int(11) NOT NULL,
  `noticer_id` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;




-- ----------------------------
-- 5 Table structure for `label`
-- abel表记录标签。包括标签id，标签名称，所属用户id
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label` (
  `label_id` int(11) NOT NULL AUTO_INCREMENT,
  `label_title` varchar(30) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`label_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-- ----------------------------
-- 6 Table structure for `place`
-- Place表记录省市区。
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place` (
  `place_id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`place_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-- ----------------------------
-- 7 Table structure for `user`
-- User表记录用户id，账号和密码。
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) DEFAULT NULL,
  `user_password` char(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO user(user_account,user_password) VALUES ('admin','123456');
INSERT INTO user(user_account,user_password) VALUES ('admin001','123456');
INSERT INTO user(user_account,user_password) VALUES ('admin002','123456');
INSERT INTO user(user_account,user_password) VALUES ('admin003','123456');

-- ----------------------------
-- 8 Table structure for `userinfo`
-- UserInfo表记录用户信息。包括用户id，用户昵称，性别，生日，职业，邮箱，省市区id，自我介绍，用户头像，
-- 最近登录时间，主页访问量
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userinfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_sex` tinyint(1) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_job` varchar(20) DEFAULT NULL,
  `user_post` varchar(50) DEFAULT NULL,
  `user_introduction` text,
  `user_place` int(11) DEFAULT NULL,
  `user_image` varchar(50) DEFAULT NULL,
  `user_recent_login_time` datetime DEFAULT NULL,
  `user_PV` int(11) DEFAULT NULL,
  PRIMARY KEY (`userinfo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



-----------------------------------------------------------------------------
CREATE DATABASE mytest;
use mytest;
CREATE TABLE t_user(
  user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  phone VARCHAR(255) NOT NULL
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT t_user VALUES (0 ,'000','123456','18569844520');
INSERT t_user VALUES (1 ,'002','123456','18569844521');
INSERT t_user VALUES (2 ,'002','123456','18569844522');
INSERT t_user VALUES (3 ,'003','123456','18569844523');
INSERT t_user VALUES (4 ,'004','123456','18569844524');
INSERT t_user VALUES (5 ,'005','123456','18569844525');
INSERT t_user VALUES (6 ,'006','123456','18569844526');
INSERT t_user VALUES (7 ,'007','123456','18569844527');
INSERT t_user VALUES (8 ,'008','123456','18569844528');
INSERT t_user VALUES (9 ,'009','123456','18569844529');

//get post
http://localhost:8099/user/add
private Integer userId;
private String userName;
private String password;
private String phone;

//get post
http://localhost:8099/user/all
//get post
http://localhost:8099/user/all/2/3
//get post
http://localhost:8099/user/select/3