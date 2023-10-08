class ParkingSystem {
//     int big, medium, small;
//     public ParkingSystem(int big, int medium, int small) {
//         this.big=big;
//         this.medium=medium;
//         this.small=small;
        
//     }
    
// public boolean addCar(int carType) {
//     switch (carType) {
//       case 1 : return big-- > 0;
//       case 2 : return medium-- > 0;
//       case 3 : return small-- > 0;
//     }
//     return false;
//     }


// int[] m;
//     public ParkingSystem(int big, int medium, int small) {
//         m = new int[]{big, medium, small};
//     }
    
//     public boolean addCar(int carType) {
//      return m[carType-1]-- > 0;
//     }


  int arr[];
    public ParkingSystem(int big, int medium, int small) {
       arr=new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        int a=arr[carType-1];
        if(a>0){
        arr[carType-1]--;
        return true;
        }
        else
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */