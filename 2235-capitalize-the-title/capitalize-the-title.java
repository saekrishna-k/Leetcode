class Solution {
    public String capitalizeTitle(String title) {
        //         String r = "";
//         String[] arr = title.split(" ");
//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i].length() > 2){
// r = r + arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase() + " ";
//             } else{
//                 r = r + arr[i].toLowerCase() + " ";
//             }
//         }
//         return r.trim();
//             String r = " ";
//             for(String i : title.split(" ")){
//                             if(i.length() > 2){
// r = r + i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase() + " ";
//             } else{
//                 r = r + i.toLowerCase() + " ";
//             }
//             }
//             return r.trim();
   char[] ch = title.toCharArray();
		int len = ch.length;

		for(int i = 0; i < len; ++i) {

			int firstIndex = i; // store the first index of the word

			while(i < len && ch[i] != ' ') {
				ch[i] |= 32; // converting the character at ith index to lower case ony by one
				++i;
			}

			// if word is of length greater than 2, then turn the first character of the word to upper case
			if(i - firstIndex > 2) { 
				ch[firstIndex] &= ~32; // converting the first character of the word to upper case
			}
		}

		return String.valueOf(ch); 

    }
}