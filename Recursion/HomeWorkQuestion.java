//print all increasing sequence of length K from first n natural number

 // lecture in recursion on subset topic f
  //658
//List<Integer>ans=new ArrayList<>(); //new array list
//int n=arr.length;
//        if(x<arr[0]){
//        for(int i=0;i<k;i++){
//        ans.add(arr[i]);
//            }
//                    return ans;
//        }
//                if(x<arr[0]){
//        for(int i=n-1;i>=k-n;i--){
//        ans.add(arr[i]);
//            }
//                    Collections.sort(ans);
//            return ans;
//        }
//int LowerBound=n;
//        int low=0 ,high=n-1;
//        while(low <= high){
//int mid=low+(high-low)/2;
//            if(arr[mid]>=x){
//LowerBound=mid;
//high=mid-1;
//
//        }
//        else{
//low=mid+1;
//        }
//        }
//        int j=LowerBound ,i = LowerBound-1;
//        while(k>0 && i>=0 && j<n){
//int distancei=Math.abs(x-arr[i]);
//int distancej=Math.abs(x-arr[j]);
//            if(distancei <= distancej){
//        ans.add(arr[i]);
//i--;
//        }
//        else{
//        ans.add(arr[j]);
//j++;
//        }
//k--;
//
//        }
//        while(i<0 &&k>0){
//int distancej=Math.abs(x-arr[j]);
//           ans.add(arr[j]);
//j++;
//k--;
//
//        }
//        while(j==n && k>0){
//int distancej=Math.abs(x-arr[j]);
//           ans.add(arr[i]);
//i--;
//k--;
//
//        }
//        Collections.sort(ans);
//        return ans;
//
//    }
//            }
