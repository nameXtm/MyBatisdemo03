package comm.aut.mybatis.mapper;

import comm.aut.mybatis.pojo.dep;
import org.apache.ibatis.annotations.Param;

public interface DepMapper {
    dep getDep(@Param("did") Integer did);

}
