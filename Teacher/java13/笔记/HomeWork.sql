`course`
/*******初始化学生表的数据******/
INSERT INTO student VALUES ('s001','张三',23,'男');
INSERT INTO student VALUES ('s002','李四',23,'男');
INSERT INTO student VALUES ('s003','吴鹏',25,'男');
INSERT INTO student VALUES ('s004','琴沁',20,'女');
INSERT INTO student VALUES ('s005','王丽',20,'女');
INSERT INTO student VALUES ('s006','李波',21,'男');
INSERT INTO student VALUES ('s007','刘玉',21,'男');
INSERT INTO student VALUES ('s008','萧蓉',21,'女');
INSERT INTO student VALUES ('s009','陈萧晓',23,'女');
INSERT INTO student VALUES ('s010','陈美',22,'女');
COMMIT;
/******************初始化教师表***********************/
INSERT INTO teacher VALUES ('t001', '刘阳');
INSERT INTO teacher VALUES ('t002', '谌燕');
INSERT INTO teacher VALUES ('t003', '胡明星');
COMMIT;
/***************初始化课程表****************************/
INSERT INTO course VALUES ('c001','J2SE','t002');
INSERT INTO course VALUES ('c002','Java Web','t002');
INSERT INTO course VALUES ('c003','SSH','t001');
INSERT INTO course VALUES ('c004','Oracle','t001');
INSERT INTO course VALUES ('c005','SQL SERVER 2005','t003');
INSERT INTO course VALUES ('c006','C#','t003');
INSERT INTO course VALUES ('c007','JavaScript','t002');
INSERT INTO course VALUES ('c008','DIV+CSS','t001');
INSERT INTO course VALUES ('c009','PHP','t003');
INSERT INTO course VALUES ('c010','EJB3.0','t002');
COMMIT;
/***************初始化成绩表***********************/
INSERT INTO sc VALUES ('s001','c001',78.9);
INSERT INTO sc VALUES ('s002','c001',80.9);
INSERT INTO sc VALUES ('s003','c001',81.9);
INSERT INTO sc VALUES ('s004','c001',60.9);
INSERT INTO sc VALUES ('s001','c002',82.9);
INSERT INTO sc VALUES ('s002','c002',72.9);
INSERT INTO sc VALUES ('s003','c002',81.9);
INSERT INTO sc VALUES ('s001','c003','59');
COMMIT;


-- 1、查询“c001”课程比“c002”课程成绩高的所有学生的学号；
SELECT a.sno FROM 
	(SELECT sno,score FROM sc WHERE cno = 'c001') a,
	(SELECT sno,score FROM sc WHERE cno = 'c002') b
WHERE
	a.score > b.score
AND
	a.sno = b.sno
-- 2、查询平均成绩大于60 分的同学的学号和平均成绩；
SELECT 
	sno 学号,AVG(score) 平均成绩
FROM 
	sc
GROUP BY
	sno 
HAVING 
	AVG(score) > 60;
-- 3、查询所有同学的学号、姓名、选课数、总成绩；
SELECT 
	student.sno 学号, 
	student.sname 姓名,
	COUNT(sc.sno) 选课数,
	SUM(sc.score) 总成绩
FROM 
	student LEFT JOIN sc ON student.sno = sc.sno
GROUP BY
	student.sno,student.sname
-- 4、查询姓“刘”的老师的个数；
SELECT 
	COUNT(DISTINCT(tname))
FROM
	teacher
WHERE
	tname LIKE '刘%'
-- 5、查询没学过“谌燕”老师课的同学的学号、姓名；

SELECT 
	student.sno 学号,
	student.sname 姓名 
FROM 
	student
WHERE
	sno NOT IN 
	(SELECT 
		DISTINCT(sc.`sno`) 
	FROM 
		sc,
		teacher,
		course
	WHERE 
		sc.`cno` = course.`cno`
		AND
		teacher.`tno`= course.`tno`
		AND
		teacher.`tname` = '谌燕');
-- 6、查询学过“c001”并且也学过编号“c002”课程的同学的学号、姓名；
SELECT 
	student.`sno`,student.`sname`
FROM
	student
WHERE
	sno IN(SELECT sno
		FROM sc
		WHERE cno = 'c001')
AND sno IN(SELECT sno
		FROM sc
		WHERE cno = 'c002');
