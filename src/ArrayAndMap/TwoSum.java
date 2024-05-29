package ArrayAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSum {

    public ArrayList<Integer> getIndices(ArrayList<Integer> arr , HashMap<Integer, Integer> mp, int n, int target){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if( mp.containsKey(target-(arr.get(i)))){
                temp.add(i);
                temp.add(mp.get(target-(arr.get(i))));
                return temp;
            }
        }
        return temp;
    }
    public void solve(){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int target = inp.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i<n; i++){
            int k = inp.nextInt();
            arr.add(k);
            mp.put(k, i);
        }
        ArrayList<Integer> ans = getIndices(arr, mp, n, target);
        if(ans != null && ans.size() > 0){
            for(Integer x : ans){
                System.out.println(x);
            }
        }
        else{
            System.out.println("Pair not found");
        }

    }
}
