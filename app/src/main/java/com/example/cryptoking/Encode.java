package com.example.cryptoking;

public class Encode {

    public static String enc(String s)
    {
        StringBuilder intializer=new StringBuilder("11111111");
        int n=s.length();
        int a[]=new int[11111111];

        for(int i=0;i<n;i++)
        {
            a[i]=(int)s.charAt(i);
        }

        StringBuilder res=new StringBuilder("");

        int bin[]=new int[111];
        int idx=0;
        for(int i=0;i<n;i++)
        {
            int temp=a[i];
            idx=0;
            while(temp>0)
            {
                bin[idx++]=temp%2;
                temp=temp/2;
            }

            StringBuilder dig=new StringBuilder("");
            String temps;
            for(int j=0;j<7;j++)
            {
                temps=Integer.toString(bin[j]);
                dig=dig.append(temps);
            }
            String rev=dig.reverse().toString();
            res.append(rev);

        }
        res=intializer.append(res);

        return res.toString();
    }
}
