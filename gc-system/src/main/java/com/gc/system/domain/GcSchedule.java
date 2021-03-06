package com.gc.system.domain;

import com.gc.common.annotation.Excel;
import com.gc.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * 排课表 gc_schedule
 *
 * @author gc
 **/
public class GcSchedule extends BaseEntity {

    private static final Long serialVersionUID = 1L;

    /** 排课ID **/
    @Excel(name = "排课ID", type = Excel.Type.EXPORT, prompt = "排课序号")
    private Long scheId;

    /** 教师ID **/
    @Excel(name = "教师ID", cellType = Excel.ColumnType.NUMERIC, prompt = "教师编号")
    private Long teacherId;

    /** 教师姓名 **/
    @Excel(name = "教师姓名")
    private String teacherName;

    /** 课程ID **/
    @Excel(name = "课程ID", cellType = Excel.ColumnType.NUMERIC, prompt = "课程编号")
    private Long courseId;

    /** 课程名称 **/
    @Excel(name = "课程名称")
    private String courseName;

    /** 上课时间跟地点 **/
    @Excel(name = "上课时间&地点")
    private String teachTimeAndLoc;

    /** scheId : gcId = 1 : n */
    private List<GcSc> gcScs;

    /** 课程学分 **/
    @Excel(name = "课程学分", type = Excel.Type.EXPORT, prompt = "课程学分")
    private int courseCredit;

    /** 课堂人数 **/
    @Excel(name = "课堂人数", cellType = Excel.ColumnType.NUMERIC)
    private int classSize;

    /** 已选人数 **/
    private int selectedSize;

    /** 创建时间 **/
    private Date createTime;

    /** 备注 **/
    private String note;

    public Long getScheId() {
        return scheId;
    }

    public void setScheId(Long scheId) {
        this.scheId = scheId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeachTimeAndLoc() {
        return teachTimeAndLoc;
    }

    public void setTeachTimeAndLoc(String techTimeAndLoc) {
        this.teachTimeAndLoc = techTimeAndLoc;
    }

    public List<GcSc> getGcScs() {
        return gcScs;
    }

    public void setGcScs(List<GcSc> gcScs) {
        this.gcScs = gcScs;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public int getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(int selectedSize) {
        this.selectedSize = selectedSize;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("scheId", getScheId())
                .append("teacherId", getTeacherId())
                .append("teacherName", getTeacherName())
                .append("courseId", getCourseId())
                .append("courseName", getCourseName())
                .append("techTimeAndLoc", getTeachTimeAndLoc())
                .append("courseCredit", getCourseCredit())
                .append("classSize", getClassSize())
                .append("selectedSize", getSelectedSize())
                .append("createTime", getCreateTime())
                .append("note", getNote())
                .toString();
    }
}
