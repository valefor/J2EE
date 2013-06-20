/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     6/20/2013 3:04:13 PM                         */
/*==============================================================*/


drop table if exists user_role;

drop table if exists authority;

drop table if exists reply;

drop table if exists topic;

drop table if exists section_master;

drop table if exists section;

drop table if exists user;

/*==============================================================*/
/* Table: authority                                             */
/*==============================================================*/
create table authority
(
   role                 varchar(50) not null,
   primary key (role)
);

/*==============================================================*/
/* Table: reply                                                 */
/*==============================================================*/
create table reply
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
/* Table: section                                               */
/*==============================================================*/
create table section
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
/* Table: section_master                                        */
/*==============================================================*/
create table section_master
(
   id                   int not null,
   sectionId            int not null,
   primary key (id, sectionId)
);

/*==============================================================*/
/* Table: topic                                                 */
/*==============================================================*/
create table topic
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
/* Table: user                                                  */
/*==============================================================*/
create table user
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
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   id                   int not null,
   role                 varchar(50) not null,
   primary key (id, role)
);

alter table reply add constraint FK_section_reply foreign key (sectionId)
      references section (id) on delete restrict on update restrict;

alter table reply add constraint FK_topic_reply foreign key (topicId)
      references topic (id) on delete restrict on update restrict;

alter table reply add constraint FK_user_reply foreign key (userId)
      references user (id) on delete restrict on update restrict;

alter table section_master add constraint FK_sectionId foreign key (id)
      references user (id) on delete restrict on update restrict;

alter table section_master add constraint FK_userId foreign key (sectionId)
      references section (id) on delete restrict on update restrict;

alter table topic add constraint FK_section_topic foreign key (sectionId)
      references section (id) on delete restrict on update restrict;

alter table topic add constraint FK_user_topic foreign key (userId)
      references user (id) on delete restrict on update restrict;

alter table user_role add constraint FK_role foreign key (id)
      references user (id) on delete restrict on update restrict;

alter table user_role add constraint FK_userId2 foreign key (role)
      references authority (role) on delete restrict on update restrict;