-- 7、查询学过“谌燕”老师所教的所有课的同学的学号、姓名；
use iweb_test
SELECT 
	student.sno 学号,
	student.sname 姓名 
FROM 
	student
WHERE
	sno IN 
	(SELECT 
		DISTINCT(sc.`sno`) 
	FROM 
		sc,
		teacher,
		course
	WHERE 
		sc.`cno` = course.`cno`
		AND
		teacher.`tno`= course.`tno`
		AND
		teacher.`tname` = '谌燕');
-- 8、查询课程编号“c002”的成绩比课程编号“c001”课程低的所有同学的学号、姓名；
SELECT 
	sno 学号,
	sname 姓名
FROM 
	student
WHERE
	sno
	IN
	(
		SELECT a.sno FROM sc a,sc b
		WHERE
			a.`cno`='c001'
			AND
			b.`cno`='c002'
			AND
			a.`sno`=b.`sno`
			AND
			a.`score`=b.`score`
	)
-- 9、查询所有课程成绩小于60 分的同学的学号、姓名；
SELECT sno,sname FROM student
WHERE sno IN
	(
		SELECT sno FROM sc
		WHERE score <60
		GROUP BY sno
	)
-- 10、查询没有学全所有课的同学的学号、姓名；
SELECT student.`sno`,student.`sname`
FROM student,sc
WHERE
	student.`sno` = sc.`sno`
GROUP BY 
	student.`sno`,student.`sname`
HAVING
	COUNT(cno)<(SELECT COUNT(cno) FROM course)
-- 11、查询至少有一门课与学号为“s001”的同学所学相同的同学的学号和姓名；
SELECT DISTINCT student.sno,student.sname FROM student
LEFT JOIN sc
ON student.sno= sc.`sno`
WHERE sc.`cno` IN(
SELECT cno FROM sc WHERE sno='s001'
)AND student.`sno`!='s001';
-- 12、查询至少学过学号为“s001”同学所有一门课的其他同学学号和姓名；
SELECT DISTINCT student.`sno`,student.`sname`
FROM student,sc
WHERE student.`sno` = sc.`sno` AND cno IN(SELECT cno FROM sc WHERE sno = 's001');
-- 13、把“SC”表中“谌燕”老师教的课的成绩都更改为此课程的平均成绩；
/*update sc set sc = savg
from sc,(
select avg(sc) as savg,a.cno from sc a,course b,teacher c
where a.`cno`= b.`cno` and b.`tno`= c.`tno` and tname = '谌燕'
group by a.`cno`
)d 
where sc.`cno`= d.cno*/
-- 14、查询和“s001”号的同学学习的课程完全相同的其他同学学号和姓名；
SELECT DISTINCT sc.`sno`,sname
FROM sc
JOIN student AS s
ON sc.`sno` = s.`sno`
WHERE sc.`sno`!= 's001'
AND cno IN
	(
		SELECT DISTINCT cno
		FROM sc
		WHERE sno='s001'
	)
GROUP BY sc.`sno`
HAVING COUNT(DISTINCT sc.`cno`)
=(SELECT COUNT(DISTINCT cno) FROM sc WHERE sno='s001')
-- 15、删除学习“谌燕”老师课的SC 表记录；
DELETE FROM sc WHERE cno=
(
SELECT cno FROM course a, teacher b WHERE a.`tno`=b.`tno` AND b.`tname`='谌燕'
)
-- 16、向SC 表中插入一些记录，这些记录要求符合以下条件：没有上过编号“c002”课程的同学学号、“c002”号课的平均成绩；
-- 17、查询各科成绩最高和最低的分：以如下形式显示：课程ID，最高分，最低分

SELECT 
	sc.`cno`,
	c.cname,
	MAX(score),
	MIN(score)
FROM
	sc
LEFT JOIN
	course AS c
ON 	sc.`cno` = c.cno

-- 18、按各科平均成绩从低到高和及格率的百分数从高到低顺序
	-- select
	--     sc.cno
	--     avg(score) as avg_score,
	--     sum(if(score)>=60,1,0)/count(score) as pass_rate
	-- from sc
	-- group by cno
	-- order by avg_score asc,pass_rate desc
-- 19、查询不同老师所教不同课程平均分从高到低显示
SELECT 
	tno,
	AVG(score) AS avg_score
FROM
	sc
LEFT JOIN course AS c
ON sc.`cno` = c.cno
GROUP BY c.tno
ORDER BY avg_score DESC;

