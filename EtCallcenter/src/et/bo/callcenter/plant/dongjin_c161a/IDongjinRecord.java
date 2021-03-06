/**
 * 	@(#)IDongjinRecord.java   2006-12-21 下午05:00:20
 *	 。 
 *	 
 */
package et.bo.callcenter.plant.dongjin_c161a;

 /**
 * @author zhaoyifei
 * @version 2006-12-21
 * @see
 */
public interface IDongjinRecord {

	/**
	 * 
	 * 录音函数
	 * 
	 * 
	 */
	
	
	/**
	 * 开始文件录音。停止该方式录音，一定要有StopRecordFile。检查录音是否结束，用CheckRecordEnd函数。
	 * 文件录音在本质上是利用循环内存录音，然后，不断的更新缓冲区。PUSH_PLAY函数的调用能够保证录音被移走，从而达到录音的进行。
	 * @param wChnlNo 通道号
	 * @param FileName 文件名
	 * @param dwRecordLen 最长录音长度
	 * @version 2006-11-21
	 * @return true 成功
	 * @return false 打开文件失败
	 */
	public boolean startRecordFile(int wChnlNo,String fileName,int dwRecordLen);
	
	/**
	 * 本函数是对文件录音函数StartRecordFile的补充，事实上，本函数可以完全代替函数StartRecordFile。其工作方式
	 * 当dwRecordStartPos＝0时，调用函数StartRecordFile，即：创建新文件录音。
	 * 当FileName不存在时，调用函数StartRecordFile，即：创建新文件来录音。
	 * 当dwRecordStartPos＞文件长度，从文件尾部开始录音；因此，如果需要从一个文件的尾部继续录音，可令dwRecordStartPos＝0xFFFFFFFFL；
	 * 若dwRecordStartPos小于文件长度时，从dwRecordStartPos位置开始录音；
	 * 录音长度由dwRecordLen确定
	 * @param wChnlNo 通道号
	 * @param FileName 文件名
	 * @param dwRecordLen 最长录音长度
	 * @param dwRecordStartPos 录音的开始位置
	 * @version 2006-11-21
	 * @return true 成功
	 * @return false 打开文件失败
	 */
	public boolean startRecordFileNew(int wChnlNo,String fileName,int dwRecordLen,int dwRecordStartPos);
	
	/**
	 * 检查指定通道录音是否结束（缓冲区已满）
	 * @param wChnlNo 通道号
	 * @version 2006-11-21
	 * @return true 成功结束
	 * @return false 未结束
	 */
	public boolean checkRecordEnd(int wChnlNo);
	
	/**
	 * 该函数停止指定通道的文件录音，对于StartRecordFile函数启动的录音，一定要有本函数停止。
	 * @param wChnlNo 通道号
	 * @version 2006-11-21
	 * @return
	 */
	public void stopRecordFile(int wChnlNo);
	
	/**
	 * 
	 * 其他函数
	 * 
	 */
	
	/**
	 * 调整音量 初始化0db
	 * @param wChnl 通道号
	 * @param cMode 0：录音音量，1:放音音量
	 * @param cVolAdjust 音量幅度
	 * @version 2006-11-22
	 * @return 0 成功
	 * @return -1 超出范围 -20db～20db
	 */
	public abstract int dadjustVocVol(int wChnl,int cMode,int cVolAdjust);
	
	/**
	 * 检测录音模块摘挂机，只对录音模块有效
	 * @param wChnlNo 通道号
	 * @version 2006-11-22
	 * @return 0 挂机
	 * @return 1 摘机
	 */
	public abstract boolean dRecOffHookDetect(int wChnlNo);
	
	
	
	/**
	 * 
	 * 
	 * 内存录音和回声抑制
	 * 
	 */
	
	/**
	 * 设置录音数据刷新的大小，缺省1024，
	 * @param wSize 刷新数据大小，512的整倍数，不能大于系统语音缓冲区的一半。
	 * @version 2006-11-22
	 * @return 0 成功
	 * @return -1在EnableCard之前调用了本函数
	 * @return -2 不是512的整倍数
	 * @return -3 太大
	 * @return -4 系统缓冲区的大小无法整除wSize
	 * @return -5 不是D161A
	 */
	public abstract int vRSetRefreshSize(int wSize);
	
	/**
	 * 开始内存录音
	 * @param wChnlNo 通道号
	 * @version 2006-11-22
	 * @return
	 */
	public abstract void vRStartRecord(int wChnlNo);
	
	/**
	 * 停止内存录音
	 * @param wChnlNo 通道号
	 * @version 2006-11-22
	 * @return
	 */
	public abstract void vRStopRecord(int wChnlNo);
	
	/**
	 * 得到录音数据
	 * @param wChnlNo 通道号
	 * @version 2006-11-22
	 * @return 缓冲区数据
	 */
	public abstract String vRGetRecordData(int wChnlNo);
	
	/**
	 * 是否对通道启动回声抑制功能
	 * @param wChnlNo 通道号
	 * @param cbEnableFlag 0:关闭，1:启动
	 * @param wParam1 0
	 * @param wParam2 0
	 * @version 2006-11-22
	 * @return
	 */
	public abstract void vRSetEcrMode(int wChnl,byte cbEnableFlag,int wParam1,int wParam2);
	
}
