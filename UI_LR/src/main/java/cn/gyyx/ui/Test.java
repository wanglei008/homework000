/**
 * 
 */
package cn.gyyx.ui;

import cn.gyyx.logic.beans.User;
import cn.gyyx.logic.dao.UserDao;
import cn.gyyx.logic.dao.UserDaoFactory;

/*-------------------------------------------------------------------------
 * 版权所有：北京光宇在线科技有限责任公司
 * 作者：wanglei
 * 联系方式：wanglei@gyyx.cn
 * 创建时间： 2014年10月28日
 * 版本号：v1.0
 * 本类主要用途描述：
 * 
-------------------------------------------------------------------------*/
public class Test {
	public static void main(String[] args){
//		User user=new User();
//		user.setUserName("qq");
//		user.setPassWord("12");
//		UserDao usedao=UserDaoFactory.getUserDao();
//		usedao.saveUser(user);
		UserDao us=new UserDao();
//		us.sUser();
		System.out.println(us.sUser());
	}
}
