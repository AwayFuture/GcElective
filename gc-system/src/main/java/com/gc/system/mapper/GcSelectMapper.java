package com.gc.system.mapper;

import com.gc.system.domain.GcSc;
import com.gc.system.domain.GcSchedule;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 选课中心 - Dao层
 *
 * @author gc
 **/
public interface GcSelectMapper {

    /**
     * 根据条件分页查询排课的课程数据
     *
     * @Param [gcSchedule]
     * @return java.util.List<com.gc.system.domain.GcSchedule>
     **/
    public List<GcSchedule> selectScheduleList(GcSchedule gcSchedule);

    /**
     * 根据 scheId 查询Schedule
     *
     * @Param [scheId]
     * @return java.util.List<com.gc.system.domain.GcSchedule>
     **/
    public GcSchedule selectScheduleByScheId(Long scheId);

    /**
     * 更新选课人数[增加的情况]
     *
     * @Param gcSc
     * @return int
     **/
    public int addSelectedSize(GcSc gcSc);

    /**
     * 更新选课人数[退选的情况]
     *
     * @Param gcSc
     * @return int
     **/
    public int reduceSelectedSize(GcSc gcSc);

    /**
     * 插入选课记录
     *
     * @Param gcSc
     * @return int
     **/
    public int insertSelectedCourse(GcSc gcSc);

    /**
     * 根据学院ID获取学院对应的 【已选课表】 的数据表名
     *
     * @Param [instId]
     * @return java.lang.String
     **/
    public String getTableName(Long instId);

    /**
     * 判断学生是否已经选择了该课程
     *
     * @Param [gcSc]
     * @return int
     **/
    public Integer isSelected(GcSc gcSc);

    /**
     * 查询指定学生的已选课程
     *
     * @Param [gcSc]
     * @return java.util.List<com.gc.system.domain.GcSc>
     **/
    public List<GcSchedule> selectCourseListByUserId(GcSc gcSc);

    /**
     * 根据scheId查询课程学分
     *
     * @Param [scheId]
     * @return java.lang.Integer
     **/
    public Integer getCourseCreditByScheId(Long scheId);

    /**
     * 根据scheId得到courseId, 然后判断本轮选课之前的选课轮次是否已经抽中了该courseId
     *
     * @return java.lang.Integer
     * @Param [tableName, userId, scheId, startTime]
     **/
    public Integer hasSelected(@Param("tableName") String tableName, @Param("userId") Long userId, @Param("scheId") Long scheId, @Param("startTime") String startTime);

}
