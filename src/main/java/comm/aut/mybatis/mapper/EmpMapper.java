package comm.aut.mybatis.mapper;

import comm.aut.mybatis.pojo.emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
emp getEmp(@Param("eid") Integer eid);

emp getName(@Param("eid") Integer eid)  ;


}
