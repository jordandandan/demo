package Leet2018.math;

/**
 * @author bjxujiayi
 * @create 2018-10-18 11:38
 **/
public class Leet43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        char[] c1=num1.toCharArray();
        char[] c2=num2.toCharArray();

        int[] lastLine=new int[c1.length+c2.length];
        for(int i=0;i<c2.length;i++)
        {
            int carry=0;


            for(int j=0;j<c1.length;j++)
            {
                int v1=c2[c2.length-1-i]-48;
                int v2=c1[c1.length-1-j]-48;
                int times=v1*v2+carry+lastLine[lastLine.length-1-i-j];

                int value=times%10;
                carry=times/10;

                lastLine[lastLine.length-1-i-j]=value;
            }
            lastLine[lastLine.length-1-c1.length-i]=carry;
        }

        String result="";
        boolean flag=false;
        for(int s=0;s<lastLine.length;s++)
        {
            if(lastLine[s]!=0)
                flag=true;
            if(flag)
                result=result+lastLine[s];
        }
        return result;

    }
}
