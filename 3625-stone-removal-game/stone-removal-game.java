class Solution {
    public boolean canAliceWin(int n) {
    //     if(n<10){
    //         return false;
    //     }
    //     if(n==10){
    //         return true;
    //     }
     
    //    int alice=10;
    //    n=n-10;
       
    //    int bob=9;
    //       char cur='b';
    //    while(n>0){
    //     if(cur=='b'){
    //         if(bob<=n){
    //              if(n==bob){
    //                 return true;
    //             }
    //             n=n-bob;

    //             cur='a';
    //             alice=bob-1;
                
    //         }
    //         else{
    //             return true;
    //         }
    //     }
    //     else if(cur=='a')
    //     {
    //         if(alice<=n){
    //             if(n==alice){
    //                 return true;
    //             }
    //                n=n-alice;
    //             cur='b';
    //             bob=alice-1;
                
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //    }
    //    return false;











   if(n<10){
    return false;
   }

          n=n-10;
       int count=1;
       int num=9;
       while(n>0){
        if(n-num>=0){
        n=n-num;
        count++;
        num=num-1;
        }
        else{
            break;
        }
       }

       if(count%2==0){
        return false;
       }
       return true;
       
    }
}