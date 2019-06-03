CREATE TABLE cc_category
(
  id            BIGINT AUTO_INCREMENT COMMENT '主键',
  parentId      BIGINT                            NULL COMMENT '父级分类id',
  name          VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '名称',
  code          VARCHAR(64)                       NULL COMMENT '编号',
  level         INT                               NOT NULL COMMENT '层级（从1开始）',
  status        VARCHAR(32)                       NOT NULL COMMENT '状态',
  sort          INT                               NOT NULL DEFAULT 0 COMMENT '排序',
  created_by    VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '创建人',
  modified_by   VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '更新人',
  created_time  TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  modified_time TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE INDEX (code)
) ENGINE = InnoDB
  DEFAULT CHARSET = ascii COMMENT '类目表';

CREATE TABLE cc_content
(
  id            BIGINT AUTO_INCREMENT COMMENT '主键',
  sn            VARCHAR(64)                        NOT NULL COMMENT '序列号',
  title         VARCHAR(128) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '标题',
  summary       VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '摘要',
  description   VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '描述',
  status        VARCHAR(32)                        NOT NULL COMMENT '状态',
  body          TEXT CHARACTER SET utf8mb4         NOT NULL COMMENT '正文',
  format        VARCHAR(32)                        NOT NULL COMMENT '正文格式',
  sort          INT                                NOT NULL DEFAULT 0 COMMENT '排序',
  created_by    VARCHAR(64) CHARACTER SET utf8mb4  NOT NULL COMMENT '创建人',
  modified_by   VARCHAR(64) CHARACTER SET utf8mb4  NOT NULL COMMENT '更新人',
  created_time  TIMESTAMP(3)                       NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  modified_time TIMESTAMP(3)                       NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE INDEX (sn)
) ENGINE = InnoDB
  DEFAULT CHARSET = ascii COMMENT '内容表';

CREATE TABLE cc_content_category
(
  id            BIGINT AUTO_INCREMENT COMMENT '主键',
  content_id    BIGINT                            NOT NULL COMMENT '内容ID',
  category_id   BIGINT                            NOT NULL COMMENT '分类ID',
  deleted       BIT                               NOT NULL DEFAULT b'0' COMMENT '是否被删除（0-否，1-是）',
  created_by    VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '创建人',
  modified_by   VARCHAR(64) CHARACTER SET utf8mb4 NOT NULL COMMENT '更新人',
  created_time  TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  modified_time TIMESTAMP(3)                      NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  PRIMARY KEY (id),
  UNIQUE INDEX (content_id, category_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = ascii COMMENT '内容分类表';