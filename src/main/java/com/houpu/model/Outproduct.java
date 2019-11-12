package com.houpu.model;

import lombok.Data;

@Data
public class Outproduct {
   /*
    `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '出库编号',
  `p_id` int(11) NULL DEFAULT NULL COMMENT '产品编号',
  `o_int` int(11) NULL DEFAULT NULL COMMENT '数量',
  `o_time` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4
  `e_id` int(11) NULL DEFAULT NULL COMMENT '出库申请人',
  `o_eid` int(11) NULL DEFAULT NULL COMMENT '经办人',
  `o_remark` varchar(200) CHARACTER SET utf8mb4 CO'出库备注说明',
    */
    private  int  o_id;
    private  int  p_id;
    private  int  o_int;
    private  String  o_time;
    private  int  e_id;
    private  int  o_eid;
    private  String  o_remark;

    private Product product;
    private Client client;

}
