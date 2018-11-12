##【数据库三范式】

- 1.保持每列字段的原子性
    保存用户的地址不用一个字段address来保存，而是用几个字段组成，比如：country，province，city，location

- 2.在第一范式基础上，确保表中的每列都和主键相关（保持表的纯粹，即保持表的原子性）
    一个表中只能保存一类数据，不可以把多类数据保存在同一张数据库表中，比如，学生信息表里不应该有成绩字段
    
- 3.在第二范式基础上，每列字段都和主键直接关系，而不是间接关系
    字段之间不能相互依赖
    
## jdbc连接Url格式：    
    jdbc:mysql://[host:port]/[database]
    jdbc:mysql://localhost:3306/DBTest
    
## jdbc驱动下载
    https://dev.mysql.com/downloads/connector/j/

## sql语句  
    
```mysql
create database DBTest;
use DBTest;
create table student(
	id			int			primary key,
    sname		nvarchar(50)	not null,
    age			int,
    class		nvarchar(50)
);

create table stuSubject(
	id				int			primary key,
    sid				int,
    subject_name	nvarchar(100)	not null,
    foreign key(sid) references student(id) on delete cascade on update cascade
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

-- 全表左连接
select * from student s left


 join stuSubject b on s.id = b.sid;
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