class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
       List<String> rule = List.of("type","color","name");
       int i = rule.indexOf(ruleKey);
        for(List<String> item: items){
            if(ruleValue.equals(item.get(i))){
                    count++;
            }
        }
        return count;
    }
}