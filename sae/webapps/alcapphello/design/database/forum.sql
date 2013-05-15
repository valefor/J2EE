/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2013/5/16 0:36:12                            */
/*==============================================================*/


drop table if exists Reply;

drop table if exists Section_Master;

drop table if exists Topic;

drop table if exists Section;

drop table if exists User;

/*==============================================================*/
/* Table: Reply                                                 */
/*==============================================================*/
create table Reply
(
   RID                  int not null auto_increment,
   UID                  int not null,
   SID                  int not null,
   TID                  int not null,
   RContent             text,
   RTime                datetime,
   primary key (RID)
);

/*==============================================================*/
/* Table: Section                                               */
/*==============================================================*/
create table Section
(
   SID                  int not null auto_increment,
   SName                varchar(20) not null,
   SProfile             varchar(200),
   SStatement           varchar(200),
   STopicCount          int,
   SClickCount          int,
   primary key (SID)
);

/*==============================================================*/
/* Table: Section_Master                                        */
/*==============================================================*/
create table Section_Master
(
   UID                  int not null,
   SID                  int not null,
   primary key (UID, SID)
);

/*==============================================================*/
/* Table: Topic                                                 */
/*==============================================================*/
create table Topic
(
   TID                  int not null auto_increment,
   SID                  int not null,
   UID                  int not null,
   TReplyCount          int,
   TFace                varchar(100),
   TTitle               varchar(100),
   TContent             text,
   TPostTime            datetime,
   TLastUpdateTime      datetime,
   TClickCount          int,
   TStatus              int,
   TLastReplayTime      datetime,
   primary key (TID)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   UID                  int not null auto_increment,
   UName                varchar(255) not null,
   UPassword            varchar(100) not null,
   UEmail               varchar(100) not null,
   UBirthday            datetime,
   USex                 int,
   UAvatar              longblob,
   URemark              varchar(100),
   URegDate             datetime,
   UStatus              int,
   UPoint               int,
   UIsSectioner         int,
   primary key (UID)
);

alter table Reply add constraint FK_Section_Reply foreign key (SID)
      references Section (SID) on delete restrict on update restrict;

alter table Reply add constraint FK_Topic_Reply foreign key (TID)
      references Topic (TID) on delete restrict on update restrict;

alter table Reply add constraint FK_User_Reply foreign key (UID)
      references User (UID) on delete restrict on update restrict;

alter table Section_Master add constraint FK_Section_Master foreign key (UID)
      references User (UID) on delete restrict on update restrict;

alter table Section_Master add constraint FK_Section_Master2 foreign key (SID)
      references Section (SID) on delete restrict on update restrict;

alter table Topic add constraint FK_Section_Topic foreign key (SID)
      references Section (SID) on delete restrict on update restrict;

alter table Topic add constraint FK_User_Topic foreign key (UID)
      references User (UID) on delete restrict on update restrict;

