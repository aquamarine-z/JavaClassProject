package step6;

public class SortTool {
	public static void sort(String[] strList) {
		// 完成倒序排序代码；提示：strList[i].compareTo()
        for(int i=0;i<strList.length;i++){
            for(int j=i+1;j<strList.length;j++){
                if(strList[i].compareTo(strList[j])<0){
                    String temp=strList[i];
                    strList[i]=strList[j];
                    strList[j]=temp;
                }
            }
        }
	}
}