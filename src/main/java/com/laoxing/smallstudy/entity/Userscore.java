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
public class Userscore extends Model<Userscore> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String uid;

    private Integer score;

    private String info;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userscore{" +
        "id=" + id +
        ", uid=" + uid +
        ", score=" + score +
        ", info=" + info +
        ", ctime=" + ctime +
        "}";
    }
}
