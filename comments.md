### 完成度：
* 功能实现比例低于三分之二

__Details:__

- \- TeamController.java:12 缺少查询分组的接口
- \- TeamController.java:27 无法进行分组
- \- TeamController.java:26 bug，新增的member，无法进行分组
- \- MemberController.java:23 bug，所有的id均为1
- \- MemberController.java:24 bug，新增的member无法显示出来

### 知识点：
* 加深对DTO的理解，考虑一下什么情况下才需要引入DTO
* 了解下Lombok
* 了解下restful命名规范
* 如果不是特定的自定义返回结果，ResponseEntity可以省略
* 了解下三层架构
* 打乱顺序可以了解下Collections.shuffle()

__Details:__
- \- Member.java:3 Member与Team应该属于entity
- \- TeamController.java:14  controller未加@RestController
- \- TeamController.java:22 根据restful规范，path中的名词，一般是指定资源的名词
- \- MemberController.java:14 建议Ioc容器管理的bean之间的注入，使用构造器注入
- \- MemberService.java:11 数据存储相关的操作，不属于service的职责，应该抽取repository层做

### 工程实践：
__Details:__
- \- MemberService.java:39 这种i++的自增id的方式存在线程安全问题，内存中自增可以试试AtomicInteger

### 综合：
__Details:__
+ \+ TeamController.java:13 有意识的将member和team两个资源


