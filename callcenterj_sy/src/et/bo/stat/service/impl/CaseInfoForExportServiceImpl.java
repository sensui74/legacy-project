/* ��    ����et.bo.stat.service.impl
 * �� �� ����CaseInfoForExportServiceImpl.java
 * ע��ʱ�䣺2008-8-28 11:30:53
 * ��Ȩ���У�������׿Խ�Ƽ����޹�˾��
 */

package et.bo.stat.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jfree.chart.JFreeChart;

import et.bo.common.proc.ProcSql;
import et.bo.jfree.service.JFreeService;
import et.bo.jfree.service.impl.JFreeImpl;
import et.bo.stat.service.CaseInfoFroExportService;
import et.bo.sys.common.MathUtil;
import excellence.common.key.KeyService;
import excellence.framework.base.dao.BaseDAO;
import excellence.framework.base.dto.IBaseDTO;
import excellence.framework.base.dto.impl.DynaBeanDTO;


/**
 * The Class CaseInfoForExportServiceImpl.
 * ��ͨ������ר��������ͳ��
 * @author Wang Lichun
 */
public class CaseInfoForExportServiceImpl implements CaseInfoFroExportService {
	private BaseDAO dao;

	private KeyService ks;

	private ProcSql procSql;

	private JFreeService chartService;

	/**
	 * Gets the chart service.
	 * 
	 * @return the chart service
	 */
	public JFreeService getChartService() {
		return chartService;
	}

	/**
	 * Sets the chart service.
	 * 
	 * @param chartService the new chart service
	 */
	public void setChartService(JFreeService chartService) {
		this.chartService = chartService;
	}

	/**
	 * Gets the proc sql.
	 * 
	 * @return the proc sql
	 */
	public ProcSql getProcSql() {
		return procSql;
	}

	/**
	 * Sets the proc sql.
	 * 
	 * @param procSql the new proc sql
	 */
	public void setProcSql(ProcSql procSql) {
		this.procSql = procSql;
	}

	/**
	 * Gets the dao.
	 * 
	 * @return the dao
	 */
	public BaseDAO getDao() {
		return dao;
	}

	/**
	 * Sets the dao.
	 * 
	 * @param dao the new dao
	 */
	public void setDao(BaseDAO dao) {
		this.dao = dao;
	}

	/**
	 * Gets the ks.
	 * 
	 * @return the ks
	 */
	public KeyService getKs() {
		return ks;
	}

	/**
	 * Sets the ks.
	 * 
	 * @param ks the new ks
	 */
	public void setKs(KeyService ks) {
		this.ks = ks;
	}

