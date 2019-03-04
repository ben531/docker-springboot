package com.minmax.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "employ")
public class Employ {
    @Column(name = "e_id")
    private Long eId;

    @Column(name = "e_name")
    private String eName;

    @Column(name = "e_age")
    private Byte eAge;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * @return e_id
     */
    public Long geteId() {
        return eId;
    }

    /**
     * @param eId
     */
    public void seteId(Long eId) {
        this.eId = eId;
    }

    /**
     * @return e_name
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * @return e_age
     */
    public Byte geteAge() {
        return eAge;
    }

    /**
     * @param eAge
     */
    public void seteAge(Byte eAge) {
        this.eAge = eAge;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}