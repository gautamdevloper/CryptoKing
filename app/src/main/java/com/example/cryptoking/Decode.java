package com.example.cryptoking;

public class Decode {

    public static String dec(String s)
    {
        String inv="This code was not encrypted by CryptoKing";
        String intializer="11111111";
        Boolean flag=true;

        for(int i=0;i<8;i++)
        {
            if(intializer.charAt(i)!=s.charAt(i))
            {
                flag=false;
                break;
            }
        }
        String data=s.substring(8);
        int[][] ascii=new int[11101][8];
        int indx=0;
        for(int i=0;i<data.length();i=i+7)
        {
            int index=0;
            for(int j=i;j<i+7;j++)
            {
                ascii[indx][index++]=data.charAt(j)-'0';
            }
            indx++;
        }


        int nums[]=new int[11111];
        int ct=0;
        int temp=0;
        int nindx=0;
        for(int i=0;i<indx;i++)
        {
            ct=0;
            temp=0;
            for(int j=6;j>=0;j--)
            {
                int temp1=(int)Math.pow(2,ct);
                temp+=(ascii[i][j]*temp1);
                ct++;
            }
            nums[nindx++]=temp;
        }
        StringBuilder decrypt=new StringBuilder("");
        for(int i=0;i<nindx;i++)
        {
            char ch=(char)nums[i];

            if(ch=='`')
                decrypt.append(" ");
            else
                decrypt.append(ch);

        }

        return decrypt.toString();



    }

}
