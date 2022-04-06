package User_mybatis;

import comm.aut.mybatis.mapper.EmpMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DepMapperTest {
    //查询指定表中数据
    @Test
    public void test01(){
        SqlSession mapper = comm.aut.mybatis.utils.mapper.getMapper();
        EmpMapper mapper1 = mapper.getMapper(EmpMapper.class);


        System.out.println(mapper1.getEmp(1));
    }
    @Test
    public void test02(){
        SqlSession mapper = comm.aut.mybatis.utils.mapper.getMapper();
        EmpMapper mapper1 = mapper.getMapper(EmpMapper.class);

        System.out.println(mapper1.getName(1));
    }
}
