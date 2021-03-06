package et.bo.caseinfo.effectCaseinfo.service.impl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;



import et.bo.stat.service.impl.StatDateStr;
import et.po.OperCaseinfo;
import et.po.OperCorpinfo;
import et.po.OperPriceinfo;

import excellence.common.page.PageInfo;
import excellence.common.util.time.TimeUtil;
import excellence.framework.base.dto.IBaseDTO;
import excellence.framework.base.query.MyQuery;
import excellence.framework.base.query.impl.MyQueryImpl;
//
public class EffectCaseinfoHelp extends MyQueryImpl {
//	/**
//	 * @describe 取得端口对照表所有记录
//	 */
	public MyQuery operCaseinfoQuery(IBaseDTO dto, PageInfo pi){
		MyQuery mq=new MyQueryImpl();
		DetachedCriteria dc=DetachedCriteria.forClass(OperCaseinfo.class);
		
		String caseReply =(String)dto.get("caseReply");
		String caseContent = (String)dto.get("caseContent");
		String beginTime = (String)dto.get("beginTime");
		String endTime = (String)dto.get("endTime");
		String caseRid =(String)dto.get("caseRid");
		String caseAttr5 = (String)dto.get("caseAttr5");
		String caseReview = dto.get("caseReview")==null?"":dto.get("caseReview").toString();
		if(!caseReview.equals(""))
		{
			dc.add(Restrictions.like("caseReview","%"+caseReview+"%"));
		}
		if(!caseAttr5.equals("")){
			dc.add(Restrictions.like("caseAttr5","%"+caseAttr5 +"%"));
		}
		if(!caseRid.equals("")){
			dc.add(Restrictions.like("caseRid","%"+caseRid +"%"));
		}
		if(!caseReply.equals("")){
			dc.add(Restrictions.like("caseReply","%"+caseReply +"%"));
		}
	
		if(!caseContent.equals("")){
			dc.add(Restrictions.like("caseContent", "%"+caseContent+"%"));
		}
		if(!beginTime.equals(""))
		{
			dc.add(Restrictions.ge("caseTime",TimeUtil.getTimeByStr(beginTime, StatDateStr.getParseDateStr(beginTime))));
		}
		if(!endTime.equals(""))
		{
			dc.add(Restrictions.le("caseTime",TimeUtil.getTimeByStr(endTime, StatDateStr.getParseDateStr(beginTime))));
		}
		String state = (String) dto.get("state");
		if(!state.equals("")){
			dc.add(Restrictions.eq("state", state));
		}
		
		dc.add(Restrictions.eq("dictCaseType", "effectCase"));
		
		dc.addOrder(Order.desc("caseTime"));
		
		mq.setDetachedCriteria(dc);
		mq.setFirst(pi.getBegin());
		
		
		mq.setFetch(pi.getPageSize());
		return mq;       
	}   
}
