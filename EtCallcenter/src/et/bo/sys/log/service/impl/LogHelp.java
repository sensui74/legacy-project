package et.bo.sys.log.service.impl;


import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

import et.po.SysLog;
import et.po.SysModule;
import et.po.SysUser;
import excellence.common.page.PageInfo;
import excellence.common.util.time.TimeUtil;
import excellence.framework.base.dto.IBaseDTO;
import excellence.framework.base.query.MyQuery;
import excellence.framework.base.query.impl.MyQueryImpl;

public class LogHelp {
	public MyQuery listLogMQ(IBaseDTO dto)
	{
		DetachedCriteria dc=DetachedCriteria.forClass(SysLog.class);
		if(null !=dto.get("sysUser") && !"".equals(dto.get("sysUser").toString()))
		{
			SysUser su =new SysUser();
			su.setUserId("%"+dto.get("sysUser").toString()+"%");
			dc.add(Expression.like("sysUser",su));
		}
		if(null !=dto.get("sysModule") && !"".equals(dto.get("sysModule").toString()))
		{
			SysModule sm =new SysModule();
			sm.setId(dto.get("sysModule").toString());
			dc.add(Expression.eq("sysModule",sm));
		}
		if(null !=dto.get("actorType") && !"".equals(dto.get("actorType").toString()))
			dc.add(Expression.eq("actorType",(String)dto.get("actorType")));
		if(null !=dto.get("fdt") && !"".equals(dto.get("fdt").toString()))
			dc.add(Expression.ge("dt",TimeUtil.getTimeByStr(dto.get("fdt").toString(),"yyyy-MM-dd")));
		if(null !=dto.get("ldt") && !"".equals(dto.get("ldt").toString()))
			dc.add(Expression.le("dt",TimeUtil.getTimeByStr(dto.get("ldt").toString(),"yyyy-MM-dd")));
		if(null !=dto.get("ip") && !"".equals(dto.get("ip").toString()))
			dc.add(Expression.le("ip",dto.get("ip")));
		MyQuery mq =new MyQueryImpl();
		mq.setDetachedCriteria(dc);	
		return mq;
	}
	
	public MyQuery listLogMQ(IBaseDTO dto, PageInfo pi)
	{
		DetachedCriteria dc=DetachedCriteria.forClass(SysLog.class);
		if(null !=dto.get("sysUser") && !"".equals(dto.get("sysUser").toString()))
		{
			SysUser su =new SysUser();
			su.setUserId("%"+dto.get("sysUser").toString()+"%");
			dc.add(Expression.like("sysUser",su));
		}
		if(null !=dto.get("sysModule") && !"".equals(dto.get("sysModule").toString()))
		{
			SysModule sm =new SysModule();
			sm.setId(dto.get("sysModule").toString());
			dc.add(Expression.eq("sysModule",sm));
		}
		if(null !=dto.get("actorType") && !"".equals(dto.get("actorType").toString()))
			dc.add(Expression.eq("actorType",(String)dto.get("actorType")));
		if(null !=dto.get("fdt") && !"".equals(dto.get("fdt")))
			dc.add(Expression.ge("dt",TimeUtil.getTimeByStr(dto.get("fdt").toString())));
		if(null !=dto.get("ldt") && !"".equals(dto.get("ldt")))
			dc.add(Expression.le("dt",TimeUtil.getTimeByStr(dto.get("ldt").toString())));
		if(null !=dto.get("ip") && !"".equals(dto.get("ip").toString()))
			dc.add(Expression.le("ip",dto.get("ip")));
		dc.addOrder(Order.desc("dt"));
		MyQuery mq =new MyQueryImpl();
		mq.setDetachedCriteria(dc);
		mq.setFirst(pi.getBegin());
        mq.setFetch(pi.getPageSize());
		return mq;
	}
	

}
