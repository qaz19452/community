## 社区
 用来做一个社区的应用
## 资料
Spring boot
## 工具
idea
## 接入一个GitHubapp
[Github app Guide](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)

## sql脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint TABLE_NAME_PK
		primary key (ID)
);
```