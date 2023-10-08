class Solution {
    public String reformatDate(String date) {
        // String[] str = date.split(" ");
        // String mon = "";
        // switch(str[1]) {
        //     case "Jan" :
        //           mon = "01";
        //           break;
        //     case "Feb" :
        //           mon = "02";
        //           break;    
        //     case "Mar" :
        //           mon = "03";
        //           break;   
        //     case "Apr" :
        //           mon = "04";
        //           break;  
        //     case "May" :
        //           mon = "05";
        //           break;     
        //     case "Jun" :
        //           mon = "06";
        //           break;      
        //     case "Jul" :
        //           mon = "07";
        //           break;     
        //      case "Aug" :
        //           mon = "08";
        //           break;  
        //      case "Sep" :
        //           mon = "09";
        //           break;  
        //      case "Oct" :
        //           mon = "10";
        //           break;    
        //      case "Nov" :
        //           mon = "11";
        //           break;     
        //      case "Dec" :
        //           mon = "12";
        //           break;                                    
        // }
        // String d = str[0].length() > 3 ? str[0].substring(0,2) : "0" + str[0].substring(0,1);
        // return  str[2]+"-"+ mon +"-"+ d;


    Map<String,String> m = new HashMap<>();
        m.put("Jan","01"); m.put("Feb","02"); m.put("Mar","03"); m.put("Apr","04");
        m.put("May","05"); m.put("Jun","06"); m.put("Jul","07"); m.put("Aug","08");
        m.put("Sep","09"); m.put("Oct","10"); m.put("Nov","11"); m.put("Dec","12");

        StringBuilder sb = new StringBuilder();
        if(date.length()==13){
            return sb.append(date.substring(9))
            .append("-")
            .append(m.get(date.substring(5,8)))
            .append("-").append(date.substring(0,2))
            .toString();
        }
        return sb.append(date.substring(8))
        .append("-")
        .append(m.get(date.substring(4,7)))
        .append("-0")
        .append(date.substring(0,1))
        .toString();
    }
}