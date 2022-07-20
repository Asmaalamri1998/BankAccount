class BankAccount{
    public double check_bal;
    public double sav_bal;
    public int accounts_number;
    public static int accou_num = 0;
    public static double accou_amount = 0;

    public BankAccount() {
		
		this.check_bal = 0;
		this.sav_bal = 0;
		accou_num++;
	}

    public double getCheck_bal() {
        return check_bal;
    }

   

    public double getSav_bal() {
        return sav_bal;
    }

    public void depositCheck(double deposit) {
		this.check_bal += deposit;
		accou_amount += deposit;
	}
    public void depositsav(double deposit) {
		this.sav_bal += deposit;
		accou_amount += deposit;
	}

    public void withdrawalcheck(double withdrawal) {
		if (withdrawal <= this.check_bal) {
			this.check_bal -= withdrawal;
			accou_amount -= withdrawal;

		} 
        else {
			System.out.println("Cannot complete this process, insufficient balance");
		}
	}
    public void withdrawalsav(double withdrawal) {
		if (withdrawal <= this.sav_bal) {
			this.sav_bal -= withdrawal;
			accou_amount -= withdrawal;

		} 
        else {
			System.out.println("Cannot complete this process, insufficient balance");
		}
	}

    public double totalAmou(){
        System.out.println(" total amount of the account is " + (check_bal+ sav_bal) );
        return check_bal+ sav_bal;
    }



}