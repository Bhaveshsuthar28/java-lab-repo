class employe{
    public String firstName , lastName;
    public int income ;
    employe(String first , String last , int salary){
        this.firstName = first;
        this.lastName = last;
        Salary(salary);
    }

    public void Salary(int income){
        if(income > 0){
            this.income = income;
        }
        else{
            this.income = 0;
        }
    }

    public void statement(){
        System.out.println("\n\n");
        System.out.println("Name : " + firstName + " " +  lastName);
        System.out.println("Income Monthly : " + income + "\nIncome yearly : " + income*12);
    }

    public void increment(float percentage){
        System.out.println("\n\n");
        System.err.println("Name : " + firstName + " " +  lastName);
        double net = income + (income * (percentage /100));
        System.out.println("Income Before : " + income + "\nIncome after(monthly) : " + net);
    }
}

public class q3 {
    public static void main(String[] args) {

        employe e1 = new employe("Bhavesh", "Suthar", 150000);
        employe e2 = new employe("Harsh", "Upadhayay", 120000);
        
        e1.statement();
        e1.increment(10);

        e2.statement();
        e2.increment(12);
    }
}