	/* (non-Javadoc)
	 * @see et.bo.stat.service.CaseInfoFroExportService#statistic(excellence.framework.base.dto.IBaseDTO)
	 */
	public JFreeChart statistic(IBaseDTO dto) {
		// TODO Auto-generated method stub
		StatDateStr.setBeginEndTime(dto);
		JFreeChart chart = null;
		// ����������������ô洢����
		List<String> params = new ArrayList<String>();
		List results = new ArrayList();
		procSql.setProcedureName("proc_generalCaseInfoStatisticsByExpert");
		params.add(dto.get("beginTime").toString());
		params.add(dto.get("endTime").toString());
		procSql.setSqlvalues(params);
		results = procSql.execute();
		// �Դ洢���̷��صĵĽ�����зּ�
		List<String> xAxis = getXaxis(results);
		List<String> yAxis = getYaxis(results);
		List<String> valueList = getValues(results, xAxis, yAxis);
		// ����JFreeChart���������
		Map<String, Object> properties = new HashMap<String, Object>();
		String chartType = dto.get("chartType").toString();
		if ("on".equals(dto.get("is3d"))) {
			chartType += "3d";
		}
		// ����ͼ�ε�ͨ������
		properties.put("chartType", chartType);
		properties.put("chartTitle", "ר����������ͳ��");
		// ����ͼ�ε��ض�����
		String yChartName="������";
		if (chartType.indexOf(JFreeImpl.BAR) >= 0) {
			properties.put("xChartName", "����ר��");
			properties.put("yChartName", yChartName);
			properties.put("xChartValues", xAxis);
			properties.put("yChartValues", yAxis);
			properties.put("chartValues", valueList);
		} else if (chartType.indexOf(JFreeImpl.LINE) >= 0) {
			properties.put("xChartName", "����ר��");
			properties.put("yChartName", yChartName);
			properties.put("xChartValues", xAxis);
			properties.put("yChartValues", yAxis);
			properties.put("chartValues", valueList);
		} else if (chartType.indexOf(JFreeImpl.PIE) >= 0) {
			properties.put("pieTextValues", xAxis);
		}
		// ����JFreeChart����
		chart = chartService.createJFreeChart(valueList, properties);
		return chart;
	}
	/*
	 *set @src = 'select case_expert, dbo.uf_getDateStr(case_time) as case_time from oper_caseinfo
		where dict_case_type=''putong''
			and case_time between cast(''' + @beginTime + ''' as datetime) and cast(''' + @endTime + ''' as datetime)'
	 */
	/* (non-Javadoc)
	 * @see et.bo.stat.service.CaseInfoFroExportService#query(excellence.framework.base.dto.IBaseDTO)
	 */
	public List<DynaBeanDTO> query(IBaseDTO dto) {
		List<DynaBeanDTO> list = new ArrayList<DynaBeanDTO>();
		// ���ô洢����ȡ��ͳ�ƽ��
		StatDateStr.setBeginEndTime(dto);
		String expertor = (String)dto.get("caseExpert");
		List<String> params = new ArrayList<String>();
		List results = new ArrayList();
		String andSql = " and dict_case_type='putong'";

		procSql.setProcedureName("proc_typeChart");
		params.add(dto.get("beginTime").toString());
		params.add(dto.get("endTime").toString());
		params.add(andSql);
		params.add("case_time");
		params.add("case_expert");
		params.add(expertor);
		params.add("oper_caseinfo");
		params.add("state");
		params.add("����,ԭʼ,����,����,����");
		procSql.setSqlvalues(params);
		results = procSql.execute();
		
		// �Դ洢���̷��صĵĽ�����зּ�
		List lv = (List)results.get(0);
		DynaBeanDTO r = null;
		MathUtil mu = new MathUtil();
		for(int i=0; i<lv.size(); i++)
		{
			r = new DynaBeanDTO();
			Map m = (Map)lv.get(i);
			r.set("col1", m.get("col1"));
			try
			{
				int i_ds = Integer.parseInt(m.get("����").toString());
				int i_ys = Integer.parseInt(m.get("ԭʼ").toString());
				int i_fb = Integer.parseInt(m.get("����").toString());
				int i_checked = Integer.parseInt(m.get("����").toString());
				int i_back = Integer.parseInt(m.get("����").toString());
				int i_rowSum = i_ds + i_ys + i_fb + i_checked+i_back;
				r.set("����", i_ds);
				r.set("ԭʼ", i_ys);
				r.set("����", i_fb);
				r.set("����", i_checked);
				r.set("����", i_back);
				r.set("rowSum", i_rowSum); //�л���
				//������ӻ�����
				int rArr[] = {i_ds,i_ys,i_fb,i_checked,i_rowSum,i_back};
				mu.addBits(rArr);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
			list.add(r);
		}
		//�л���
		r = new DynaBeanDTO();
		r.set("col1", "�ϼ�(��)");
		int colSums[] = mu.getSumArr();
		r.set("����", colSums[0]);
		r.set("ԭʼ", colSums[1]);
		r.set("����", colSums[2]);
		r.set("����", colSums[3]);
		r.set("����", colSums[5]);
		r.set("rowSum", colSums[4]);
		list.add(r);
		return list;
//		List<DynaBeanDTO> list = new ArrayList<DynaBeanDTO>();
//		// ���ô洢����ȡ��ͳ�ƽ��
//		List<String> params = new ArrayList<String>();
//		List results = new ArrayList();
//		System.out.println("********************");
//		procSql.setProcedureName("proc_generalCaseInfoStatisticsByExpert");
//		params.add(dto.get("beginTime").toString());
//		params.add(dto.get("endTime").toString());
//		procSql.setSqlvalues(params);
//		results = procSql.execute();
//		// �Դ洢���̷��صĵĽ�����зּ�
//		List<String> xAxis = getXaxis(results);
//		List<String> yAxis = getYaxis(results);
//		Map map=getValue(results, xAxis, yAxis);	
//		if(xAxis.size()>0&&yAxis.size()>0)
//		{
//			for (Iterator<String> i = yAxis.iterator(); i.hasNext();) {
//				String export = i.next();
//				DynaBeanDTO r = new DynaBeanDTO();
//				r.set("export", export);
//				r.set("count", map.get(export));
//					
//				list.add(r);
//			}
//		}
//		return list;
		
	}

	/**
	 * Gets the xaxis.
	 * 
	 * @param result the result
	 * 
	 * @return the xaxis
	 */
	private List<String> getXaxis(List result) {
		List<String> xAxis = new ArrayList<String>();
		// ����X�����label����
		for (Iterator i = ((List) result.get(0)).iterator(); i.hasNext();) {
			Map xLabel = (Map) i.next();
			xAxis.add(xLabel.get("xaxis").toString());
		}
		return xAxis;
	}

	/**
	 * Gets the yaxis.
	 * 
	 * @param result the result
	 * 
	 * @return the yaxis
	 */
	private List<String> getYaxis(List result) {
		List<String> yAxis = new ArrayList<String>();
		// ����Y�����label����
		for (Iterator i = ((List) result.get(1)).iterator(); i.hasNext();) {
			Map yLabel = (Map) i.next();
			yAxis.add(yLabel.get("yaxis").toString());
		}
		return yAxis;
	}
	
	/**
	 * Gets the value.
	 * 
	 * @param result the result
	 * @param xAxis the x axis
	 * @param yAxis the y axis
	 * 
	 * @return the value
	 */
	private Map getValue(List result, List<String> xAxis,
			List<String> yAxis) {
		Map re=new HashMap();
		for(int i=0;i<yAxis.size();i++){
			String export=yAxis.get(i);
			
			List list=(List)result.get(2);
			int num=0;
			for(int k=0;k<list.size();k++){
				Map record=(Map)list.get(k);
				
				if(export.equals(record.get("yaxis").toString())){
					num+=Integer.parseInt(record.get("value").toString());
				}
			}
			re.put(export, num);
		}
		return re;
	}

	/**
	 * Gets the values.
	 * 
	 * @param result the result
	 * @param xAxis the x axis
	 * @param yAxis the y axis
	 * 
	 * @return the values
	 */
	private List<String> getValues(List result, List<String> xAxis,
			List<String> yAxis) {
		// ����X��Y�����Label������������
		List<String> valueList = new ArrayList<String>();
		for (int i = 0; i < xAxis.size() * yAxis.size(); i++) {
			valueList.add("0");
		}
		for (Iterator i = ((List) result.get(2)).iterator(); i.hasNext();) {
			Map record = (Map) i.next();
			String respondent = record.get("xaxis").toString();
			String processType = record.get("yaxis").toString();
			String value = record.get("value").toString();
			
			valueList.set((xAxis.indexOf(respondent)) * yAxis.size()+ yAxis.indexOf(processType), value);
		}
		return valueList;
	}
}