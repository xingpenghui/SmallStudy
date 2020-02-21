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
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单主键
     */
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    /**
     * 用户openid
     */
    private String uid;

    /**
     * 订单支付价格
     */
    private Integer oprice;

    /**
     * 订单创建时间
     */
    private Date otime;

    /**
     * 书籍id
     */
    private Integer bkid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    public Integer getOprice() {
        return oprice;
    }

    public void setOprice(Integer oprice) {
        this.oprice = oprice;
    }
    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }
    public Integer getBkid() {
        return bkid;
    }

    public void setBkid(Integer bkid) {
        this.bkid = bkid;
    }

    @Override
    protected Serializable pkVal() {
        return this.oid;
    }

    @Override
    public String toString() {
        return "Orders{" +
        "oid=" + oid +
        ", uid=" + uid +
        ", oprice=" + oprice +
        ", otime=" + otime +
        ", bkid=" + bkid +
        "}";
    }
}
