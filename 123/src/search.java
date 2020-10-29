public class search{
    public static void main(String[] args) {
        int num[] = new int[10000];
        for (int i = 0; i <10000 ; i++) {
            num[i]= (int) (Math.random()*10000);
        }
        mergeSort(num);
        for(int i:num)
        System.out.println(num[i]);
    }
   static void Merge(int SR[],int TR[],int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        while (i<=mid&&j<=high){
            if(SR[i]<=SR[j])
                TR[k]=SR[i++];
            else  TR[k]=SR[j++];
        }
        while (i<=mid){
            TR[k++]=SR[i++];
        }
        if(j<=high){
            TR[k++]=SR[j++];
        }

    }
  static   void MSort(int SR[],int TR1[],int s,int t){
        int m;
        int TR2[]=new int[10000];
        if(s==t){
            TR1[s]=SR[s];
        }else{
            m=(s+t)/2;
            MSort(SR,TR2,s,m);
            MSort(SR,TR2,m+1,t);
            Merge(TR2,TR1,s,m,t);
        }
    }
  static   void mergeSort(int num[]){
        MSort(num,num,0,9999);
    }
 }