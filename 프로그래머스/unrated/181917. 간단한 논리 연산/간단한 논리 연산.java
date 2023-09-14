class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return And(Or(x1,x2),Or(x3,x4));
    }
    
    public boolean Or(boolean x1, boolean x2){
        if(x1 || x2) {return true;}
        else {return false;}
    }
    
    public boolean And(boolean x1, boolean x2){
        if(x1 && x2){return true;}
        else{return false;}
    }  
}