package oppsyt;
class car {    // class is a blue print
    int NoOfWheel;
    String colour; // this  4 are instance variable
    float CurrentFuelinliter;
    float AddFuel;
    String companyName;

    //methods of car and this are instance methods
    public void Start(){
        if(CurrentFuelinliter <=0 ){
            System.out.println("car will not start  ");
        }
        else if( CurrentFuelinliter ==5){
            System.out.println("car is reserved mode, please refuel it as soon as possible ");
        }
        else{
            System.out.println("car is started .... bruhhhhhh");


        }

    }
    public void drive(){
        System.out.println("car is driving ");
        CurrentFuelinliter--;
    }

    public void   Addfuel(float Addfuel ){
        CurrentFuelinliter  +=Addfuel;

    }


}



