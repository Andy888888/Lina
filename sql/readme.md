
## 未完待续
- Properties extend Hashtable
- getResourceAsStream 没有加载最新
- Spring
- 存储过程


##【数据库三范式】

- 1.保持每列字段的原子性<br/>
    保存用户的地址不用一个字段address来保存，而是用几个字段组成，比如：country，province，city，location

- 2.在第一范式基础上，确保表中的每列都和主键相关（保持表的纯粹，即保持表的原子性）<br/>
    一个表中只能保存一类数据，不可以把多类数据保存在同一张数据库表中，比如，学生信息表里不应该有成绩字段
    
- 3.在第二范式基础上，每列字段都和主键直接关系，而不是间接关系<br/>
    字段之间不能相互依赖
    
## jdbc连接Url格式：    
    jdbc:mysql://[host:port]/[database]
    jdbc:mysql://localhost:3306/DBTest
    
## jdbc驱动下载
    https://dev.mysql.com/downloads/connector/j/
    
## command line
    mysql -u root -p                    登录
    show full processlist;              显示完整的进程列表
    show processlist;                   显示简单进程列表

## sql语句 

#### left outer join  (outer可省略)
    理解: 左连接. 以左边表为基准，右边表数据可能为空
    格式: select * from [左表] [左表别名] left join [右表] [右表别名] on [左表别名].[左表关联字段] = [右表别名].[右表关联字段]
    例子: select * from student s left join stuSubject b on s.id = b.sid;
    
#### right outer join  (outer可省略)
    与left outer join 相反
    
#### inner join
    理解: 内连接. 两张关联表都有数据的才会被查出
    格式: select * from [左表] [左表别名] inner join [右表] [右表别名] on [左表别名].[左表关联字段] = [右表别名].[右表关联字段]
    例子: select * from student s inner join stuSubject b on s.id = b.sid;

#### group by
    理解: 从英文上理解  就是分组的意思。需要和  聚合函数（例如：max（），count（），avg（）等）
        配合使用，使用时至少有一个分组标识字段（例如某一列的列名）
    格式: select [聚合函数],[分组字段] from [表名] group by [分组字段];
    例子: select count(id),subject_name from stuSubject group by subject_name;
    
#### order by
    理解: 从英文上理解就是排序。一般后面跟上某一列的列名，然后查询到的数据会以该列的
        大小顺序进行排序显示，默认的是ASC（从小到大排列），desc（大到小排列）
    格式: select * from [表名] order by [要排序的字段];
    例子: select * from student order by age;
    
#### where
    理解: 对查询到的内容进行筛选，where后面跟上限定条件，where使用在分组和排序之后. 
        简单理解:用在非分组限定条件
    例子: select * from student where sname='张三';
    
    
#### having
    理解: 作用是筛选满足条件的分组，即在分组之后过滤数据，条件中包含聚组函数，
        使用having条件显示特定的组，也可以使用多个分组标准进行分组. 
        简单理解:用在分组限定条件
    例子: select min(id),subject_name from stuSubject group by subject_name having subject_name!='语文'; 

### mysql语句示例
```mysql
create database DBTest;
use DBTest;
create table student(
    id            int             primary key,
    sname         nvarchar(50)    not null,
    age           int,
    class         nvarchar(50)
);

create table stuSubject(
    id                int             primary key,
    sid               int,
    subject_name      nvarchar(100)   not null,
    foreign key(sid)  references student(id) on delete cascade on update cascade
);

-- 插数据

use DBTest;
insert student values (1,'张三',20,'一年级');
insert student values (2,'李四',23,'一年级');
insert student values (3,'王五',25,'一年级');

insert stuSubject values (1,1,'语文');
insert stuSubject values (2,1,'数学');
insert stuSubject values (3,1,'化学');

insert stuSubject values (4,2,'语文');
insert stuSubject values (5,2,'物理');

insert stuSubject values (6,3,'语文');
insert stuSubject values (7,3,'历史');

-- 简单查询
select * from student;
select * from stuSubject;
select * from student where sname='张三';
select * from student order by age;

-- 查询按照学科分组后，每组最大的id
select max(id),subject_name from stuSubject group by subject_name;

select min(id),subject_name from stuSubject group by subject_name having subject_name!='语文';

-- 查询每个学科有多少
select count(id),subject_name from stuSubject group by subject_name;
-- select min(id),sid,subject_name from stuSubject group by subject_name order by sid;

-- 全表左连接
select * from student s left join stuSubject b on s.id = b.sid;
-- 选择字段左连接
select s.*,b.sid,b.subject_name from student s left join stuSubject b on s.id = b.sid;
-- 选择字段左连接 & 子查询
select * from 
(select s.*,b.sid,b.subject_name from student s left join stuSubject b on s.id = b.sid)
as m where id=1;

-- 测试外键关联字段的级联更新
select * from student where id=3;
select * from stuSubject where sid=3;

update student set id=3 where id=6;

select * from student where id=6;
select * from stuSubject where sid=6;

```