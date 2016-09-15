package jp.tuyano.spring.aop1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyBean2  implements IMyBean<List<Integer>> {
	private List<Integer> data = new ArrayList<Integer>();
	private Date date = Calendar.getInstance().getTime();

	@Override
	public void setDataObject(List<Integer> obj) {
		data = obj;
	}
	
	@Override
	public List<Integer> getDataObject() {
		return data;
	}
	
	@Override
	public void addData(Object obj) {
		data.add(Integer.parseInt(obj.toString()));
	}

	@Override
	public String toString() {
		String result = "MyBean1 [data=";
		for(Integer n : data){
			result += n + ", ";
		}
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		result += "date=" + fm.format(date) + "]";
		return result;
	}

}
