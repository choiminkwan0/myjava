package exception_ex.account;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        // 예금하기
        account.deposit(10000);
        System.out.println("에금액: " + account.getBalance());
        // 참조변수.get필드

        // 출금하기
        try {
            account.withdraw(30000);
        } catch(BalanceEx e) { // e 예외 객체 생성
            String message = e.getMessage();
            /* getMessage() 예외 발생시킬 때 
            생성자 매개값으로 사용한 메시지 리턴 */ 
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
            /* printStackTrace 
                - 예외 발생 코드 추적한 내용을 모두 콘솔에 출력
                - 프로그램 테스트하면서 오류 찾을 때 유용하게 활용 */
        }
    }
    
}
