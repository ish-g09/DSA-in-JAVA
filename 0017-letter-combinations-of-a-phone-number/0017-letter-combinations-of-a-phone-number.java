class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {
    "",     //0
    "",     //1
    "abc",  //2
    "def",  //3
    "ghi",  //4
    "jkl",  //5
    "mno",  //6
    "pqrs", //7
    "tuv",  //8
    "wxyz"  //9
};
    List<String> result = new ArrayList<>();
    StringBuilder str=new StringBuilder();
    getsub(0,digits,map,str,result);
    return result;
    }
    void getsub(int i, String digits, String[]map, StringBuilder str, List<String>result){
        if(i==digits.length()){
            result.add(str.toString());
            return;
        }
        String letter=map[digits.charAt(i)-'0'];
        for(int j=0; j<letter.length();j++){
            str.append(letter.charAt(j));
            getsub(i+1,digits,map,str,result);
            str.deleteCharAt(str.length()-1);
        }

    }
}