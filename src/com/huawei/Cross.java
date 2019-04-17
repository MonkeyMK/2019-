package com.huawei;

import java.util.ArrayList;
import java.util.Arrays;

/** 
* @author С¯�� 863956237@qq.com: 
* @version ����ʱ�䣺2019��4��5�� ����10:41:41 
* ��˵�� 
*/
public class Cross {
	public int cross_id;
	public ArrayList<Integer> roads = new ArrayList<>();
	public int[] sorted_roads = null;
	
	public Cross(int cross_id, int[] roads) {
		this.cross_id = cross_id;
		for(int i=0;i<roads.length;i++) {
			this.roads.add(roads[i]);
		}
		this.sorted_roads = roads;
		Arrays.sort(this.sorted_roads);
	}

	@Override
	public String toString() {
		return "Cross [cross_id=" + cross_id + ", roads=" + roads + ", sorted_roads=" + Arrays.toString(sorted_roads)
				+ "]";
	}


	
}
 