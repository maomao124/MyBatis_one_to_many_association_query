package data;

/**
 * Project name(项目名称)：MyBatis一对多关联查询
 * Package(包名): data
 * Class(类名): Score
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/16
 * Time(创建时间)： 21:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Score
{
    //学生学号
    private Long no;
    //课程编号
    private Long course_no;
    //平时成绩
    private Float usual_score;
    //期末成绩
    private Float end_score;
    //最终分数
    private Float final_score;
    //绩点
    private Float grade_point;
    //学期
    private String semester;

    /**
     * 无参构造
     */
    public Score()
    {
    }

    /**
     * 全参构造
     *
     * @param no          学生学号
     * @param course_no   课程编号
     * @param usual_score 平时成绩
     * @param end_score   期末成绩
     * @param final_score 最终分数
     * @param grade_point 绩点
     * @param semester    学期
     */
    public Score(Long no, Long course_no, Float usual_score, Float end_score, Float final_score, Float grade_point, String semester)
    {
        if (no >= 0)
        {
            this.no = no;
        }
        else
        {
            this.no = 0L;
        }
        if (course_no >= 0)
        {
            this.course_no = course_no;
        }
        else
        {
            this.course_no = 0L;
        }
        if (usual_score >= 0)
        {
            this.usual_score = usual_score;
        }
        else
        {
            this.usual_score = 0f;
        }
        if (end_score >= 0)
        {
            this.end_score = end_score;
        }
        else
        {
            this.end_score = 0f;
        }
        if (final_score >= 0)
        {
            this.final_score = final_score;
        }
        else
        {
            this.final_score = 0f;
        }
        if (grade_point >= 0)
        {
            this.grade_point = grade_point;
        }
        else
        {
            this.grade_point = 0f;
        }
        this.semester = semester;
    }

    //对应的getter方法和setter方法

    /**
     * Gets no.
     *
     * @return the no
     */
    public Long getNo()
    {
        return no;
    }

    /**
     * Sets no.
     *
     * @param no the no
     */
    public void setNo(Long no)
    {
        if (no >= 0)
        {
            this.no = no;
        }
        else
        {
            this.no = 0L;
        }
    }

    /**
     * Gets course no.
     *
     * @return the course no
     */
    public Long getCourse_no()
    {
        return course_no;
    }

    /**
     * Sets course no.
     *
     * @param course_no the course no
     */
    public void setCourse_no(Long course_no)
    {
        if (course_no >= 0)
        {
            this.course_no = course_no;
        }
        else
        {
            this.course_no = 0L;
        }
    }

    /**
     * Gets usual score.
     *
     * @return the usual score
     */
    public Float getUsual_score()
    {
        return usual_score;
    }

    /**
     * Sets usual score.
     *
     * @param usual_score the usual score
     */
    public void setUsual_score(Float usual_score)
    {
        if (usual_score >= 0)
        {
            this.usual_score = usual_score;
        }
        else
        {
            this.usual_score = 0f;
        }
    }

    /**
     * Gets end score.
     *
     * @return the end score
     */
    public Float getEnd_score()
    {
        return end_score;
    }

    /**
     * Sets end score.
     *
     * @param end_score the end score
     */
    public void setEnd_score(Float end_score)
    {
        if (end_score >= 0)
        {
            this.end_score = end_score;
        }
        else
        {
            this.end_score = 0f;
        }
    }

    /**
     * Gets final score.
     *
     * @return the final score
     */
    public Float getFinal_score()
    {
        return final_score;
    }

    /**
     * Sets final score.
     *
     * @param final_score the final score
     */
    public void setFinal_score(Float final_score)
    {
        if (final_score >= 0)
        {
            this.final_score = final_score;
        }
        else
        {
            this.final_score = 0f;
        }
    }

    /**
     * Gets grade point.
     *
     * @return the grade point
     */
    public Float getGrade_point()
    {
        return grade_point;
    }

    /**
     * Sets grade point.
     *
     * @param grade_point the grade point
     */
    public void setGrade_point(Float grade_point)
    {
        if (grade_point >= 0)
        {
            this.grade_point = grade_point;
        }
        else
        {
            this.grade_point = 0f;
        }
    }

    /**
     * Gets semester.
     *
     * @return the semester
     */
    public String getSemester()
    {
        return semester;
    }

    /**
     * Sets semester.
     *
     * @param semester the semester
     */
    public void setSemester(String semester)
    {
        this.semester = semester;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("no：").append(no).append('\t');
        stringbuilder.append("course_no：").append(course_no).append('\t');
        stringbuilder.append("usual_score：").append(usual_score).append('\t');
        stringbuilder.append("end_score：").append(end_score).append('\t');
        stringbuilder.append("final_score：").append(final_score).append('\t');
        stringbuilder.append("grade_point：").append(grade_point).append('\t');
        stringbuilder.append("semester：").append(semester).append('\n');
        return stringbuilder.toString();
    }
}
