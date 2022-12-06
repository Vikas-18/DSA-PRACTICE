
import java.util.ArrayList;
public class dnfsort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(0);
        a.add(1);
        a.add(2);

        sortColors(a);
    }
    static void sortColors(ArrayList<Integer> a) {
        if(a.size()==1)
        {
            return;
        }
        int ones=0;
        int twos=0;
        int zeros=0;

        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i)==0)
            {
                zeros++;
            }

            if(a.get(i)==1)
            {
                ones++;
            }

            if(a.get(i)==2)
            {
                twos++;
            }
        }
a.clear();
        while(zeros>0 || ones>0 || twos>0)
        {
             if(zeros!=0)
             {
                 a.add(0);
                 zeros--;
             }

             else if(ones!=0)
             {
                 a.add(1);
                 ones--;
             }

             else{
                 a.add(2);
                 twos--;
             }
        }
	}
}
