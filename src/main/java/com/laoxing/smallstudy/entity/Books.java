package com.laoxing.smallstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("books")
public class Books extends Model<Books> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "bkid", type = IdType.AUTO)
    private Integer bkid;

    /**
     * 书本类别
     */
    private Integer bkclass;

    /**
     * 书本名
     */
    private String bkname;

    /**
     * 书本作者
     */
    private String bkauthor;

    /**
     * 出版社
     */
    private String bkpublisher;

    /**
     * 书籍地址
     */
    private String bkfile;

    /**
     * 书籍封面地址
     */
    private String bkcover;

    /**
     * 书本价格
     */
    private Integer bkprice;

    public Integer getBkid() {
        return bkid;
    }

    public void setBkid(Integer bkid) {
        this.bkid = bkid;
    }
    public Integer getBkclass() {
        return bkclass;
    }

    public void setBkclass(Integer bkclass) {
        this.bkclass = bkclass;
    }
    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }
    public String getBkauthor() {
        return bkauthor;
    }

    public void setBkauthor(String bkauthor) {
        this.bkauthor = bkauthor;
    }
    public String getBkpublisher() {
        return bkpublisher;
    }

    public void setBkpublisher(String bkpublisher) {
        this.bkpublisher = bkpublisher;
    }
    public String getBkfile() {
        return bkfile;
    }

    public void setBkfile(String bkfile) {
        this.bkfile = bkfile;
    }
    public String getBkcover() {
        return bkcover;
    }

    public void setBkcover(String bkcover) {
        this.bkcover = bkcover;
    }
    public Integer getBkprice() {
        return bkprice;
    }

    public void setBkprice(Integer bkprice) {
        this.bkprice = bkprice;
    }

    @Override
    protected Serializable pkVal() {
        return this.bkid;
    }

    @Override
    public String toString() {
        return "Books{" +
        "bkid=" + bkid +
        ", bkclass=" + bkclass +
        ", bkname=" + bkname +
        ", bkauthor=" + bkauthor +
        ", bkpublisher=" + bkpublisher +
        ", bkfile=" + bkfile +
        ", bkcover=" + bkcover +
        ", bkprice=" + bkprice +
        "}";
    }
}
