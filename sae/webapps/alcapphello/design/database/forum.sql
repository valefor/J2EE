/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/5/23 3:24:14                            */
/*==============================================================*/


drop table if exists User_Role;

drop table if exists Authority;

drop table if exists Reply;

drop table if exists Topic;

drop table if exists Section_Master;

drop table if exists Section;

drop table if exists User;

/*==============================================================*/
/* Table: Authority                                             */
/*==============================================================*/
create table Authority
(
   role                 varchar(50) not null,
   primary key (role)
);

/*==============================================================*/
/* Table: Reply                                                 */
/*==============================================================*/
create table Reply
(
   id                   int not null,
   userId               int not null,
   sectionId            int not null,
   topicId              int not null,
   content              varchar(1000),
   time                 datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: Section                                               */
/*==============================================================*/
create table Section
(
   id                   int not null,
   name                 varchar(20) not null,
   profile              varchar(200),
   statement            varchar(200),
   topicCount           int,
   clickCount           int,
   primary key (id)
);

/*==============================================================*/
/* Table: Section_Master                                        */
/*==============================================================*/
create table Section_Master
(
   id                   int not null,
   sectionId            int not null,
   primary key (id, sectionId)
);

/*==============================================================*/
/* Table: Topic                                                 */
/*==============================================================*/
create table Topic
(
   id                   int not null,
   sectionId            int not null,
   userId               int not null,
   replyCount           int,
   face                 varchar(100),
   title                varchar(100),
   content              varchar(1000),
   postTime             datetime,
   lastUpdateTime       datetime,
   clickCount           int,
   status               int,
   lastReplayTime       datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   id                   int not null,
   name                 varchar(255) not null,
   password             varchar(100) not null,
   email                varchar(100) not null,
   birthday             datetime,
   sex                  int,
   avatar               varchar(255),
   remark               varchar(100),
   regDate              datetime,
   status               int,
   point                int,
   isSectioner          int,
   primary key (id)
);

/*==============================================================*/
/* Table: User_Role                                             */
/*==============================================================*/
create table User_Role
(
   id                   int not null,
   role                 varchar(50) not null,
   primary key (id, role)
);

alter table Reply add constraint FK_Section_Reply foreign key (sectionId)
      references Section (id) on delete restrict on update restrict;

alter table Reply add constraint FK_Topic_Reply foreign key (topicId)
      references Topic (id) on delete restrict on update restrict;

alter table Reply add constraint FK_User_Reply foreign key (userId)
      references User (id) on delete restrict on update restrict;

alter table Section_Master add constraint FK_sectionId foreign key (id)
      references User (id) on delete restrict on update restrict;

alter table Section_Master add constraint FK_userId foreign key (sectionId)
      references Section (id) on delete restrict on update restrict;

alter table Topic add constraint FK_Section_Topic foreign key (sectionId)
      references Section (id) on delete restrict on update restrict;

alter table Topic add constraint FK_User_Topic foreign key (userId)
      references User (id) on delete restrict on update restrict;

alter table User_Role add constraint FK_role foreign key (id)
      references User (id) on delete restrict on update restrict;

alter table User_Role add constraint FK_userId2 foreign key (role)
      references Authority (role) on delete restrict on update restrict;

