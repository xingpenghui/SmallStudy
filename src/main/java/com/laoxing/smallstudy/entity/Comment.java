package com.laoxing.smallstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @TableId(value = "cmid", type = IdType.AUTO)
    private Integer cmid;

    /**
     * 用户openid
     */
    private String uid;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 平均内容
     */
    private String ccontent;

    /**
     * 书籍名
     */
    private String bkname;

    /**
     * 书籍id
     */
    private Integer bkid;

    /**
     * 用户头像
     */
    private String uavarta;

    /**
     * 评论时间
     */
    private Date ctime;

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }
    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }
    public Integer getBkid() {
        return bkid;
    }

    public void setBkid(Integer bkid) {
        this.bkid = bkid;
    }
    public String getUavarta() {
        return uavarta;
    }

    public void setUavarta(String uavarta) {
        this.uavarta = uavarta;
    }
    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    protected Serializable pkVal() {
        return this.cmid;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "cmid=" + cmid +
        ", uid=" + uid +
        ", uname=" + uname +
        ", ccontent=" + ccontent +
        ", bkname=" + bkname +
        ", bkid=" + bkid +
        ", uavarta=" + uavarta +
        ", ctime=" + ctime +
        "}";
    }
}
