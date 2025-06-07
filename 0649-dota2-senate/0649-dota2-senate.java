class Solution {
    public String predictPartyVictory(String senate) {
     Queue<Integer> R= new LinkedList<>();
     Queue<Integer> D = new LinkedList<>();
     int n = senate.length();
     for(int i=0;i<senate.length();i++){
        if(senate.charAt(i) == 'D') D.add(i);
        else  R.add(i);
     }
     while(!D.isEmpty() && !R.isEmpty()){
        int indOfD = D.poll();
        int indOfR = R.poll();

        if(indOfR < indOfD) R.add(indOfR+n);
        else  D.add(indOfD+n);
     }
     return R.isEmpty()? "Dire":"Radiant";
          
    }  
}