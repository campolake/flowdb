#一个基于列的嵌入式数据库的实现

##文件结构

api:面向对象的访问接口
command:命令结构
encrpt：数据加密
engine:数据执行引擎
expression:表达式解析
index:索引
result:查询结果返回
sql：sql解析
store:数据存储引擎
store.fs 文件操作相关
store.rtree 

##逻辑层次
---------------------
|   api   |    sql   |
---------------------
|parser index  expression
-----------------------
|engine			     |
------------------------
|store               |
----------------------