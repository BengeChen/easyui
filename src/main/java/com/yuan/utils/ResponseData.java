package com.yuan.utils;





public class ResponseData extends BaseData {

    /**
	 * serialVersionUID
	 */
    private static final long serialVersionUID = 1L;
    
    /**
	 * ��״̬��ʼֵ��Ϊҵ��
	 */
    private int responseSts = StatusConsts.BUSSNESS_ERROR;

    /**
	 * message
	 */
    private String message;
    
    /**
	 *  ��ҳ��
	 */
    private String totalPage;
    
    /**
	 *  ��ǰҳ��
	 */
    private String pageIndex;
    
    /**
 	 *  �ܼ�¼����
 	 */
    private String totalCount;

	/**
	 * @return the responseSts
	 */
	public int getResponseSts() {
		return responseSts;
	}

	/**
	 * @param responseSts the responseSts to set
	 */
	public void setResponseSts(int responseSts) {
		this.responseSts = responseSts;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the totalPage
	 */
	public String getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return the totalCount
	 */
	public String getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

}
