package pack;

import pack.a.User; // 자주 사용하는 걸 임포트 추천

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}