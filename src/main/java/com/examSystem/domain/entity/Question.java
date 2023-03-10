package com.examSystem.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 考题表(Question)表实体类
 *
 * @author makejava
 * @since 2023-02-22 21:42:25
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("question")
public class Question {
    //考题id
    @TableId
    private Long questionId;
    //x 选择题，t 填空题
    private String questionType;
    //题目内容
    private String context;
    //答案
    private String answer;
    @TableField(fill = FieldFill.INSERT)
    //创建时间
    private Date createTime;
    @TableField(fill = FieldFill.INSERT)
    //创建人
    private Long createBy;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    //更新人
    private Long updateBy;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    //更新时间
    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    private Integer delFlag;
    //A选项
    private String optionA;
    //B选项
    private String optionB;
    //C选项
    private String optionC;
    //D选项
    private String optionD;
    //该题得分
    private Integer point;


}

