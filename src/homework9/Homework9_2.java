package homework9;

class Account {
	public static int balance = 0;
	boolean end = false;

	synchronized void deposit(int amount) {
		while (balance >= 3000) {
			try {
				if (!end) {
					System.out.println("媽媽看到餘額在3000以上，暫停匯款");
					wait();
					System.out.println("媽媽被熊大要求匯款！");
				} else {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (balance < 3000 && !end) {
			balance += amount;
			System.out.println("媽媽存了" + amount + "，帳戶共有： " + balance);
			notify();
		}
	}

	synchronized void withdraw(int amount) {
		while (balance == 0) {
			try {
				if (!end) {
					System.out.println("熊大看到帳戶沒錢，暫停提款");
					wait();
					System.out.println("熊大被媽媽告知帳戶已經有錢！");
				} else {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (!end) {
			balance -= amount;
			System.out.println("熊大領了" + amount + "，帳戶共有： " + balance);
			if (balance <= 2000) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
				notify();
			}
		}
	}
}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000); // 每次存2000
		}
		account.end = true;
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000); // 每次提1000
		}
		account.end = true;
	}
}

public class Homework9_2 {
	public static void main(String[] args) {
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
	}
}
