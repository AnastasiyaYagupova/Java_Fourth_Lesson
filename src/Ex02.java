public class Ex02 {
    public boolean isValid(String s) {
        String[] arrayS = s.split("");
        for (int i = 0; i < arrayS.length; i += 2) {
            if (arrayS[i].equals("(")) {
                if (arrayS[i + 1].equals(")")) {
                    continue;
                }
                else{return false;}
            } else if (arrayS[i].equals("[")) {
                if (arrayS[i + 1].equals("]")) {
                    continue;
                }
                else{return false;}
            } else if (arrayS[i].equals("{")) {
                if (arrayS[i + 1].equals("}")) {
                    continue;
                }
                else{return false;}
            }
        }
        return true;
    }
}