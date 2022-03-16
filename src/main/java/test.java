import data.Class;
import mapper.ClassMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project name(项目名称)：MyBatis一对多关联查询
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/16
 * Time(创建时间)： 20:55
 * Version(版本): 1.0
 * Description(描述)： 性能测试
 */

public class test
{

    public static void main(String[] args) throws IOException
    {
        SqlSessionFactory sqlSessionFactory;
        System.out.println("加载...");
        {
            //------------------------------------------------------
            long startTime = System.nanoTime();   //获取开始时间
            //------------------------------------------------------
            //读取配置文件mybatis-config.xml
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            //根据配置文件构建SqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
            //通过SqlSessionFactory创建SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
            //查询一次，加载静态代码块
            classMapper.getClass1(1001L);
            //System.out.println(aClass);
            sqlSession.close();
            //------------------------------------------------------
            long endTime = System.nanoTime(); //获取结束时间
            if ((endTime - startTime) < 1000000)
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime);
                 final_runtime = final_runtime / 1000;
                 System.out.println("算法运行时间： " + final_runtime + "微秒");
            }
            else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
            {
                double final_runtime;
                final_runtime = (endTime - startTime) / 1000;
                final_runtime = final_runtime / 1000;
                System.out.println("算法运行时间： " + final_runtime + "毫秒");
             }
            else
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime) / 10000;
                 final_runtime = final_runtime / 100000;
                 System.out.println("算法运行时间： " + final_runtime + "秒");
            }
            Runtime r = Runtime.getRuntime();
            float memory;
            memory = r.totalMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("JVM总内存：%.3fMB\n", memory);
            memory = r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf(" 空闲内存：%.3fMB\n", memory);
            memory = r.totalMemory() - r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("已使用的内存：%.4fMB\n", memory);
            //------------------------------------------------------
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("多步查询...");
        {
            //------------------------------------------------------
            long startTime = System.nanoTime();   //获取开始时间
            //------------------------------------------------------
            //通过SqlSessionFactory创建SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
            Class aClass = classMapper.getClass1(1001L);
            System.out.println(aClass);
            sqlSession.close();
            //------------------------------------------------------
            long endTime = System.nanoTime(); //获取结束时间
            if ((endTime - startTime) < 1000000)
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime);
                 final_runtime = final_runtime / 1000;
                 System.out.println("算法运行时间： " + final_runtime + "微秒");
            }
            else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
            {
                double final_runtime;
                final_runtime = (endTime - startTime) / 1000;
                final_runtime = final_runtime / 1000;
                System.out.println("算法运行时间： " + final_runtime + "毫秒");
             }
            else
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime) / 10000;
                 final_runtime = final_runtime / 100000;
                 System.out.println("算法运行时间： " + final_runtime + "秒");
            }
            Runtime r = Runtime.getRuntime();
            float memory;
            memory = r.totalMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("JVM总内存：%.3fMB\n", memory);
            memory = r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf(" 空闲内存：%.3fMB\n", memory);
            memory = r.totalMemory() - r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("已使用的内存：%.4fMB\n", memory);
            //------------------------------------------------------
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("单步查询...");

        {
            //------------------------------------------------------
            long startTime = System.nanoTime();   //获取开始时间
            //------------------------------------------------------
            //通过SqlSessionFactory创建SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
            Class aClass = classMapper.getClass2(1001L);
            System.out.println(aClass);
            sqlSession.close();
            //------------------------------------------------------
            long endTime = System.nanoTime(); //获取结束时间
            if ((endTime - startTime) < 1000000)
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime);
                 final_runtime = final_runtime / 1000;
                 System.out.println("算法运行时间： " + final_runtime + "微秒");
            }
            else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
            {
                double final_runtime;
                final_runtime = (endTime - startTime) / 1000;
                final_runtime = final_runtime / 1000;
                System.out.println("算法运行时间： " + final_runtime + "毫秒");
             }
            else
            {
                 double final_runtime;
                 final_runtime = (endTime - startTime) / 10000;
                 final_runtime = final_runtime / 100000;
                 System.out.println("算法运行时间： " + final_runtime + "秒");
            }
            Runtime r = Runtime.getRuntime();
            float memory;
            memory = r.totalMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("JVM总内存：%.3fMB\n", memory);
            memory = r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf(" 空闲内存：%.3fMB\n", memory);
            memory = r.totalMemory() - r.freeMemory();
            memory = memory / 1024 / 1024;
            System.out.printf("已使用的内存：%.4fMB\n", memory);
            //------------------------------------------------------
        }
    }
}