-- 20、统计列印各科成绩,各分数段人数:课程ID,课程名称,[100-85],[85-70],[70-60],[ <60]
SELECT 
	sc.cno
	,cname
	,SUM(CASE WHEN score>=85 AND score<=100 THEN 1 ELSE 0 END)/COUNT(score) AS '[85-100]'
	,SUM(CASE WHEN score>=70 AND score<85   THEN 1 ELSE 0 END)/COUNT(score) AS '[70-85 )'
	,SUM(CASE WHEN score>=60 AND score<70   THEN 1 ELSE 0 END)/COUNT(score) AS '[60-70 )'
	,SUM(CASE WHEN score>=0  AND score<60   THEN 1 ELSE 0 END)/COUNT(score) AS '[0 -60 )'
FROM sc
LEFT JOIN course AS c 
ON sc.cno = c.cno
GROUP BY sc.cno
-- 21、查询各科成绩前三名的记录:(不考虑成绩并列情况)

-- 22、查询每门课程被选修的学生数
SELECT cno,COUNT(DISTINCT sno) AS cnt
FROM sc
GROUP BY cno
-- 23、查询出只选修了一门课程的全部学生的学号和姓名
SELECT sc.`sno`,s.sname
FROM sc
LEFT JOIN student AS s
ON sc.`sno` = s.sno
GROUP BY sc.`sno`
HAVING COUNT(DISTINCT cno) = 1;
-- 24、查询男生、女生人数
SELECT 
	ssex,COUNT(ssex)
FROM
	student
GROUP BY
	ssex
-- 25、查询姓“张”的学生名单
SELECT * FROM student WHERE sname LIKE '张%';
-- 26、查询同名同性学生名单，并统计同名人数
SELECT
	sname,
	COUNT(sname) AS cnt
FROM
	student
GROUP BY
	sname
HAVING COUNT(sname) >= 2
-- 27、1981 年出生的学生名单(注：Student 表中Sage 列的类型是number)


-- 28、查询每门课程的平均成绩，结果按平均成绩升序排列，平均成绩相同时，按课程号降序排列

SELECT cno,AVG(score) AS avg_score
FROM sc
GROUP BY cno
ORDER BY avg_score,cno DESC;

-- 29、查询平均成绩大于85 的所有学生的学号、姓名和平均成绩
-- 30、查询课程名称为“数据库”，且分数低于60 的学生姓名和分数
-- 31、查询所有学生的选课情况；
-- 32、查询任何一门课程成绩在70 分以上的姓名、课程名称和分数；
-- 33、查询不及格的课程，并按课程号从大到小排列
-- 34、查询课程编号为c001 且课程成绩在80 分以上的学生的学号和姓名；
-- 35、求选了课程的学生人数
-- 36、查询选修“谌燕”老师所授课程的学生中，成绩最高的学生姓名及其成绩
-- 37、查询各个课程及相应的选修人数
-- 38、查询不同课程成绩相同的学生的学号、课程号、学生成绩
-- 39、查询每门功课成绩最好的前两名
-- 40、统计每门课程的学生选修人数（超过10 人的课程才统计）。要求输出课程号和选修人数，查询结果按人数降序排列，若人数相同，按课程号升序排列
SELECT cno,COUNT(DISTINCT sno) AS cnt
FROM sc
GROUP BY cno
HAVING cnt>10
ORDER BY cnt DESC,cno ASC
-- 41、检索至少选修两门课程的学生学号
SELECT cno,COUNT(DISTINCT cno) AS cnt
FROM sc
GROUP BY sno
HAVING COUNT(DISTINCT cno) >=2
-- 42、查询全部学生都选修的课程的课程号和课程名
-- 43、查询没学过“谌燕”老师讲授的任一门课程的学生姓名
-- 44、查询两门以上不及格课程的同学的学号及其平均成绩

SELECT sc.`sno`,s.`sname`,AVG(score) AS avg_score
FROM sc
LEFT JOIN student AS s
ON sc.`sno`= s.`sno`
WHERE score<60
GROUP BY sno
HAVING	COUNT(DISTINCT score)>=2


-- 45、检索“c004”课程分数小于60，按分数降序排列的同学学号
SELECT sno,score
FROM sc
WHERE cno = 'c004' AND score < 60
ORDER BY score DESC;
-- 46、删除“s002”同学的“c001”课程的成绩


