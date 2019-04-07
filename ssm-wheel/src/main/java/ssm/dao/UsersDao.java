package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ssm.entity.Users;

public interface UsersDao {
    public int insertUser(@Param("userId") int userId,@Param("userName") String userName,@Param("passWord") String passWord);
    public Users getUserByID(@Param("userId") int userId);
    public int updatePasswordByID(@Param("userId") int userId,@Param("passWord") String passWord);
}
