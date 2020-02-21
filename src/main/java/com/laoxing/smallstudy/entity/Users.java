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
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 小程序下发给用户的openid
     */
    private String uid;

    /**
     * 用户的微信名
     */
    private String uname;

    /**
     * 用户的性别
     */
    private Integer ugender;

    /**
     * 用户地址
     */
    private String uaddress;

    /**
     * 用户积分余额
     */
    private Integer ubalance;

    /**
     * 用户头像
     */
    private String uavarta;

    /**
     * 用户的skey，应用分配的值
     */
    private String skey;

    /**
     * 微信下发的session_key
     */
    private String sessionkey;

    /**
     * 注册时间
     */
    private Date create_time;

    /**
     * 更新时间
     */
    private Date update_time;

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
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public Integer getUgender() {
        return ugender;
    }

    public void setUgender(Integer ugender) {
        this.ugender = ugender;
    }
    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }
    public Integer getUbalance() {
        return ubalance;
    }

    public void setUbalance(Integer ubalance) {
        this.ubalance = ubalance;
    }
    public String getUavarta() {
        return uavarta;
    }

    public void setUavarta(String uavarta) {
        this.uavarta = uavarta;
    }
    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }
    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }
    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Users{" +
        "id=" + id +
        ", uid=" + uid +
        ", uname=" + uname +
        ", ugender=" + ugender +
        ", uaddress=" + uaddress +
        ", ubalance=" + ubalance +
        ", uavarta=" + uavarta +
        ", skey=" + skey +
        ", sessionkey=" + sessionkey +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        "}";
    }
}
