public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        String str1 = a.trim();
        String str2 = b.trim();
        String str3 = str1.concat(str2);

        return str3;
    }
    public Integer getIndexOrNull(String a, char b) {
        Integer indexNull = a.indexOf(b);
        if(indexNull >= 0){
            return indexNull;
        }
        else{
            return null;
        }
    }

    public Integer getIndexOrNull(String c, String d){
        
        Integer strIN = c.indexOf(d);
        if(strIN >= 0){
            return strIN;
        }
        else{
            return null;
        }
    }

    public String concatSubstring(String e, int one, int two, String f){
        String g = e.substring(one, two);
        String h = g + f;
        return h;
    }
}