package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {
    String result = "";
    public String wuTangClan(){
        for(int i=1; i<16;i++){
            if(i % 3 == 0 && i % 5 ==0){
                result += "WuTang Forever";
            }
            else if(i % 3 == 0){
                result += "Wu\n";
            }
            else if(i % 5 == 0){
                result += "Tang\n";
            }
            else{
                result += (i + "\n"); 
            }
        }
        return result;
    }
}
