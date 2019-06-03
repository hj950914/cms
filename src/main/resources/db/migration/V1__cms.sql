CREATE TABLE uc_user
(
  id            BIGINT AUTO_INCREMENT COMMENT '主键',
  login         VARCHAR(32) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户名',
  email         VARCHAR(64) CHARACTER SET utf8mb4 NULL COMMENT '邮箱',
  phone         VARCHAR(32)                       NULL COMMENT '手机号',
  password      VARCHAR(20)                       NOT NULL DEFAULT '' COMMENT '密码',
  status        VARCHAR(16)                       NOT NULL COMMENT '用户状态',
  nick_name     VARCHAR(32) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '昵称',
  created_by    VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '创建人',
  modified_by   VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '更新人',
  created_time  TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  modified_time TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE INDEX (login),
  UNIQUE INDEX (email),
  UNIQUE INDEX (phone)
) ENGINE = InnoDB
  DEFAULT CHARSET = ascii COMMENT '用户表';
