package Dll;

import Beans.User;
import Beans.UserMessage;

/**
 * 注册需要用到的方法
 * @author Administrator
 *
 */
public interface RegistMapper {
	//检查用户CardID是否重复
	public int checkID(UserMessage message);
	//增加新用户
	public int addNewUser(User user,UserMessage message);
	//插入用户信息到User表
	public int ToUser(User user);
	//插入用户信息到UserMessage表
	public int ToUserMessage(UserMessage message);
	
}
