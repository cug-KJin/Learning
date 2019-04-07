# learning
此文件夹用于学习spring相关框架
## Spring 能帮我们做什么
①.Spring 能帮我们根据配置文件创建及组装对象之间的依赖关系。  
②.Spring 面向切面编程能帮助我们无耦合的实现日志记录，性能统计，安全控制。  
③.Spring 能非常简单的帮我们管理数据库事务。  
④.Spring 还提供了与第三方数据访问框架（如Hibernate、JPA）无缝集成，而且自己也提供了一套JDBC访问模板来方便数据库访问。  
⑤.Spring 还提供与第三方Web（如Struts1/2、JSF）框架无缝集成，而且自己也提供了一套Spring MVC框架，来方便web层搭建。  
⑥.Spring 能方便的与Java EE（如Java Mail、任务调度）整合，与更多技术整合（比如缓存框架）。
## 为什么使用 MyBatis
在我们传统的 JDBC 中，我们除了需要自己提供 SQL 外，还必须操作 Connection、Statment、ResultSet，不仅如此，为了访问不同的表，不同字段的数据，我们需要些很多雷同模板化的代码，闲的繁琐又枯燥。

而我们在使用了 MyBatis 之后，只需要提供 SQL 语句就好了，其余的诸如：建立连接、操作 Statment、ResultSet，处理 JDBC 相关异常等等都可以交给 MyBatis 去处理，我们的关注点于是可以就此集中在 SQL 语句上，关注在增删改查这些操作层面上。

并且 MyBatis 支持使用简单的 XML 或注解来配置和映射原生信息，将接口和 Java 的 POJOs(Plain Old Java Objects,普通的 Java对象)映射成数据库中的记录。


## Spring Web MVC优势
1、清晰的角色划分：前端控制器（DispatcherServlet）、请求到处理器映射（HandlerMapping）、处理器适配器（HandlerAdapter）、视图解析器（ViewResolver）、处理器或页面控制器（Controller）、验证器（   Validator）、命令对象（Command  请求参数绑定到的对象就叫命令对象）、表单对象（Form Object 提供给表单展示和提交到的对象就叫表单对象）。

2、分工明确，而且扩展点相当灵活，可以很容易扩展，虽然几乎不需要；

3、由于命令对象就是一个POJO，无需继承框架特定API，可以使用命令对象直接作为业务对象；

4、和Spring 其他框架无缝集成，是其它Web框架所不具备的；

5、可适配，通过HandlerAdapter可以支持任意的类作为处理器；

6、可定制性，HandlerMapping、ViewResolver等能够非常简单的定制；

7、功能强大的数据验证、格式化、绑定机制；

8、利用Spring提供的Mock对象能够非常简单的进行Web层单元测试；

9、本地化、主题的解析的支持，使我们更容易进行国际化和主题的切换。

10、强大的JSP标签库，使JSP编写更容易。
## ssm
