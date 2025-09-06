  double point=0.1;
        for(int i=0;i<2;i++){
            while(mid*mid<=n){
                mid+=point;
            }
            mid-=point;
            point=point/10;

        }