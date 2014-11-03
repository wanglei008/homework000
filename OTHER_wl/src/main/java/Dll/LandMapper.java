package Dll;

import Beans.User;

/**
 * 登陆需要用到的方法
 * @author Administrator
 *
 */
public interface LandMapper {
	//检查用户登陆信息
	public int checkUser(User user);
}
