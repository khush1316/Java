//Halves are Alike


import java.util.Scanner;

public class ifelse2 {
    public boolean halvesAreAlike(String s) {
        char[] t=s.toCharArray();
        int i,p=0,r=0,q;
        int x=t.length;
        q=x/2;
        System.out.println(q);
        for (i=0;i<q;i++)
        {
            if(t[i]=='a' || t[i]=='e' || t[i]=='i' || t[i]=='o' || t[i]=='u')
                p++;
            else if(t[i]=='A' || t[i]=='E' || t[i]=='I' || t[i]=='O' || t[i]=='U')
                p++;
        }
        System.out.println(p);
        for(i=q;i<x;i++){
            if(t[i]=='a' || t[i]=='e' || t[i]=='i' || t[i]=='o' || t[i]=='u')
            r++;
            else if(t[i]=='A' || t[i]=='E' || t[i]=='I' || t[i]=='O' || t[i]=='U')
                r++;
        }
        System.out.println(r);
        if(p==r)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        a=sc.nextLine();
        boolean b=new ifelse2().halvesAreAlike(a);
        System.out.println(b);
    }
}
