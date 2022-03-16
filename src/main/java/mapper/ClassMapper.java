package mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Project name(项目名称)：MyBatis一对一关联查询
 * Package(包名): mapper
 * Interface(接口名): ClassMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/15
 * Time(创建时间)： 22:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public interface ClassMapper
{

    /**
     * Gets class.
     *
     * @param class_no the class no
     * @return the class
     */
    public data.Class getClass(@Param("class_no") Long class_no);
}
