/*�������ݿ�*/
drop database if exists financial ; 
create database financial;

/*�����Ӧ���ݿ�*/
use financial;

/*ע���û���Ϣ��*/
/*Ȩ��1����߹���Ա��Ȩ��2����ͥ�û�����Ա��Ȩ��3����ͨ�û�*/
/*���������ݿ�ؼ��ʣ�ע��*/
/*�Ա�1�����У�0����Ů*/
create table User(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
	ru int default 3,
	familyid int,
	telephone varchar(20),
	email varchar(100),
	sex int default 1,
	idcard varchar(40),
	role varchar(10),
    primary key(id)
);
/*֧����Ϣ��*/
create table OutInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	outcome double,
	outcometype varchar(16),
	outcomeuse varchar(16),
	members varchar(16),
	payouttime datetime,
	beneficiary varchar(50),
	information varchar(50),
	account varchar(16),
	primary key(id)
);
/*������Ϣ��*/
create table InInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	income double,
	incometype varchar(16),
	members varchar(16),
	incometime datetime,
	payer varchar(50),
	information varchar(50),
	account varchar(16),
    primary key(id)
);
/*�˻���*/
create table UserAccount(
    id int not null auto_increment,
    username varchar(16) not null,
	cash double,
	bankcard double, 
	balance double,
	borrowing double,
	primary key(id)
);

/*���п���Ϣ��*/
create table BankCardInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	banknumber varchar(50),
	bankname varchar(16),
	primary key(id)
);

/*֤ȯ��Ʊ�˻���Ϣ��*/
create table StockAccount(
    id int not null auto_increment,
    username varchar(16) not null,
	pwd varchar(16) not null,
	idcard varchar(40),
	telephone varchar(20),
	primary key(id)
);


/*֤ȯ��Ʊ��Ϣ��*/
create table StockInfo(
    id int not null auto_increment,
    username varchar(16) not null,
	stockcode int,
	stockname varchar(16),
	totalnumber int,
	primary key(id)
);

/*֤ȯ��Ʊ��ˮ��Ϣ��*/
create table StockFlow(
    id int not null auto_increment,
    username varchar(16) not null,
	stockcode int,
	stockname varchar(16),
	stocknumber int,
    BuyOrSell int,
	transactiontime datetime,
	transactionprince double,
	primary key(id)
);

/*�޸�����ʱ����֤��Ϣ���*/
create table checkpwd(
    username varchar(16) not null,
	checkcode varchar(1000),
	primary key(username)
);


/*������Լ��*/
/*alter table ���� add foreign key(qId) references QUESTIONS(id); */



/*�������ݿ�*/
/*mysqldump -u root -p123456 financial-> C:\backup.sql*/


/*��ԭ���ݿ�*/
/*mysql -u root -p123456 < C:\backup.sql*/


/*����MySQL��Զ���ʺ�-2������Զ�̵�½�û�����Ȩ*/
/*����벻�������ӵ� IP ������Ϊ��%�����ɡ�*/
/*grant all PRIVILEGES on ���ݿ���/���ݱ��� to root@'%'  identified by '123456';*/