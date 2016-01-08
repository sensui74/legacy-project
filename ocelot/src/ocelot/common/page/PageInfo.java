package ocelot.common.page;

import javax.servlet.http.HttpServletRequest;

import ocelot.framework.base.dto.IBaseDTO;


/**
 * 
 * @author zhao yifei
 *
 */
public class PageInfo {
	private int pageSize = 10; //ÿһҳ��¼��
	private int showPage = 1; //��ʼ����ʾҳ
	//���¼�йص�
	private int rowCount = 0; //�ܼ�¼��
	private int pageCount = 1; //��ʼ����ҳ��
	private Object ql=null;
	
	/**
	 * ����������
	 */
	public final static String orderbyasc="orderbyasc";
	public final static String orderbydesc="orderbydesc";
	public final static String pagestate="pagestate";
	
	public final static String first="first";
	public final static String last="last";
	public final static String next="next";
	public final static String pre="pre";
	public final static String now="now";
	
	
	private String fieldAsc=null;
	private String fieldDesc=null;
	
	public String getFieldAsc() {
		return fieldAsc;
	}
	public void setFieldAsc(String fieldAsc) {
		this.fieldAsc = fieldAsc;
	}
	public String getFieldDesc() {
		return fieldDesc;
	}
	public void setFieldDesc(String fieldDesc) {
		this.fieldDesc = fieldDesc;
	}
	public Object getQl() {
		return ql;
	}
	public void setQl(Object ql) {
		this.ql = ql;
	}
	public PageInfo()
	{}
	public PageInfo(String showPage)
	{
	    
	}
	public PageInfo(int pageSize, int showPage, int rowCount, int pageCount)
	{
		this.pageSize = pageSize;
		this.showPage = showPage;
		this.rowCount = rowCount;
		this.pageCount = pageCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		int page=rowCount/pageSize;
		 if(rowCount%pageSize!=0)
			 page++;
		this.rowCount = rowCount;
		this.pageCount = page;
	}
	public int getShowPage() {
		return showPage;
	}
	public void setShowPage(int showPage) {
		this.showPage = showPage;
	}
	public void setState(String pagestate)
	{
        
        if(pagestate==null)
            return;
		if(pagestate.equals(next))
		{
			if(this.getShowPage()<this.getPageCount())
				this.setShowPage(this.getShowPage()+1);
		}
		if(pagestate.equals(pre))
		{
			if(this.getShowPage()>1)
				this.setShowPage(this.getShowPage()-1);
		}
		if(pagestate.equals(first))
		{
			this.setShowPage(1);
		}
		if(pagestate.equals(last))
		{
			this.setShowPage(this.getPageCount());
		}
		if(pagestate.equals(now))
		{
			
		}
		try
		{
			int i=Integer.parseInt(pagestate);
			if(i<=this.getLastPage()&&i>0)
			this.setShowPage(i);
			if(i>this.getLastPage()&&i>0)
				this.setShowPage(this.getLastPage());
			if(i==0)
				return;
		}catch(java.lang.NumberFormatException ne)
		{
			
		}
		
			
	}
	public int getNextPage()
	{
		if(showPage<pageCount)
			return showPage+1;
		else return pageCount;
	}
	public int getPrePage()
	{
		if(showPage>1)
			return showPage-1;
		else return 1;
	}
	public int getFirstPage()
	{
		return 1;
	}
	public int getLastPage()
	{
		return pageCount;
	}
	public static void main(String[] arg0)
	{
		PageInfo pi=new PageInfo();
		pi.pageCount=11;
		pi.setState("12");
		System.out.println(pi.getShowPage());
	}
	public int getBegin()
	{
		int begin=0;
		begin=(this.showPage-1)*this.pageSize;
		return begin;
	}
	public static PageInfo operPara(HttpServletRequest request,String pageTurningName,int pageSize,Object qll)
	{
		
		String pageState = null;
		String orderbyasc1=null;
		String orderbydesc1=null;
		PageInfo pageInfo = null;
		pageState = (String) request.getParameter(pagestate);
		
		orderbyasc1=request.getParameter(orderbyasc);
		orderbydesc1= request.getParameter(orderbydesc);
		
		if ((pageState == null)&&(orderbyasc1==null)&&(orderbydesc1==null)) {
			pageInfo = new PageInfo();
			pageInfo.setPageSize(pageSize);
		} else {
			PageTurning pageTurning = (PageTurning) request.getSession()
					.getAttribute(pageTurningName);
			pageInfo = pageTurning.getPage();
			if(pageState != null)
			pageInfo.setState(pageState);
			if((orderbyasc1!=null)||(orderbydesc1!=null))
			{
			pageInfo.setFieldAsc(orderbyasc1);
			pageInfo.setFieldDesc(orderbydesc1);
			}
		}
		
		
		return pageInfo;
	}
}