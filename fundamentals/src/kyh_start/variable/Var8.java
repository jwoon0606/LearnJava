package kyh_start.variable;

public class Var8 {
    public static void main(String[] args) {
        byte b = 127;   // -128 ~ 127
        short s = 32767; // -32,767 ~ 32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,648

        long l = 9223372036854775807L;

        float f = 10.0f;
        double d = 10.0;    // float 보다 정밀도가 더 높음
        // 웬만하면 float 보다는 double 을 쓴다.

        // 거의 안쓰는 것들
        // byte 는 너무 작아서 웬만하면 안씀(파일 전송할 때는 씀)
        // short 도 표현길이가 너무 작아서 안씀
        // float 정밀도가 너무 낮다.
        // char 문자 하나를 표현하는 일은 거의 없다.
        // 보통 String a = "b"; 이렇게 씀

        // 자주 사용하는 타입
        // 정수: 기본은 int, 20억 넘을 것 같으면 long
        // 실수는 그냥 double
        // 불리언형은 조건문에서 자주 사용
        // 문자면 거의 String (문자 하나여도 String)
    }
}
