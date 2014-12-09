create table CONFIG_INFO
(
  ID          VARCHAR2(20) not null,
  PACKAGE_NAME VARCHAR2(30),
  CLASS_NAME VARCHAR2(20),
  SQL         VARCHAR2(1000)
);
-- Add comments to the table
comment on table CONFIG_INFO
  is '基础信息配置表';
-- Add comments to the columns
comment on column CONFIG_INFO.ID
  is '主键';
comment on column CONFIG_INFO.PACKAGE_NAME
  is '包命';
comment on column CONFIG_INFO.CLASS_NAME
  is '类名';
comment on column CONFIG_INFO.SQL
  is 'sql语句';
-- Create/Recreate primary, unique and foreign key constraints
alter table CONFIG_INFO
  add constraint CONFIG_PK primary key (ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

create or replace public synonym CONFIG_INFO for CONFIG_INFO ;