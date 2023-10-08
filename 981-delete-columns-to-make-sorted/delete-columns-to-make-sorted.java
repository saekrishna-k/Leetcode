class Solution {
    public int minDeletionSize(String[] strs) {
    //     int c = 0;
    //     int l = strs[0].length();
    //     int k = strs.length - 1;
    //     for(int  i = 0 ; i < l ; i++){
    //         for(int j = 0 ; j < k ; j++){
    //             if(strs[j].charAt(i) > strs[j + 1].charAt(i)){
    //                 c++;
    //                 break;
    //             }
    //         }
    //     }
    //  return c;


    int count = 0;
        for(int i=0;i<strs[0].length();i++) {
        	int temp = 0;
        	for(int j=0;j<strs.length;j++) {
        		int a = strs[j].charAt(i);
        		if(a>=temp) {
        			temp = a;
        		}else {
        			count++;
        			break;
        		}
        	}
        }
        return count;
    }
}