package com.yuan.utils;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public abstract class BaseData implements Serializable {
	
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return json string ����json�ַ���
	 */
    public String toJSONString() {
    	//���fastjsonѭ����������
    	 SerializerFeature feature = SerializerFeature.DisableCircularReferenceDetect;
         return JSONObject.toJSONString(this,feature);
    }
}
