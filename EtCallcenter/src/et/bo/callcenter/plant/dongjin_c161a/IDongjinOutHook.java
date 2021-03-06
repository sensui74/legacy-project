/**
 * 	@(#)IDongjinOutHook.java   2006-12-21 下午04:54:45
 *	 。 
 *	 
 */
package et.bo.callcenter.plant.dongjin_c161a;

 /**
 * @author zhaoyifei
 * @version 2006-12-21
 * @see
 */
public interface IDongjinOutHook {

	/**
	 * 
	 * 振铃及摘挂机函数
	 * 
	 * 
	 * 
	 */
	
	/**
	 * 检测外线是否有振铃信号或内线是否有提机
	 * @param wChnlNo 通道号
	 * @version 2006-11-21
	 * @return true 有振铃或提机
	 * @return false 无振铃或挂机
	 * 
	 */
	public boolean ringDetect(int wChnlNo);
	
	/**
	 * 外线提机，对于内线，不起作用
	 * @param wChnlNo 通道号
	 * @version 2006-11-21
	 * @return
	 */
	public void offHook(int wChnlNo);
	
	/**
	 * 外线挂机，对于内线，不起作用
	 * @param wChnlNo 通道号
	 * @version 2006-11-21
	 * @return
	 */
	public void hangUp(int wChnlNo);
	
}
