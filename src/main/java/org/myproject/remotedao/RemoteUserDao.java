package org.myproject.remotedao;

import org.apache.ibatis.annotations.Param;
import org.myproject.remotepojo.RemoteUser;

/**
 * Created by zhao_xinhu
 * On 2018/6/27
 */
public interface RemoteUserDao {

    RemoteUser getUser(@Param(value = "id") int id);
}
