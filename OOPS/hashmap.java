public class hashmap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 0);
        map.remove(1);
        map.put(2, 1);
        int val = map.get(2);
      
    }

}
// int , int hashmap
//declaring an array of greater than the constraints size
class MyHashMap {
    int ans[];
    int size=1000001;
    public MyHashMap() {
       ans=new int[size]; 
    }
    
    public void put(int key, int value) {
        ans[key]=value+1;
    }
    
    public int get(int key) {
      return ans[key]-1;//return ans[key]-1 because we have stored val + 1 against key's so we need to subtract 1 before returning,this is needed because if call the function before putinng the value it should return -1 , so that is why we are returning -1 because initially every index values will be 0
        
    }
    
    public void remove(int key) {
        ans[key]=0;// this is because we have written our put and get funstions like that, that we will not have anytime pairing of key to 0,since we have stored val+1 in put function so we have val from 1 only and storing val 0 against key will ensure that we will never encountered that value again.
        //for example if we have 2->3 and we have simply stored -1 in remove function, ans[key] in get function and ans[key] = value in put funtion ,so we will not be able to return -1 because if we have removed key 2 so that's key val will be -1 and if we have again called the function get so it will return -1 but if we have called the function get before putting the value and removing it then problem arises because that will return 0.
    }
}
