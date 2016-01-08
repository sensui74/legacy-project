/* 
 * �㽭��ѧ�������Ű�Ȩ����(2006-2007), Power by COHEG TEAM.
 */
package com.zyf.common.report.service;

import java.io.OutputStream;
import java.io.Writer;

import com.zyf.common.report.config.ReportConfig;

/**
 * �������Դ, ������һ������ʱ, �����ʵ����Ϊ�������ñ�������, ����������д������ͱ���
 * ����, ��������Ҫ���������"��������"��"�����", ����<code>excel</code>��������Ҫ�����
 * ����<code>OutputStream</code>, ����<code>velocity</code>Ҫ����<code>Writer</code>
 * @author zhangli
 * @version $Id: ReportSource.java,v 1.2 2007/12/17 11:02:39 lanxg Exp $
 * @since 2007-5-6
 */
public class ReportSource {
    
    public ReportSource() {}
    
    public ReportSource(String code, OutputStream output) {
        this.code = code;
        this.output = output;
    }
    
    public ReportSource(String code, Writer writer) {
        this.code = code;
        this.writer = writer;
    }
    
    /** �������ñ���, ���ñ�������ʱ������д */
    private String code;
    
    /** ��������, ���ñ���������ɱ����������� */
    private ReportConfig reportConfig;
    
    /** �����, ���ɵı���д������ */
    private OutputStream output;
    
    /** �ַ������, ���ɵı���д������ */
    private Writer writer;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OutputStream getOutput() {
        return output;
    }

    public void setOutput(OutputStream output) {
        this.output = output;
    }

    public ReportConfig getReportConfig() {
        return reportConfig;
    }

    public void setReportConfig(ReportConfig reportConfig) {
        this.reportConfig = reportConfig;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}