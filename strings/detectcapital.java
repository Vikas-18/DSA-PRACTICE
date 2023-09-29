public class detectcapital {
    public static void main(String[] args) {
        System.out.println(solve1("USA")|solve2("USA")|solve3("USA"));
    }

    public static boolean solve1(String word) {
        boolean flag1= true;
        boolean flag2= true;

        if(word.charAt(0)>'Z')
        {
            return false;
        }
        if(word.charAt(0)<='Z')
        {
            flag1 = true;
        }

        for(int i=1; i<word.length(); i++)
        {
            if(word.charAt(i)<'a')
            {
                flag2 = false;
            }
        }
        return flag1&flag2;
    }
    public static boolean solve2(String word) {
        boolean flag1= true;

       

        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)>'Z')
            {
                flag1 = false;
            }
        }
        return flag1;
    }
    public static boolean solve3(String word) {
        boolean flag1= true;

        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)>'Z')
            {
                flag1 = false;
            }
        }
        return flag1;
    }
}
