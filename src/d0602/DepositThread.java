//package d0602;
//
//public class DepositThread implements Runnable{
//
//    private final Bank bank;
//
//    private final int amount;
//
//    public DepositThread(Bank bank, int amount){
//        this.bank = bank;
//        this.amount = amount;
//    }
//
//    @Override
//    public void run(){
//        System.out.printf("%s 계좌에 %d원을 적립합니다", "홍길동", amount);
//        bank.deposit("홍길동", amount);
//    }
//}
