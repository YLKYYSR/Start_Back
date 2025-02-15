package com.sparkle.start_project.Domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sparkle
 * @since 2025-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userPassword;

    private String userName;

    private LocalDateTime creatTime;

    private LocalDateTime updatTime;

    @ApiModelProperty(value = "删除1， 不删除0")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "user 0, admin 1")
    private Integer userRole;

    private String userUrl;

//    @ApiModelProperty(value = "男0 女1")
    private Integer gender;

    @ApiModelProperty(value = "正常0 ，异常1")
    private Integer userStatus;

    private String email;


}
