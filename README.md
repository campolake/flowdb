#一个基于列的嵌入式数据库的实现

##文件结构

+ api:面向对象的访问接口
+ command:命令结构
+ encrpt：数据加密
+ engine:数据执行引擎
+ expression:表达式解析
+ index:索引
+ result:查询结果返回
+ sql：sql解析
+ store:数据存储引擎
+ store.fs 文件操作相关
+ store.rtree 

##逻辑层次

 |   api   |    sql   		 |
 ------------------------------
 |parser   |index expression |
 -----------------------------
 |engine			     	 |
 -----------------------------
 |store                      |

可以将api的操作直接转化为字节码，而不是转化为sql，再转化为字节码，再由虚拟机执行，提高嵌入式执行时的效率。
也可以解释sql语句，将sql为字节码，由虚拟机执行

##包含的特性

select  67 + basemondy + moundy *0.9 from ply 

select * from ply where plyid = ?1 and plyName = ?2

insert into ply values('','','')

update ply set plyname=?1 [where plyid = ?2]

delete from ply where plyid = ?1

##测试用例
###事务测试
1、一致性
开启事务-修改-等待--提交
开启事务，读取-修改
这里读取到的应该是原来的值。
2、原子性、持久性
成功写A表、写B表失败此时应该回滚记录，让A回到原来的状态

###压力测试
1、批量写入1000条数据、跟sqlite对比
2、批量读取10000条数据，
3、开启事务读取和写入
4、大文件的读取和写入、并发测试、延迟加载性能测试




文件大小按照2G分包，为了演示效果 ，这个值可以配置。





 