/*
 * @(#)CustinfoServiceImpl.java	 2008-03-19
 *
 * 版权所有 沈阳市卓越科技有限公司。
 */

package et.bo.callcenter.userInfo.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import et.bo.callcenter.userInfo.service.UserInfoService;
import et.po.OperCustinfo;
import et.po.OperQuestion;
import excellence.common.classtree.ClassTreeService;
import excellence.common.key.KeyService;
import excellence.common.page.PageInfo;
import excellence.framework.base.dao.BaseDAO;
import excellence.framework.base.dto.IBaseDTO;
import excellence.framework.base.dto.impl.DynaBeanDTO;

/**
 * <p>客户管理</p>
 * 
 * @version 2008-03-19
 * @author nie
 */

public class UserInfoImpl implements UserInfoService {
	
	BaseDAO dao = null;
	private int num = 0;
	private String custId = null;
	private List questionList = null;
	public KeyService ks = null;
	private ClassTreeService cts = null;
	
	public BaseDAO getDao() {
		return dao;
	}
	public void setDao(BaseDAO dao) {
		this.dao = dao;
	}
	
	public KeyService getKs() {
		return ks;
	}
	public void setKs(KeyService ks) {
		this.ks = ks;
	}
	
	public ClassTreeService getCts() {
		return cts;
	}
	public void setCts(ClassTreeService cts) {
		this.cts = cts;
	}
	/**
	 * 根据客户ID查询数据列表,返回该客户的“问题”的list。 取得查询问题列表数据。
	 * 返回的列表根本时间进行排序
	 * @return 回访数据的list
	 */
	public List getQuestionList() {
		List<String> l = new ArrayList<String>();
		List qList = new ArrayList();
		for(int i = 0; i<questionList.size(); i++){
			DynaBeanDTO dto = (DynaBeanDTO)questionList.get(i);
			l.add((String)dto.get("addtime"));
		}
		Collections.sort(l);
		for(int i = l.size()-1; i>=0; i--){
			for(int j = 0; j<questionList.size(); j++ ){
				DynaBeanDTO dto = (DynaBeanDTO)questionList.get(j);
				if(l.get(i).equals( dto.get("addtime")) ){
					qList.add(dto);
					break;
				}
			}
		}
		
		return qList;
	}
	/**
	 * 查询数据列表,返回记录的list。
	 * 取得查询问题列表数据。
	 * @param dto 数据传输对象
	 * @param pi 页面信息
	 * @return 数据的list
	 */
	public List custinfoQuery(IBaseDTO dto, PageInfo pi) {
		
		List list = new ArrayList();
		UserInfoHelp h = new UserInfoHelp();
		
		Object[] result = (Object[]) dao.findEntity(h.custinfoQuery(dto, pi));
		num = dao.findEntitySize(h.custinfoQuery(dto, pi));
		
		for (int i = 0, size = result.length; i < size; i++) {
			OperCustinfo po = (OperCustinfo) result[i];
			list.add(custinfoToDynaBeanDTO(po));
		}
		return list;
	}
	/**
	 * 查询数据列表,返回全部记录的list。
	 * 取得查询问题列表数据。
	 * @param dto 数据传输对象
	 * @param pi 页面信息
	 * @return 数据的list
	 */
	public List custinfoAllQuery() {
		
		List list = new ArrayList();
		UserInfoHelp h = new UserInfoHelp();
		
		Object[] result = (Object[]) dao.findEntity(h.allQuery());
		
		for (int i = 0, size = result.length; i < size; i++) {
			OperCustinfo po = (OperCustinfo) result[i];
			list.add(custinfoToDynaBeanDTO(po));
		}
		return list;
	}
	/**
	 * 查询方法的 po 转 dto
	 * @param po
	 * @return dto
	 */
	private DynaBeanDTO custinfoToDynaBeanDTO(OperCustinfo po){
		
		DynaBeanDTO dto = new DynaBeanDTO();
		
		dto.set("cust_id", po.getCustId());
		dto.set("cust_name", po.getCustName());
		dto.set("dict_sex", po.getDictSex());
		dto.set("cust_email", po.getCustEmail());
		dto.set("cust_addr", po.getCustAddr());
		dto.set("cust_pcode", po.getCustPcode());
		dto.set("cust_tel_home", po.getCustTelHome());
		dto.set("cust_tel_work", po.getCustTelWork());
		dto.set("cust_tel_mob", po.getCustTelMob());
		dto.set("cust_fax", po.getCustFax());
		dto.set("cust_voc", po.getDictCustVoc());
		dto.set("cust_scale", po.getDictCustScale());
		String cust_type = po.getDictCustType();
		if(cust_type != null && cust_type.length() > 15){
			cust_type = cts.getLabelById(cust_type);
		}
		dto.set("cust_type", cust_type);
		dto.set("remark", po.getRemark());

		return dto;
	}
	/**
	 * 查询数据列表的条数。
	 * 取得问题查询列表的条数。
	 * @return 得到list的条数
	 */
	public int getCustinfoSize() {
		
		return num;
	
	}
	/**
	 * 根据ID取得一条数据的excellence.framework.base.dto.IBaseDTO对象
	 * 取得某条数据的详细信息。
	 * @param id 取得excellence.framework.base.dto.IBaseDTO的标识
	 * @return 包含数据信息的excellence.framework.base.dto.IBaseDTO对象
	 */
	public IBaseDTO getCustinfoInfo(String id) {
		
		OperCustinfo po = (OperCustinfo)dao.loadEntity(OperCustinfo.class,id);
		IBaseDTO dto = new DynaBeanDTO();
		
		dto.set("cust_id", po.getCustId());
		dto.set("cust_name", po.getCustName());
		dto.set("dict_sex", po.getDictSex());
		dto.set("cust_email", po.getCustEmail());
		dto.set("cust_addr", po.getCustAddr());
		dto.set("cust_pcode", po.getCustPcode());
		dto.set("cust_tel_home", po.getCustTelHome());
		dto.set("cust_tel_work", po.getCustTelWork());
		dto.set("cust_tel_mob", po.getCustTelMob());
		dto.set("cust_fax", po.getCustFax());
		dto.set("cust_voc", po.getDictCustVoc());
		dto.set("cust_scale", po.getDictCustScale());
		dto.set("cust_type", po.getDictCustType());
		dto.set("remark", po.getRemark());
		
		return dto;
		
	}
	/**
	 * 根据电话号码取得一条数据的excellence.framework.base.dto.IBaseDTO对象
	 * 根据电话号码查询用户宅电，办公电话，手机，取得某客户的详细信息。
	 * @param id 取得excellence.framework.base.dto.IBaseDTO的标识
	 * @return 包含数据信息的excellence.framework.base.dto.IBaseDTO对象
	 */
	public IBaseDTO getopenwinInfo(String tel) {
		
		UserInfoHelp h = new UserInfoHelp();
		Object[] obj = (Object[]) dao.findEntity(h.openwinQuery(tel));
		
		OperCustinfo po = new OperCustinfo();
		if(obj.length > 0){				//如果返回结果数组大于0
			po = (OperCustinfo) obj[0];	//则取得第一个对象转成po
		}
		IBaseDTO dto = new DynaBeanDTO();
		
		dto.set("cust_id", po.getCustId());
		dto.set("cust_name", po.getCustName());
		dto.set("dict_sex", po.getDictSex());
		dto.set("cust_email", po.getCustEmail());
		dto.set("cust_addr", po.getCustAddr());
		dto.set("cust_pcode", po.getCustPcode());
		dto.set("cust_tel_home", po.getCustTelHome());
		dto.set("cust_tel_work", po.getCustTelWork());
		dto.set("cust_tel_mob", po.getCustTelMob());
		dto.set("cust_fax", po.getCustFax());
		dto.set("cust_voc", po.getDictCustVoc());
		dto.set("cust_scale", po.getDictCustScale());
		dto.set("cust_type", po.getDictCustType());
		dto.set("remark", po.getRemark());
		
		Set sets = po.getOperQuestions();
		Iterator it = sets.iterator();
		questionList = new ArrayList();
		while(it.hasNext()){
			OperQuestion oq = (OperQuestion)it.next();
			DynaBeanDTO ddto = new DynaBeanDTO();
			
			ddto.set("id", oq.getId());
			ddto.set("dict_question_type1", oq.getDictQuestionType1());
			ddto.set("question_content", oq.getQuestionContent());
			
			String dict_is_answer_succeed = oq.getDictIsAnswerSucceed();
			if(dict_is_answer_succeed!=null&&dict_is_answer_succeed.indexOf("SYS")!=-1)
				dict_is_answer_succeed = cts.getLabelById(dict_is_answer_succeed);
			ddto.set("dict_is_answer_succeed", dict_is_answer_succeed);
			
			String d = new java.text.SimpleDateFormat("yy-MM-dd HH:mm").format(oq.getAddtime());
			ddto.set("addtime", d);
			
			questionList.add(ddto);
		}

		return dto;
	}
	/**
	 * 修改数据。
	 * 修改某条记录的内容。
	 * @param dto 要更新的的excellence.framework.base.dto.IBaseDTO对象
	 * @return boolean
	 */
	public boolean updateCustinfo(IBaseDTO dto) {
		
		try{
			dao.saveEntity(modifycoll(dto));
			return true;
		}catch(Exception e){
			return false;
		}
	}
	/**
	 * 修改方法的 dto 转 po
	 * @param dto
	 * @return po
	 */
	private OperCustinfo modifycoll(IBaseDTO dto){

		OperCustinfo po = (OperCustinfo)dao.loadEntity(OperCustinfo.class,dto.get("cust_id").toString());//根据主键修改表

//		po.setCustId(dto.get("cust_id").toString());
		po.setCustName(dto.get("cust_name").toString());
		po.setDictSex(dto.get("dict_sex").toString());
		po.setCustEmail(dto.get("cust_email").toString());
		po.setCustAddr(dto.get("cust_addr").toString());
		po.setCustPcode(dto.get("cust_pcode").toString());
		po.setCustTelHome(dto.get("cust_tel_home").toString());
		po.setCustTelWork(dto.get("cust_tel_work").toString());
		po.setCustTelMob(dto.get("cust_tel_mob").toString());
		po.setCustFax(dto.get("cust_fax").toString());
		po.setDictCustVoc(dto.get("cust_voc").toString());
		po.setDictCustScale(dto.get("cust_scale").toString());
		po.setDictCustType(dto.get("cust_type").toString());
		po.setRemark(dto.get("remark").toString());
		
		return po;
	}
	/**
	 * 删除数据。
	 * 删除某条记录。
	 * @param id 要删除数据的标识
	 */
	public void delCustinfo(String id) {
		
		OperCustinfo cq = (OperCustinfo)dao.loadEntity(OperCustinfo.class,id);
		dao.removeEntity(cq);
		
	}
	/**
	 * 标记删除。
	 * 标记字段"IS_DELETE"，为"1"时为删除，为"0"时未删除。实际上这个方法执行的是修改"IS_DELETE"字段的操作。
	 * @param id 要标记删除数据的标识
	 */
	public boolean isDelete(String id) {
		
		OperCustinfo po = (OperCustinfo)dao.loadEntity(OperCustinfo.class,id);//根据主键修改表
		po.setIsDelete("1");	//"1"是已删除的意思
		
		try{
			dao.saveEntity(po);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	/**
	 * 添加数据。
	 * 向数据库中添加一条记录。
	 * @param dto 新数据的excellence.framework.base.dto.IBaseDTO对象
	 */
	public void addCustinfo(IBaseDTO dto) {
		
		dao.saveEntity(createCustinfo(dto));
		
	}
	/**
	 * 添加方法的 dto 转 po
	 * @param dto
	 * @return po
	 */
	private OperCustinfo createCustinfo(IBaseDTO dto){
		
		OperCustinfo po = new OperCustinfo();
		
		//生成ID
		custId = ks.getNext("oper_custinfo");
		po.setCustId(custId);
		//标记删除字段为"0"
		po.setIsDelete("0");
		
		po.setCustName(dto.get("cust_name").toString());
		po.setDictSex(dto.get("dict_sex").toString());
		po.setCustEmail(dto.get("cust_email").toString());
		po.setCustAddr(dto.get("cust_addr").toString());
		po.setCustPcode(dto.get("cust_pcode").toString());
		po.setCustTelHome(dto.get("cust_tel_home").toString());
		po.setCustTelWork(dto.get("cust_tel_work").toString());
		po.setCustTelMob(dto.get("cust_tel_mob").toString());
		po.setCustFax(dto.get("cust_fax").toString());
		po.setDictCustVoc(dto.get("cust_voc").toString());
		po.setDictCustScale(dto.get("cust_scale").toString());
		po.setDictCustType(dto.get("cust_type").toString());
		po.setRemark(dto.get("remark").toString());
		
		return po;
	}
	/**
	 * 取得新客户记录的ID
	 * @return custID
	 */
	public String getCustId() {
		
		return custId;
		
	}

}
